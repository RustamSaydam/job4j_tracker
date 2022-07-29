package ru.job4j.function;

import java.sql.Array;
import java.util.*;
import java.util.function.*;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        BiConsumer<Integer, String> biCon = (s, s1) -> map.put(s, s1);
        biCon.accept(1, "one");
        biCon.accept(2, "two");
        biCon.accept(3, "three");
        biCon.accept(4, "four");
        biCon.accept(5, "five");
        biCon.accept(6, "six");
        biCon.accept(7, "seven");

        BiPredicate<Integer, String> biPred = (s, s1) -> s % 2 == 0 || s1.length() == 4;
        for (Integer s : map.keySet()) {
            if (biPred.test(s, map.get(s))) {
                System.out.println("key: " + s + "value: " + map.get(s));
            }
        }

        Supplier<List<String>> sup = () -> new ArrayList<>(map.values());
        Consumer<String> con = (s) -> System.out.println(s);
        Function<String, String> func = s -> s.toUpperCase();
        for (String s : sup.get()) {
            con.accept(func.apply(s));
        }
    }
}

