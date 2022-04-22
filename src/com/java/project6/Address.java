package com.java.project6;

import java.util.Scanner;

public class Address {
    public static void main(String[] args) {
        String address = "2400 E Devon Ave #215, Des Plaines, IL 60018";

        /**
         * Write a program that provides more specific information about address
         * Any address can be inserted instead of a given address
         * get street address, city, state, and zipcode in separate variables and print them out
         */
        //TODO WRITE YOUR CODE HERE
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter address");
        address = sc.nextLine();
        getStreetAddress(address);
    }


    static String getStreetAddress(String address) {
        int firstCommaIndex = address.indexOf(",");
        return address.substring(0, firstCommaIndex);

    }
    static String getCity(String address) {
        int firstCommaIndex = address.indexOf(",");

        int secondCommaIndex = address.lastIndexOf(",");

        return address.substring(firstCommaIndex + 2, secondCommaIndex);
    }

    static String getState(String address) {
        int lastCommaIndex = address.lastIndexOf(",");
        int lastSpaceIndex = address.lastIndexOf(" ");

        return address.substring(lastCommaIndex+2, lastSpaceIndex);
    }

    static int getZipcode(String address) {

        int lastSpaceIndex = address.lastIndexOf(" ");
        String zipString = address.substring(lastSpaceIndex+1);
        return Integer.parseInt(zipString);
    }
}
