package ru.job4j.oop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

public class TriangleTest {
    @Test
    public void when00and40and04Then8() {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        Point c = new Point(0, 4);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area();
        double expected = 8;
        assertThat(rsl).isCloseTo(expected, offset(0.001));
    }

    @Test
    public void when01and20and24Then() {
        Point a = new Point(0, 1);
        Point b = new Point(2, 0);
        Point c = new Point(2, 4);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area();
        double expected = 4;
        assertThat(rsl).isCloseTo(expected, offset(0.001));
    }

    @Test
    public void when012and200and241Then() {
        Point a = new Point(0, 1, 2);
        Point b = new Point(2, 0, 0);
        Point c = new Point(2, 4, 1);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area();
        double expected = 4;
        assertThat(rsl).isCloseTo(expected, offset(0.001));
    }
}