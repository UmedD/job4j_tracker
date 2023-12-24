package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {
        Item item = new Item();
        Item item2 = new Item();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String time = item.getCreated().format(formatter);
        String time2 = item2.toString();
        System.out.println(time);
        System.out.println(time2);
    }
}
