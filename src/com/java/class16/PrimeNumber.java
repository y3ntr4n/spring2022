package com.java.class16;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args){
Scanner sc = new Scanner(System.in);
//Write a program that asks the user to enter a number to find if its a prime number
        //Prime number is a number that is divisible by 1 and itself
        System.out.println("Enter a Number to see if it is a Prime Number");
        int num = sc.nextInt();
        int count = 0;

        for (int i = 1; i <= num; i++) {
            // condition for nonprime number
            if (num % i == 0) {
                count++;
            }
        }
        if(count == 2){
            System.out.println(num + " is a prime number.");
        }else{
            System.out.println(num + " is not a prime number.");

        }



    }





}

