package ru.bildovich;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.hamcrest.number.IsCloseTo.closeTo;

public class MaxTest {
    @Test
    public void max() throws Exception {
        Max calc = new Max();
        int result = calc.max(3, 1);
        assertThat(result, is(3));
    }

}