package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.*;

public class ItemTest {
   @Test

    public void whenAscByName() {
       Item mazda = new Item("Mazda");
       Item nissan = new Item("Nissan");
       Item toyota = new Item("Toyota");
       List<Item> items = new ArrayList<>();
       items.add(mazda);
       items.add(nissan);
       items.add(toyota);
       List<Item> expected = List.of(mazda, nissan, toyota);
       Collections.sort(items, new ItemAscByName());
       assertThat(items, is(expected));
   }

   @Test
   public void whenDescByName() {
       Item toyota = new Item("Toyota");
       Item nissan = new Item("Nissan");
       Item mazda = new Item("Mazda");
       List<Item> items = new ArrayList<>();
       items.add(toyota);
       items.add(mazda);
       items.add(nissan);
       List<Item> expected = List.of(nissan, mazda, toyota);
       Collections.sort(items, new ItemDescByName());
   }
}