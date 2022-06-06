package ru.job4j.oop;

public class Cat {
    private String food;
    private String name;

    public void eat(String meat) {
        this.food = meat;
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public void show() {
        System.out.println(this.food);
        System.out.println(this.name);
    }

    public static void main(String[] args) {
        Cat gav = new Cat();
        gav.eat("Kotleta");
        gav.giveNick("Gav");
        gav.show();
        System.out.println("There are gav's food.");
        Cat black = new Cat();
        black.eat("Fish");
        black.giveNick("Black");
        black.show();
        System.out.println("There are black food.");
    }

}


