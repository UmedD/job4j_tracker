package ru.job4j.polymorphism;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("ехать 100 км без остановки! ");
    }

    @Override
    public void passenger(int numPass) {
        System.out.println("С каждой остановки забрать пассажиров");
    }

    @Override
    public int refuel(int fuel) {
        System.out.println("После 100 км заправиться");
        return 0;
    }
}
