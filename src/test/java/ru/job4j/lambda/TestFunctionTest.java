package ru.job4j.lambda;
import java.util.Arrays;
import org.junit.Test;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;


import static org.junit.Assert.*;

public class TestFunctionTest {
    @Test
    public void whenLinearFunctionThenLinearResults() {
        List<Double> result = TestFunction.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenSquareFunctionThenSquareResults() {
        List<Double> result = TestFunction.diapason(5, 8, x -> x * x + 2 * x + 1);
        List<Double> expected = Arrays.asList(36D, 49D, 64D);
        assertThat(result, is(expected));

    }

    @Test
    public void whenExpontFunctionThenResults() {
     List<Double> result = TestFunction.diapason(4, 7, x -> Math.pow(x, 2) + 4);
     List<Double> expected = Arrays.asList(20D, 29D, 40D);
     assertThat(result, is(expected));
    }
}