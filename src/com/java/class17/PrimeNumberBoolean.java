package com.java.class17;

import java.util.Scanner;

public class PrimeNumberBoolean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//Write a program that asks the user to enter a number to find if its a prime number
        //Prime number is a number that is divisible by 1 and itself
        System.out.println("Enter a Number to see if it is a Prime Number");
        int num = sc.nextInt();
      boolean isPrime = true;

        for (int i = 2; i < num; i++) {
            // condition for nonprime number
            if (num % i == 0) {
               isPrime = false;
               break;
            }
        }
        if (isPrime == true) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}
