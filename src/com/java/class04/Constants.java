package com.java.class04;

public class Constants {
    //Class variable - defined on the class level
    //in order to ba able to use a variable inside main method, that variable must be static
    static final char GENDER = 'F';
    static int population = 10000;

    public static void main(String[] args) {
        //Local variables -> all variable created inside main methods
        //Constants - values that never change throughout the program, must be in all CAPS when using with final
        //To search for when a variable was first declared -> mac (command, point curser over variable)

        // final -> keyword, put before data type, can only be initalized once
        final int DOB = 1990;
        final String SSN;
        SSN = "123-45-6789";
        final char PLUS_SIGN = '+';
        final double PI = 3.14;






    }
}
