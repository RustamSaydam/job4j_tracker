package ru.job4j.collection;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class JobTest {
    @Test
    public void whenCompatorByNameAndPrority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl Task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorByNameAndProrityDown() {
        Comparator<Job> cmpNamePriority = new JobDescByNameDown().thenComparing(new JobDescByPriorityDown());
        int rsl = cmpNamePriority.compare(
                new Job("Fix bug", 1),
                new Job("Impl Task", 0)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenDescByName() {
        List<Job> list = new ArrayList<>();
        list.add(new Job("Fix Bug", 2));
        list.add(new Job("Refactor code", 3));
        list.sort(new JobDescByName());
        assertThat(list.get(1).getName(), is("Fix Bug"));
    }

    @Test
    public void whenDescByNameDown() {
        List<Job> list = new ArrayList<>();
        list.add(new Job("Fix bug", 5));
        list.add(new Job("Refactor code", 9));
        list.sort(new JobDescByNameDown());
        assertThat(list.get(1).getName(), is("Refactor code"));
    }

    @Test
    public void whenDescByPriority() {
        List<Job> list = new ArrayList<>();
        list.add(new Job("Fix bug", 5));
        list.add(new Job("Refactor code", 9));
        list.sort(new JobDescByPriority());
        assertThat(list.get(1).getPriority(), is(5));
    }

    @Test
    public void whenDescByPriorityDown() {
        List<Job> list = new ArrayList<>();
        list.add(new Job("Fix bug", 5));
        list.add(new Job("Refactor code", 9));
        list.sort(new JobDescByPriorityDown());
        assertThat(list.get(1).getPriority(), is(9));
    }
}