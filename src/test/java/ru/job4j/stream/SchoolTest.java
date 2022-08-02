package ru.job4j.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SchoolTest {
    @Test
    public void whenCollectionClassA() {
        List<Student> students = List.of(
                new Student(10, "Surname1"),
                new Student(40, "Surname4"),
                new Student(50, "Surname5"),
                new Student(70, "Surname7"),
                new Student(90, "Surname9")

        );
        School sc = new School();
        Predicate<Student> pr = student -> student.getScore() >= 70;
        List<Student> rsl = sc.collect(students, pr);
        List<Student> expected = new ArrayList<>();
        expected.add(new Student(70, "Surname7"));
        expected.add(new Student(90, "Surname9"));
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenCollectionClassB() {
        List<Student> students = List.of(
        new Student(20, "Surname2"),
        new Student(35, "Surname3"),
        new Student(50, "Surname4"),
        new Student(60, "Surname5"),
        new Student(80, "Surname6")
        );
        School sc = new School();
        Predicate<Student> pr = student -> student.getScore() >= 50 && student.getScore() < 70;
        List<Student> rsl = sc.collect(students, pr);
        List<Student> expected = new ArrayList<>();
        expected.add(new Student(50, "Surname4"));
        expected.add(new Student(60, "Surname5"));
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenCollectionClassC() {
        List<Student> students = List.of(
                new Student(10, "Surname2"),
                new Student(30, "Surname3"),
                new Student(40, "Surname4"),
                new Student(60, "Surname5"),
                new Student(90, "Surname6")
        );
        School sc = new School();
        Predicate<Student> pr = student -> student.getScore() < 50;
        List<Student> rsl = sc.collect(students, pr);
        List<Student> expected = new ArrayList<>();
        expected.add(new Student(10, "Surname2"));
        expected.add(new Student(30, "Surname3"));
        expected.add(new Student(40, "Surname4"));
        assertThat(rsl, is(expected));
    }

}