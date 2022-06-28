package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import org.hamcrest.Matchers;

public class StartUITest {

    @Test
    public void whenAddItem() {
        String[] answers = {"Fix PC"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        StartUI.addNewItem(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item("Fix PC");
        assertThat(created.getName(), is(expected.getName()));
    }

    @Test
    public void whenCreateItem() {
        String[] answers = {"Test Item"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        StartUI.editItem(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item("Test Item");
        assertThat(created.getName(), is(expected.getName()));
    }

    @Test
    public void createItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("New Item");
        tracker.add(item);
        String[] answers = {String.valueOf(item.getId()),"edit item"};
        StartUI.editItem(new StubInput(answers), tracker);
        Item edited = tracker.findById(item.getId());
        assertThat(edited.getName(), is("edit item"));
    }

    @Test
    public void deleteItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("New Item");
        tracker.add(item);
        String[] answers = {String.valueOf(item.getId()), "delete"};
        StartUI.deleteItem(new StubInput(answers), tracker);
        Item delete = tracker.findById(item.getId());
        assertThat(delete, Matchers.is(nullValue()));
    }
}