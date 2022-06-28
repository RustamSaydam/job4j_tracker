package ru.job4j.tracker;

public class StartUI {
    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            showMenu();
            int select = input.askInt("select: ");
            if (select == 0) {
                addNewItem(input, tracker);
            } else if (select == 1) {
                showAllItem(input, tracker);
            } else if (select == 2) {
                editItem(input, tracker);
            } else if (select == 3) {
                deleteItem(input, tracker);
            } else if (select == 4) {
                findById(input, tracker);
            } else if (select == 5) {
                findByName(input, tracker);
            } else if (select == 6) {
                run = false;
            }
        }
    }

    public static void addNewItem(Input consoleInput, Tracker tracker) {
        Item item = new Item(consoleInput.askStr("Enter name of new Item: "));
        tracker.add(item);
        System.out.println("Item added " + item);
    }

    public static void showAllItem(Input input, Tracker tracker) {
        System.out.println("=== Show all items ===");
        Item[] allFiles = tracker.findAll();
        if (allFiles.length > 0) {
            for (Item item : allFiles) {
                System.out.println(item);
            }
        } else {
            System.out.println("There are no items in storage");
        }
    }

    public static void editItem(Input input, Tracker tracker) {
        System.out.println("=== Edit item ==");
        int id = input.askInt("press id of item you want to replace: ");
        String name = input.askStr("press name of new item: ");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            System.out.println("suссess");
        } else {
            System.out.println("There are no items with such id!");
        }
    }

    public static void deleteItem(Input input, Tracker tracker) {
        System.out.println("=== Delete item ===");
        int id = input.askInt("Enter id ");
        if (tracker.delete(id)) {
            System.out.println("Item with ID " + id + " delete");
        } else {
            System.out.println("There are no items with such id!");
        }
    }

    public static void findById(Input input, Tracker tracker) {
        System.out.println("=== Find item by id ===");
        int id = input.askInt("Enter id");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println("your item is: ");
            System.out.println(id);
        } else {
            System.out.println("There are no items with such id!");
        }
    }

    public static void findByName(Input input, Tracker tracker) {
        System.out.println("=== Find items by name ===");
        String name = input.askStr("Enter name");
        Item[] items = tracker.findByName(name);
        if (items.length > 0) {
            for (Item item : items) {
                System.out.println(item);
            }
        } else {
            System.out.println("There are no items with such ");
        }
    }

    public void showMenu() {
        String[] menuItems = {
                "Add new Item", "Show all items", "Edit item",
                "Delete item", "Find item by id", "Find items by name",
                "Exit Program"};
        System.out.println("Menu:");
        for (int i = 0; i < menuItems.length; i++) {
            System.out.println(i + ". " + menuItems[i]);
        }
    }

    public static void main(String[] args) {
        ConsoleInput consoleInput = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(consoleInput, tracker);
    }
}





