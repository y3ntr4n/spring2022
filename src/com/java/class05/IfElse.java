package com.java.class05;

public class IfElse {
    public static void main(String[] args){

//EXAMPLE 1

        int num = 5;
        System.out.println("1. Start");

        if(num>0) //5 > 0 ? true, will print
        {System.out.println("2. Positive");}

        else //when if is true, else will not print
        {System.out.println("3. Negative");}

        System.out.println("4. End");

        System.out.println();

//EXAMPLE 2

        //EXAMPLE 1

        num = -5;
        System.out.println("1. Start");

        if(num>0) //-5 > 0 ? false, will not print
        {System.out.println("2. Positive");}

        else //when if is false, else will print
        {System.out.println("3. Negative");}

        System.out.println("4. End");

        System.out.println();

//EXAMPLE 2

        //EXAMPLE 1

        num = -5;
        System.out.println("1. Start");

        if(num>0) //-5 > 0 ? false, will not print
        {System.out.println("2. Positive");}

        else //when if is false, else will print
        {System.out.println("3. Negative");}

        System.out.println("4. End");
        }
    }
