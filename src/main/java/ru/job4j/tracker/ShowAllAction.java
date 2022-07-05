package ru.job4j.tracker;

public class ShowAllAction implements UserAction {

    private final Output out;

    public ShowAllAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Show All Items";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Show all items ===");
        Item[] allFiles = tracker.findAll();
        if (allFiles.length > 0) {
            for (Item item : allFiles) {
                out.println(item);
            }
        } else {
            out.println("There are no items in storage");
        }
        return true;
    }
}
