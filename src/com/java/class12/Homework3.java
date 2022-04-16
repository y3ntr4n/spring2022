package com.java.class12;
//1. Write a program to print table of given number. If user enters 3 then print table of 3 like below
//   3 6 9 12 15 18 21 24 27 30

//2. Write a program to print numbers that are divisible by 3 and 5 from 1 to 50

//3. Write a program to print numbers that are not divisible by 3 and divisible by 7

public class Homework3 {
    public static void main(String[] args){
//print program not divisible by 3 and divisible by 7
        int i = 1;
        while (i <= 50) {
            if (i % 3 == 0 && i % 7 == 0)
            {System.out.println(i);}
            i++;
        }
    }
}
