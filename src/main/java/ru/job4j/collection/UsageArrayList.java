package ru.job4j.collection;

import java.util.ArrayList;
import java.util.List;

public class UsageArrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Petr");
        list.add("Ivan");
        list.add("Andrey");

        for (String name : list) {
            System.out.println(name);
        }
    }
}
