package ru.job4j.poly;

public class Bus implements Vehicle {
    public Bus() {
    }

    @Override
    public void move() {
        System.out.println("Go to adventure");
    }
}
