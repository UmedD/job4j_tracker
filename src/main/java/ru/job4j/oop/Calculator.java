package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int n) {
        return n - x;
    }

    public static int divide(int n) {
        return n / x;
    }

    public double sumAllOperation(int n) {
        return sum(n) + multiply(n) + minus(n) + divide(n);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.sumAllOperation(10));
    }
}
