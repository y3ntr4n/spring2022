package com.java.class04;

public class SwapVariables {
    public static void main(String[] args) {

        int a = 10, b = 20;

        //swap the values of the variables
        int c;
        c = a;
        a = b;
        b = c;

        System.out.println(a);
        System.out.println(b);
    }
}
