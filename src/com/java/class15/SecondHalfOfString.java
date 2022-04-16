package com.java.class15;

import java.util.Scanner;

public class SecondHalfOfString {
    public static void main(String[] args){
        //print second half of spring
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any String");
        String str = sc.nextLine();

        //
        if(str.length() % 2 == 0){
            System.out.println(str.substring(str.length()/2));
        }else{
            System.out.println(str.substring(str.length()/2 + 1));
        }
    }
}
