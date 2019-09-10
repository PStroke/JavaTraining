package com.capgemini.samples;

public class Calculator {

    public Calculator()
    {

    }

    public Integer Addition(Integer i, Integer j)
    {
        if(i == null && j == null)
            throw new NullPointerException();

        return i+j;
    }


}
