package ru.bildovich;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Тест Class Paint.
 *
 * @autor: bildovich
 * @since: 17.02.2017
 */
public class PaintTest {

    /**
     * Тест метода возвращающий строку содеожащую приамиду.
     *
     * @throws Exception assertThat
     */
    @Test
    public void addPiramid() throws Exception {
        String a = "          *\n"
                +  "         ***\n"
                +  "        *****\n"
                +  "       *******\n"
                +  "      *********\n"
                +  "     ***********\n"
                +  "    *************\n"
                +  "   ***************\n"
                +  "  *****************\n"
                +  " *******************\n"
                +  "*********************\n";
        Paint paint = new Paint();
        String result = paint.piramid(10);
        assertThat(result, is(a));
    }

}
