package com.java.class05;

import java.util.Scanner;

public class ScannerClassExample {
    public static void main(String[] args) {
//EXAMPLE 1
        System.out.println("Example 1");
        //Syntax for user input, Class 5 video at 1:10:00
       Scanner sc = new Scanner(System.in);

       //sc.nextInt() -> num 1, num2 -> User input (in output box)
        int num1 = sc.nextInt(), num2 = sc.nextInt();

        System.out.println(num1 + num2);

        System.out.println();

        System.out.println("Example 2");
//EXAMPLE 2
//Take 2  numbers from user and print multiplication of that number (1:50:00)
        int num3 = sc.nextInt(), num4 = sc.nextInt();
        System.out.println(num3 * num4);

        System.out.println();

//EXAMPLE 3
//Take 2  numbers from user and print greater number out of the two numbers
        System.out.println("Example 3");
        int num5 = sc.nextInt(), num6 = sc.nextInt();
        if(num5 > num6)
        {System.out.println(num5);}
        else
            System.out.println(num6);














    }
}