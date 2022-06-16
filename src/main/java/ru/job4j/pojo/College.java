package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Saydam Rustam");
        student.setGroup("Programmer");
        student.setDate("2021");

        System.out.println(student.getFio() + " He is a student - " + student.getGroup() + " : " + student.getDate());
    }
}
