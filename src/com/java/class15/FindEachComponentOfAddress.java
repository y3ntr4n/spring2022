package com.java.class15;

import java.util.Scanner;

public class FindEachComponentOfAddress {
    public static void main(String[] args){
        String address = "Nautical View St Tampa FL";

        //separate each component of address in separate lines
        System.out.println(address);
        String[] words = address.split(" ");

        for(int i = 0; i < words.length; i++)
            System.out.println(words[i]);

        System.out.println(words[0].trim());






























    }
}
