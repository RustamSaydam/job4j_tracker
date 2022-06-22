package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        System.out.println("Start game 11");
        Scanner input = new Scanner(System.in);
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "First player" : "Second player";
            System.out.println(player + "enter a number from 1 to 3");
            int matches = Integer.parseInt(input.nextLine());
            if (matches > 0 && matches < 4) {
                turn = !turn;
            }
            System.out.println(player + "in" + matches);
            count -= matches;
            System.out.println("remains: " + Math.max(0, count));
        }
        if (!turn) {
            System.out.println("First player win");
        } else {
            System.out.println("Second player win");
        }
    }
}

