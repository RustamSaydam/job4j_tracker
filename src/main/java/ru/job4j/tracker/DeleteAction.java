package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return "Delete Item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Delete item ===");
        int id = input.askInt("Enter id ");
        if (tracker.delete(id)) {
            System.out.println("Item with ID " + id + " delete");
        } else {
            System.out.println("There are no items with such id!");
        }
        return true;
    }
}
