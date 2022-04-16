package com.java.class14;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args){

        /*      FORMAT 1    variable1.method(variable2)
                       2    variable1.method()
                       3    variable1.method(variable1, variable2)

                                1. equals()
                                2. equalsIgnoreCase()
                                3. subString()
                                4. toUpperCase() / toLowerCase()
                                5. length()
                                6. charAt()
                                7. indexOf()
                                8. replace()
                                9. replaceAll()
                                10. isEmpty()
                                11. concat()
                                12. trim()
                                13. valueOf()
                                14. compareTo()
                                15. format()
                                16. Split()
                                17. contains()
         */

        //DECLARATION & INITIALIZATION
        String str1 = "Hello World";
        String str2 = "hello World";
        String str3 = "Hello World! Welcome to DevX!";

        System.out.println("1. equals");

        // 1. equals()
        System.out.println(str1.equals(str2));//false (H & h)

        System.out.println("=================================================================");
        System.out.println("2. equalsIgnoreCase");

        // 2. equalsIgnoreCase()
        System.out.println(str1.equalsIgnoreCase(str2));//true, only checks equality, ignoring case sensitive (H & h)

        System.out.println("=================================================================");
        System.out.println("3. contains");

        // 3. contains() checks if str3 contains str1
        System.out.println(str3.contains(str1));

        System.out.println("=================================================================");
        System.out.println("4. toUpperCase & toLowerCase");

        // 4. toUpperCase() / toLowerCase()
        System.out.println(str3.toUpperCase());//HELLO WORLD! WELCOME TO DEVX!
        System.out.println(str3.toLowerCase());//hello world! welcome to devx!

        System.out.println("=================================================================");
        System.out.println("5. length");

        // 5. length() -> counts the number of spaces including empty space
        System.out.println(str1.length());//Hello World has 11 spaces

        System.out.println("=================================================================");
        System.out.println("6. indexOf");

        // 6. indexOf() - the index of a character from left to right
        System.out.println(str1.indexOf('W'));// W is the index in Hello World
        System.out.println(str1.lastIndexOf('d'));// d is the index 10 from right to left in Hello World

        System.out.println("=================================================================");
        System.out.println("7. charAt");

        // 7. charAt()
        System.out.println(str1.charAt(0));// H is at index 0 in Hello World

        System.out.println("=================================================================");
        System.out.println("8b. replace");

        // 8a. replace()  ***********************
        str1 = "Welcome User";
        str2 = "DevX";
        System.out.println(str1.replace("User",str2));//Welcome DevX
        System.out.println(str1.replace(str1,str2));//DevX

        System.out.println("=================================================================");
        System.out.println("8b. ReplaceAll");

        // 8b. replaceAll()
        str1 = "PRICE IS INR 200 INR 300 INR 500";
        System.out.println(str1.replaceAll("[0-9]", ""));//replace all numbers with spaces

        System.out.println("=================================================================");
        System.out.println("9. isEmpty");

        // 9. isEmpty() - is string empty?
        String str4 = "            ";
        String str5 = "";
        System.out.println(str4.isEmpty());//false
        System.out.println(str5.isEmpty());//true

        System.out.println("=================================================================");
        System.out.println("10. concat");

        // 10. concat()
        System.out.println();

        System.out.println("=================================================================");
        System.out.println("11. trim");

        // 11. trim() Deletes all the spaces
        System.out.println();

        System.out.println("=================================================================");
        System.out.println("12. valueOf");

        // 12. valueOf()
        System.out.println();

        System.out.println("=================================================================");
        System.out.println("13. compareTo");

        // 13. compareTo()
        System.out.println();

        System.out.println("=================================================================");
        System.out.println("14. format");

        // 14. format()******************************
        str1 = "Welcome %s";
        str2 = "Welcome %s to %s";
        System.out.println(String.format(str1,"Yen"));//Welcome Yen
        System.out.println(String.format(str2,"Yen","Amazon"));//Welcome Yen to Amazon

        System.out.println("=================================================================");
        System.out.println("15. Split");

        // 15. Split() - split words into separate lines
        System.out.println("Split");
        str1 = "Welcome to Java Class. It's gonna Be A Great Day";
        String[] words = str1.split(" ");// [] -> array of str1

        System.out.println(words.length);//total # of words

        for(int i = 0; i < words.length; i++) // words.length without declaring number of words
        System.out.println(words[i]);

        System.out.println("=================================================================");
        System.out.println("16. substring");

        //16. substring
        str1 = "Welcome to Java Class";
        System.out.println(str1.substring(7));
        System.out.println(str1.substring(0,7));















    }
}
