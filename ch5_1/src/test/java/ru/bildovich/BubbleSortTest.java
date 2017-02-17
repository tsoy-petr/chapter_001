package ru.bildovich;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Тест Class Tern.
 *
 * @autor: bildovich
 * @since: 17.02.2017
 */
public class BubbleSortTest {

    /**
     * Тест метода возвращающий перевернутый массив.
     *
     * @throws Exception assertThat
     */
    @Test
    public void bubbleSortTest() throws Exception {
        int[] expectArray = {3, 6, 10, 12, 13, 24, 70, 90};
        BubbleSort bs = new BubbleSort();
        int[] resultArray = {12, 13, 24, 10, 3, 6, 90, 70};
        bs.bubbleSort(resultArray);
        assertThat(resultArray, is(expectArray));
    }

}
