package com.java.class17;

import java.util.Scanner;

public class FindTheResultOfSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//Find the result of 1 + 2 - 3 + 4 + 5 - 6 + 7 + 8 - 9 + 10
        System.out.println("Enter a Number to see if it is a Prime Number");
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            // condition for nonprime number
            if (i % 3 == 0) {
                sum = sum - 1;
            } else {
                sum = sum + i;
            }
        }
        System.out.println(sum);

    }
}