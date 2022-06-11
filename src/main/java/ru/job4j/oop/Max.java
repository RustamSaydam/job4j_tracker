package ru.job4j.oop;

public class Max {

    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int left, int right, int c) {
        return max(left, max(right, c));
    }

    public static int max(int left, int right, int c, int d) {
        return max(max(left, right), max(c, d));
    }
}

