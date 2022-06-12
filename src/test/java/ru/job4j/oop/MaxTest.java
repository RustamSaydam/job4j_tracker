package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2, 3, 4);
        int expected = 4;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax3To4To1Then9() {
        int result = Max.max(3, 4, 1, 9);
        int expected = 9;
        Assert.assertEquals(result, expected);
    }

}
