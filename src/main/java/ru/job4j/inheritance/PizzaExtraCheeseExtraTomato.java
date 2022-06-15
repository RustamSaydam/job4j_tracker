package ru.job4j.inheritance;

public class PizzaExtraCheeseExtraTomato extends PizzaExtraCheese {
    private static final String COMPONENT2 = " + extra tomato";

    public String name() {
        return super.name() + COMPONENT2;
    }
}


