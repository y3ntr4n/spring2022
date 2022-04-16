package com.java.class15;
import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args){
        //Print Reverse of Given String
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String");
        String str = sc.nextLine();

        //print left to right
        for(int i = 0; i < str.length(); i++)
            System.out.println(str.charAt(i));

        //print reverse
        for(int i = str.length()-1; i >= 0; i--){
            System.out.println(str.charAt(i));
        }





    }
}
