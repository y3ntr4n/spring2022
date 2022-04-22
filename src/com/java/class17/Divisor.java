package com.java.class17;

import java.util.Scanner;

public class Divisor {
    public static void main(String[] args){
        //write a program to find the divisor of a number
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a number");
        int num = sc.nextInt();

        //Divisor - a number that divides into another number without a remainder

        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                System.out.println(i);
            }
        }








    }
}
