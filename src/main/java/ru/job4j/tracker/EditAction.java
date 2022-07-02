package ru.job4j.tracker;

public class EditAction implements UserAction {
    @Override
    public String name() {
        return "Edit Action";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Edit item ==");
        int id = input.askInt("press id of item you want to replace: ");
        String name = input.askStr("press name of new item: ");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            System.out.println("Item with ID " + id + " edited");
        } else {
            System.out.println("Item with ID " + id + " is not edited");
        }
        return true;
    }
}
