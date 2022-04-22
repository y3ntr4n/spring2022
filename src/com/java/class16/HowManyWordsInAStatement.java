package com.java.class16;

import java.util.Scanner;

public class HowManyWordsInAStatement {
    public static void main(String[] args) {
        //write a program to take one statement from user and find out how many words in that statement

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String");
        String str = sc.nextLine();
        int count =1;
        for (int i = 0; i < str.length() -1; i++) {
            if((str.charAt(i)==' ') && (str.charAt(i+1)!=' ')){
            count++;}
        }

            System.out.println("Number of Words in Statement " + count);

        // OR
        //String[] parts = str.split(" ");
        //System.out.println(parts.length;



    }
}