package ru.job4j.inheritance;

public class PizzaExtraCheese extends Pizza {
    private static final String COMPONENT = " + extra cheese";

    public String name() {
        return super.name() + COMPONENT;
    }
}
