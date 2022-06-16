package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book harryPotter = new Book("Harry Potter", 400);
        Book severus = new Book("Severus", 290);
        Book way = new Book("Way", 350);
        Book cleanCode = new Book("Clean Code", 250);
        Book[] books = new Book[4];
        books[0] = harryPotter;
        books[1] = severus;
        books[2] = way;
        books[3] = cleanCode;
        for (int index = 0; index < books.length; index++) {
            Book bo = books[index];
            System.out.println(bo.getName() + " - " + bo.getPages());
        }
        System.out.println("Replace Harry Potter to Clean Code");
        Book change = books[0];
        books[3] = books[0];
        books[3] = change;
        for (int index = 0; index < books.length; index++) {
            Book bo = books[index];
            System.out.println(bo.getName() + " - " + bo.getPages());
        }
        System.out.println("Only Clean Book");
        for (int index = 0; index < books.length; index++) {
            Book bo = books[index];
            if ("Clean Book".equals(bo.getName())) {
                System.out.println(bo.getName() + " - " + bo.getPages());
            }
        }
    }
}