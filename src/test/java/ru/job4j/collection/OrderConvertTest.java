package ru.job4j.collection;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.*;

public class OrderConvertTest {

    @Test
    public void whenSingleOrder() {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order("3464", "Russ"));
        HashMap<String, Order> map = OrderConvert.process(orders);
        assertThat(map.get("3464"), is(new Order("3464", "Russ")));
    }

    @Test
    public void whenDuplicateTest() {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order("3464", "Russ"));
        orders.add(new Order("3464", "Russ"));
        orders.add(new Order("3234", "Rustam"));
        orders.add(new Order("3214", "Rustam"));
        orders.add(new Order("3224", "Rustam"));
        HashMap<String, Order> map = OrderConvert.process(orders);
        int expectedSize = 4; // проверяет количество одинаковых названий (тут их 4) если добавить строку с друг именем то будет 5;
        int outSize = map.size();
        assertEquals(expectedSize, outSize);
    }
}