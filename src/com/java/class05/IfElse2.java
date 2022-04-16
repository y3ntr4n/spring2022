package com.java.class05;

public class IfElse2 {
    public static void main(String[] args){

//MODULO EXAMPLES
        System.out.println(15 % 2);//1, odd number modulo even number, remainder is odd
        System.out.println(52 % 2);//0, even number modulo even number, remainder is 0
        System.out.println(21 % 2);//1
        System.out.println(4 % 2);//0

        System.out.println();

//EXAMPLE 1
//Write a program to check given number is odd or even
        int num = 6;

        if(num % 2 == 0) //6 % 2 = 0 == 0, true, will print
        {System.out.println("2. Even ");}

        else //when if is true, else will not print
        {System.out.println("3. Odd");}



        System.out.println();

System.out.println();

//EXAMPLE 2
//Write a program to check given number is odd or even
        num = 51;

        if(num % 2 == 0) //51 % 2 = 1 == 0, false, will not print
        {System.out.println("2. Even ");}

        else //when if is false, else print
        {System.out.println("3. Odd");}




    }
}


