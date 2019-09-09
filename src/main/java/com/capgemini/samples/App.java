package com.capgemini.samples;

public class App 
{
    public static void main( String[] args )
    {
        int i;
        for(i = 0 ; i < 100 ; i++)
            System.out.println(" MUDA ");

        int d ;
        for(d = 0 ; d < 100;d++)
            System.out.println(" ORA ");


        int c;
        for(c = 0 ; c < 100;c++)
            if(c%2 == 0)
                System.out.println(" ORA ");
            else
                System.out.println("MUDA");

    }
}
