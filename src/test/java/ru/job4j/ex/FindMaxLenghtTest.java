package ru.job4j.ex;

import org.junit.Test;

import static org.junit.Assert.*;


public class FindMaxLenghtTest {

    @Test(expected = IllegalArgumentException.class)
    public void whenFindMaxLength() {
        Fact fact = new Fact();
        fact.calc(-1);
    }
}