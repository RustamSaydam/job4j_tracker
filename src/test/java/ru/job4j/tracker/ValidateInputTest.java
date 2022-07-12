package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ValidateInputTest {

    @Test
    public void whenInvalidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"one", "1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter Menu: ");
        assertThat(selected, is(1));
    }

    @Test
    public void whenInvalidMoreActions() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"1", "2", "3", "4"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter Menu: ");
        assertThat(out.toString(), is(""));
    }

    @Test
    public void whenInvalidTest() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"3"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter Menu");
        assertThat(selected, is(3));
    }

    @Test
    public void whenInvalidMinus() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"-4"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter Menu");
        assertThat(selected, is(-4));
    }
}