package ru.job4j.tracker;

public class FindByIdAction implements UserAction {
    @Override
    public String name() {
        return "Find by ID";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Find item by id ===");
        int id = input.askInt("Enter id");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println("your item is: ");
            System.out.println(item);
        } else {
            System.out.println("There are no items with such id!");
        }
        return true;
    }
}
