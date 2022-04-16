package com.java.class15;

public class Inititials {
    public static void main(String[] args){
        //Take Full Name from User and print their Initials
        String fullName = "Yen Hai Tran";//Output -> Y.H.T.
        String[] initials = fullName.split(" ");
        String firstName = initials[0];
        String middleName = initials[1];
        String lastName = initials[2];

        System.out.println(firstName.charAt(0) + "." +
                middleName.charAt(0) + "." +
                lastName.charAt(0) + ".");





    }
}
