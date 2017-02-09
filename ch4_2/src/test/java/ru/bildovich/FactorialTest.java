package ru.bildovich;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.hamcrest.number.IsCloseTo.closeTo;

public class FactorialTest {
    @Test
    public void addTest() throws Exception {
        Factorial factorial = new Factorial();
        int result = factorial.factorial(4);
        assertThat(result, is(24));
    }

}
