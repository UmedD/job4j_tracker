
package ru.job4j.checkstyle;

public class Broken {
    private static final String NEW_VALUE = "";
    private final int sizeOfEmpty = 10;
    private String name;
    private String surname;

    public Broken() { }

    public void echo() { }

    public void method() { }

    public void media(Object obj) {
        if (obj != null) {
            System.out.println(obj);
        }
    }
}