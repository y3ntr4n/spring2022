package com.java.class13;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 ="Hello";//variable, stored as CONSTANT value in String Pool
        String str2 = sc.nextLine();//value from user, object, stored in heap memory
        String str3 = new String("Hello");//object, stored in heap memory



        //String is immutable (cannot change the value once we initialized)
        // == it will compare memory location of two string, will not be used
        // variable.equals(


        if(str1==str2){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
