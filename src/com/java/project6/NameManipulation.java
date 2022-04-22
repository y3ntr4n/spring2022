package com.java.project6;

public class NameManipulation {
    public static void main(String[] args) {
        NameManipulation nameManipulation = new NameManipulation();
        String fullName = "leo messi";


        /**
         * Write a program that prints as a below example output using methods
         *
         *
         * Full name is leo messi
         * Initials are LM
         * First name is Leo
         * Last name is Messi
         */

        System.out.println("Full name is " + nameManipulation.convertFirstLetterOfNameAndLastNameToUppercase(fullName));

        String initials = nameManipulation.getInitials(fullName);
        System.out.println("Initials are " + initials);

        String firstName = nameManipulation.getFirstNameFrom(fullName);
        System.out.println("First name is " + firstName);

        String lastName = nameManipulation.getLastNameFrom(fullName);
        System.out.println("Last name is " + lastName);

    }

    /**
     * Write a function that converts first letter of first name and last name to Uppercase
     *
     * @param fullName
     * @return String
     */
    public String convertFirstLetterOfNameAndLastNameToUppercase(String fullName){
        //TODO implement method
        return null;
    }

    /**
     * Write a function that gets initials from full name
     *
     * @param fullName
     * @return String
     */
    public String getInitials(String fullName) {
        //TODO implement method
        return null;
    }

    /**
     * Write a function that gets first name from full name
     *
     * @param fullName
     * @return String
     */
    public String getFirstNameFrom(String fullName) {
        //TODO implement method
        return null;
    }

    /**
     * Write a function that gets last name from full name
     *
     * @param fullName
     * @return String
     */
    public String getLastNameFrom(String fullName) {
        //TODO implement method
        return null;
    }

}
