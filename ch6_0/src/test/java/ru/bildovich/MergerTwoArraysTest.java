package ru.bildovich;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Тест Class MergerTwoArraysTest.
 *
 * @autor: bildovich
 * @since: 17.02.2017
 */
public class MergerTwoArraysTest {

    /**
     * Class contTwoMass.
     *
     * @throws Exception assertThat
     */
    @Test
    public void contTwoMassTest() throws Exception {
        int[] a = {3, 6, 10, 12, 13, 24, 70, 90};
        int[] b = {4, 2000};
        MergerTwoArrays mta = new MergerTwoArrays();
        int[] expectArray = {3, 4, 6, 10, 12, 13, 24, 70, 90, 2000};
        int[] resultArray = mta.contTwoMass(a, b);
        assertThat(resultArray, is(expectArray));
    }

}
