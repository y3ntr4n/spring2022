package com.java.project6;

import java.util.Scanner;

public class MiddleOne {
    public static void main(String[] args) {
        /**
         * Write a java program that prints middle char(s)
         *  1) when odd number of chars and more than 2 chars, print a middle character. ex: cat -> a
         *  2) when even number of chars and more than 3 chars, print 2 middle characters. ex: java -> av
         *  3) if a single character, print character 3 times. ex: & -> &&&
         *  4) if a double character, print characters 2 times. ex: @@ -> @@@@
         */

        Scanner scanner = new Scanner(System.in);
        MiddleOne middleOne = new MiddleOne();

        System.out.println("Input:");
        String text = scanner.nextLine();
        System.out.println("Middle One:");

        //middleOne.printMiddleOne(text);
        if(text.length() % 2 == 1 && text.length() >2){
            System.out.println("Middle One " + text.charAt(text.length() / 2));
        }else if (text.length() % 2 == 0 && text.length() >3){
            System.out.println("Two Middle characters " + text.charAt((text.length()/2)-1 ) + "" + text.charAt((text.length()/2) +1));
        }else if(text.length() == 1){
            System.out.println(text + text + text);
        }else if(text.length() == 2){
            System.out.println(text + text);
        }

    }



    public void printMiddleOne(String text) {
        //TODO TYPE HERE
    }
}
