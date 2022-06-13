package ru.job4j.inheritance;

public class PizzaExtraCheeseExtraTomato extends PizzaExtraCheese {
    private static final String ZAPRAVKA2 = " + extra tomato";

    public String name() {
        return super.name() + ZAPRAVKA2;
    }
}


