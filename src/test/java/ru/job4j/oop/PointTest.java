package ru.job4j.oop;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        double out = dist;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when000to333then5() {
        double expected = 5.19;
        Point a = new Point(0, 0, 0);
        Point b = new Point(3, 3, 3);
        double dist = a.distance3d(b);
        double out = dist;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when686to425then6() {
        double expected = 6.403;
        Point a = new Point(6, 8, 6);
        Point b = new Point(4, 2, 5);
        double dist = a.distance3d(b);
        double out = dist;
        Assert.assertEquals(expected, out, 0.01);
    }
}