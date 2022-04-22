package com.java.project6;

import java.util.Scanner;

public class PrintHalfTwice {
    public static void main(String[] args) {
        System.out.println(firstHalf("Jabber"));
        System.out.println(firstHalf("Jabber"));
    }
    public static String firstHalf(String myString){
        //Write a program that prints first half twice
        int firstHalfEnd = myString.length() /2;
        String finalResult = myString.substring(0, firstHalfEnd);
        return finalResult;

        // if the word is odd then print a larger first half twice
    }
}
