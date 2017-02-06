package ru.bildovich;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.hamcrest.number.IsCloseTo.closeTo;

/**
 * Created by mac on 03.02.17.
 */
public class CalculateTest {
    @Test
    public void add() throws Exception {
        Calculate calc = new Calculate();
        calc.add(3.4, 5.6);
        double result = calc.getResult();
        assertThat(result, is(9.0));
    }

    @Test
    public void substruct() throws Exception {
        Calculate calc = new Calculate();
        calc.substruct(7.0d, 5.6d);
        double result = calc.getResult();
        assertThat(result, closeTo(1.4, 0.40000000000000036));
    }

    @Test
    public void div() throws Exception {
        Calculate calc = new Calculate();
        calc.div(7.0, 2.0);
        double result = calc.getResult();
        assertThat(result, is(3.5));
    }

    @Test
    public void multiple() throws Exception {
        Calculate calc = new Calculate();
        calc.multiple(3.5, 2.0);
        double result = calc.getResult();
        assertThat(result, is(7.0));
    }

    @Test
    public void getResult() throws Exception {
        Calculate calc = new Calculate();
        double result = calc.getResult();
        assertThat(result, is(0.0));
    }

}