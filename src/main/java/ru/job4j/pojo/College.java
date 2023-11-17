package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Rustamov Rustam");
        student.setGroup(3344);
        student.setDateReceipt(new Date());

        System.out.println(student.getFio() + " group : " + student.getGroup() + " date of receipt " + student.getDateReceipt());
    }
}
