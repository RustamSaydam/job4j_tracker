package ru.job4j.poly;

public class Plane implements Vehicle {
    public Plane() {
    }

    @Override
    public void move() {
        System.out.println("I believe I can fly");
    }
}
