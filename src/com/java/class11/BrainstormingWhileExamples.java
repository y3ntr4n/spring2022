package com.java.class11;
//Write a program to print
//6 12 18 24 30 36 42 48 54 60
import java.util.Scanner;
public class BrainstormingWhileExamples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("PLease enter how many numbers we need to print");
        int num = sc.nextInt();
        int i = 1;

        while (i <= num){
            System.out.println(i*6);
            i++;
        }

    }
}

