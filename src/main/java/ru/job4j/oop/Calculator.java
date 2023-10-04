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

    public void sumAllOperation(int n) {
        System.out.println(sum(n));
        System.out.println(multiply(n));
        System.out.println(minus(n));
        System.out.println(divide(n));
        System.out.println("Summ all operation: = " + (sum(n) + multiply(n) + minus(n) + divide(n)));
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.sumAllOperation(10);
    }
}
