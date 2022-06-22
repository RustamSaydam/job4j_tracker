package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        String[] answers = {"Yes", "No", "May be"};
        Scanner input = new Scanner(System.in);
        System.out.println("I am Oracle the great! What do you want to know?");
        String name = input.nextLine();
        System.out.println(answers[new Random().nextInt(3)]);
    }
}
