package ru.bildovich;

import  java.io.*;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import java.io.PrintStream;

public class CalculateTest{

    @Test
    public void whenSetStopInEchoThenReturnThreeStops(){
        Calculate calc = new Calculate();
        String result = calc.echo("stop");
        assertThat(result, is("stop stop stop"));
    }

    @Test
    public void whenSetNullInEchoThenReturnTwoSpaces(){
        Calculate calc = new Calculate();
        String result = calc.echo(null);
        assertThat(result, is("null null null"));
    }
	
	@Test
    public void whenExecuteMainThenPrintToConsole(){
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Calculate.main(null);
        assertThat(out.toString(), is("ahh ahh ahh\r\n"));

    }

}