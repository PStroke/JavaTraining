package com.capgemini.samples;

public class Calculator {

    public Calculator()
    {

    }

    public Integer addition(Integer i, Integer j) throws NullPointerException
    {
        if(i == null && j == null)
            throw new NullPointerException();

        return i+j;
    }


    public Integer multiplication(Integer i , Integer j) throws NullPointerException
    {
        if(i == null && j == null)
            throw new NullPointerException();

        return i*j;
    }


}
