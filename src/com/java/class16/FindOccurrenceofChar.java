package com.java.class16;

import java.util.Scanner;

public class FindOccurrenceofChar {
    public static void main(String[] args) {
        //write a program to take one string from user and find out how many characters in that string

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String");
        String str = sc.nextLine();
        System.out.println("Enter 1 character to search ");
        char search = sc.nextLine().charAt(0);

        int count =0;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == search){
                count++;}
        }

        System.out.println("The character " + search + " appears" + count + " times");

        // OR
        //String[] parts = str.split(" ");
        //System.out.println(parts.length;



    }
}
