package ru.bildovich;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.hamcrest.number.IsCloseTo.closeTo;

public class CounterTest {
    @Test
    public void addTest() throws Exception {
        Counter counter = new Counter();
        int result = counter.add(1, 5);
        assertThat(result, is(6));
    }

}