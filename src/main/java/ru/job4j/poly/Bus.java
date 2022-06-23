package ru.job4j.poly;

import java.util.Scanner;

public class Bus implements Transport {
    private static final int FUELPRICE = 1;
    private int passengers;

    @Override
    public void ride() {
        Scanner scanner = new Scanner(System.in);
        int push = scanner.nextInt();
    }

    @Override
    public void passengers(int passengers) {
        this.passengers = passengers;

    }

    @Override
    public double reFuel(int fuel) {
        return fuel * FUELPRICE;
    }
}
