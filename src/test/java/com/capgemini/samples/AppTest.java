package com.capgemini.samples;

import org.junit.Test;
import org.mockito.Mockito;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

public class AppTest
{
    private Calculator addition = new Calculator();

    @Test
    public void assertAddition()
    {
        addition = Mockito.mock(Calculator.class);
        when(addition.Addition(Mockito.anyInt(), Mockito.anyInt())).thenReturn(4);

    }





}

