package com.java.class18;

import java.util.Scanner;

//Is given string PALINDROME or not
public class PalindromeStringMethod {
    public static void main(String[] args) {
        //Scanner class for user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word to see if its a palindrome");
        String str = sc.nextLine();
        isPalindrome(str);
    }
static void isPalindrome(String str){
            String reverseStr = "";
            int strLength = str.length();

            for (int i = (strLength - 1); i >=0; --i) {
                reverseStr = reverseStr + str.charAt(i);
            }

            if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
                System.out.println(str + " is a Palindrome ");
            }
            else {
                System.out.println(str + " is not a Palindrome");
            }
        }



    }


