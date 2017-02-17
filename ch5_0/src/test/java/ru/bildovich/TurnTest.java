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
public class TurnTest {

    /**
     * Тест метода возвращающий перевернутый массив.
     *
     * @throws Exception assertThat
     */
    @Test
    public void backTest() throws Exception {
        int[] expectArray = {3, 2, 1};
        Turn turn = new Turn();
        int[] resultArray = {1, 2, 3};
        turn.back(resultArray);
        assertThat(resultArray, is(expectArray));
    }

}
