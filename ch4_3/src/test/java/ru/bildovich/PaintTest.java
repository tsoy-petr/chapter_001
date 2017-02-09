package ru.bildovich;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.hamcrest.number.IsCloseTo.closeTo;

public class PaintTest {
    @Test
    public void addPiramid() throws Exception {
        String a =  "          *\n" +
                    "         ***\n" +
                    "        *****\n" +
                    "       *******\n" +
                    "      *********\n" +
                    "     ***********\n" +
                    "    *************\n" +
                    "   ***************\n" +
                    "  *****************\n" +
                    " *******************\n" +
                    "*********************\n";
        Paint paint = new Paint();
        String result = paint.piramid(10);
        assertThat(result, is(a));
    }

}
