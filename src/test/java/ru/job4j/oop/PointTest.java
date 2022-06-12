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
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when000to333then5() {
        double expected = 5.19;
        Point a = new Point(0, 0, 0);
        Point b = new Point(3, 3, 3);
        double dist = a.distance3d(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when686to425then6() {
        double expected = 6.403;
        Point a = new Point(6, 8, 6);
        Point b = new Point(4, 2, 5);
        double dist = a.distance3d(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when717to524then6() {
        double expected = 3.741;
        Point a = new Point(7, 1, 7);
        Point b = new Point(5, 2, 4);
        double dist = a.distance3d(b);
        Assert.assertEquals(expected, dist, 0.01);
    }
}