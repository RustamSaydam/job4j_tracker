package ru.job4j.poly;

public class Train implements Vehicle {
    public Train() {
    }

    @Override
    public void move() {
        System.out.println("Start Cho-Choooox");
    }
}
