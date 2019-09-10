package com.capgemini.samples;

import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.internal.matchers.Null;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.when;

public class AppTest
{
    private Calculator calculator = new Calculator();

    @Test
    public void assertAddition()
    {
        //setup
        calculator = Mockito.mock(Calculator.class);
        when(calculator.addition(Mockito.anyInt(), Mockito.anyInt())).thenReturn(9);

        //execute
        int result = calculator.addition(5,4);

        //verify
        assertThat(result).isEqualTo(9);

    }

    @Test
    public void assertAdditionNull()
    {
        // setup & execute
        Throwable thrown = catchThrowable(() -> calculator.addition(null , 4));
        // verify
        assertThat(thrown).isInstanceOf(NullPointerException.class);

    }

    @Test
    public void assertMultiplication()
    {
        //setup
        calculator = Mockito.mock(Calculator.class);
        when(calculator.multiplication(Mockito.anyInt(), Mockito.anyInt())).thenReturn(20);

        //execute
        int result = calculator.multiplication(200000000,200000000);

        //verify
        assertThat(result).isEqualTo(20);

    }





}

