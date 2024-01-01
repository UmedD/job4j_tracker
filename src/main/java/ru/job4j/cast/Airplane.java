package ru.job4j.cast;

public class Airplane implements Vehicle {
    @Override
    public void move() {
        System.out.println("Летаю по воздуху");
    }

    @Override
    public void brake() {
        System.out.println("Тормоза срабатывают при посадки");
    }
}
