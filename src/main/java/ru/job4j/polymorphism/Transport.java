package ru.job4j.polymorphism;

public interface Transport {
    void drive();

    void passenger(int numPass);

    int refuel(int fuel);
}
