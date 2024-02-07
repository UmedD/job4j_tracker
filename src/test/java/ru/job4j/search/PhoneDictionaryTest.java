package ru.job4j.search;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

class PhoneDictionaryTest {
    @Test
    public void whenFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        ArrayList<Person> persons = phones.find("Petr");
        assertThat(persons.get(0).getSurname()).isEqualTo("Arsentev");
    }

    @Test
    public void whenFindByPhone() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Andrey", "Arsentev", "534872", "Krasnodar")
        );
        ArrayList<Person> persons = phones.find("5348");
        assertThat(persons.get(0).getPhone()).isEqualTo("534872");
    }

    @Test
    public void whenIsEmpty() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Andrey", "Arsentev", "534872", "Krasnodar")
        );
        ArrayList<Person> persons = phones.find("Nike");
        assertThat(persons.isEmpty());
    }
}