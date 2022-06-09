package ru.job4j.oop;

public class Calculator {
    private static  int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int z) {
        return z - x;
    }

    public int divide(int w) {
        return w / x;
    }

    public int sumAllOperation(int f) {
        return sum(f) + multiply(f) + minus(f) + divide(f);
    }

    public static void main(String[] args) {
        int result = sum(5);
        System.out.println(result);
        Calculator calculator = new Calculator();
        int rsl = calculator.multiply(5);
        System.out.println(rsl);
        int result2 = minus(15);
        System.out.println(result2);
        Calculator calculator2 = new Calculator();
        int rsl2 = calculator2.divide(50);
        System.out.println(rsl2);
        Calculator calculator3 = new Calculator();
        int rsl3 = calculator3.sumAllOperation(15);
        System.out.println(rsl3);
    }
}



