package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ValidateInputTest {
    @Test
    void whenInvalidInput() {
        Output output = new StubOutput();
        Input in = new MockInput(
                new String[]{"one", "1"}
        );
        ValidateInput input = new ValidateInput(output, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(1);
    }

    @Test
    void whenValidInput() {
        Output output = new StubOutput();
        Input in = new MockInput(
                new String[]{"-1", "1"}
        );
        ValidateInput input = new ValidateInput(output, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(-1);
    }

    @Test
    void whenMultyValidInput() {
        Output output = new StubOutput();
        Input in = new MockInput(
                new String[]{"0", "1", "2", "3"}
        );
        ValidateInput input = new ValidateInput(output, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(0);
        int selected2 = input.askInt("Enter menu:");
        assertThat(selected2).isEqualTo(1);
        int selected3 = input.askInt("Enter menu:");
        assertThat(selected3).isEqualTo(2);
        int selected4 = input.askInt("Enter menu:");
        assertThat(selected4).isEqualTo(3);
    }
}