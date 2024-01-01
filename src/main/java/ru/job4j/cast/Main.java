package ru.job4j.cast;

public class Main {
    public static void main(String[] args) {
        Vehicle aiplane = new Airplane();
        Vehicle bus = new Bus();
        Vehicle train = new Train();

        Vehicle[] vehicle = new Vehicle[]{aiplane, bus, train};
        for (Vehicle object : vehicle) {
            object.move();
            object.brake();
        }
    }
}
