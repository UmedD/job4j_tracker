package ru.job4j.pojo;

public class Book {
    private String name;
    private int NumPages;

    public Book(String name, int numPages) {
        this.name = name;
        NumPages = numPages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumPages() {
        return NumPages;
    }

    public void setNumPages(int numPages) {
        NumPages = numPages;
    }
}
