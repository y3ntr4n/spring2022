package com.java.class16;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args){
        //write a program to take one String from user and print reverse

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String");
        String str = sc.nextLine();

        for(int i = str.length()-1; i >= 0; i--){
            System.out.print(str.charAt(i));
        }





    }

}
