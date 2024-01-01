package ru.job4j.cast;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println("Двигаюсь по специальной полосе");
    }

    @Override
    public void brake() {
        System.out.println("Останавливаюсь только на остановках");
    }
}
