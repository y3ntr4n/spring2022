package com.java.class04;

public class MathExpressions2 {
    public static void main(String[] args) {

        int num = 300;
        int num1 = 30;

        //addition
        int sum = num + num1;
        System.out.println(sum);

        //subtraction
        int difference = num - num1;
        System.out.println(difference);

        //multiplication
        int multiplication = num * num1;
        System.out.println(multiplication);

        //division
        int division = num / num1;
        System.out.println(division);

        System.out.println();

        //Grocery Store
        //Receipt
        double priceOfAnOrange = 0.99;
        int amountOfOranges = 2;

        System.out.println("Price of an orange \t\t$" + priceOfAnOrange);// add \t to line up
        System.out.println("Amount of oranges \t\t" + amountOfOranges);
        double total = priceOfAnOrange * amountOfOranges;
        System.out.println("Total: \t\t\t\t\t$" + total);

        double implicitCasting = amountOfOranges;
        System.out.println(amountOfOranges);

        int explicitCasting = (int) priceOfAnOrange;
        //casting bigger type to a smaller one requires explicit casting

        int totalInt = (int) priceOfAnOrange * amountOfOranges;//casting takes place before math operations
        System.out.println(totalInt);

        //precedence - order of operations
        //implicit - indirect
        //explicit - direct
    }
}
