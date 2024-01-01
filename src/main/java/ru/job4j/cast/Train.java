package ru.job4j.cast;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println("Двигаюсь по рельсам");
    }

    @Override
    public void brake() {
        System.out.println("Тормоза срабатывают в специальных местах");
    }
}
