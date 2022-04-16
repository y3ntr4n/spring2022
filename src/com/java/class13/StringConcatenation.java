package com.java.class13;

public class StringConcatenation {
    public static void main(String[] argrs) {
        String str1 = "Hello";
        String str2 = "Devx";
        int a = 10;
        int b = 20;
        int c = 5;

        System.out.println("Add " + a);//Add 10 (+ is concatenation)
        System.out.println("Add " + a + b);//Add 1020 (concatenation)
        System.out.println("Add " + (a + b));//Add 30
        System.out.println("Add " + a + b * c);//Add 10100 (multiplication has highest priority, then concatenation)
        System.out.println( a + b + " Add ");// 30 Add (left to right)
        System.out.println( a + b + " Add " + a + b);//30 Add 1020
        //System.out.println( a + " Add " + b - c);// will output error
        System.out.println(str1 + a + b + str2);//Hello1020Devx concatenation
        System.out.println("Add" + "10" + "20" + "str1");//Add1020str1





    }
}
