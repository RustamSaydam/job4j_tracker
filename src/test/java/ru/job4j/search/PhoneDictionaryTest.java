package ru.job4j.search;

import org.junit.Test;

import java.util.ArrayList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class PhoneDictionaryTest {
    @Test
    public void whenFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        ArrayList<Person> persons = phones.find("Petr");
        assertThat(persons.get(0).getSurname(), is("Arsentev"));
    }

    @Test
    public void whenNameNotFound() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                (new Person("Petr", "Arsentev", "534872", "Bryansk"))
        );
        ArrayList<Person> persons = phones.find("petr");
        assertThat(persons.size(), is(0));
    }
}



