package ru.job4j.search;

import org.junit.Test;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class PriorityQueueTest {

    @Test
    public void whenHigherPriority() {
        var queue = new PriorityQueue();
        queue.put(new Task("Enemy", 5));
        queue.put(new Task("Hero", 1));
        queue.put(new Task("Low", 2));
        var result = queue.take();
        assertThat(result.getDesc(), is("Hero"));
    }
}


