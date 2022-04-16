package com.java.class05;

public class IfCondition {
    public static void main(String[] args) {

        //syntax for if condition
        //if(condition){
            //statements to execute if condition is true
            // when condition is false, output will not print
       // }

//EXAMPLE 1
    int isFuelLow = 0;
        System.out.println("1. starting drive");

    if (isFuelLow == 1) // 0 == 1? False, will not print
    {System.out.println("2. Fill the Fuel");}

        System.out.println("3. Ending drive");

        System.out.println();

//EXAMPLE 2
    int fuelPercentage = 35;
        System.out.println("1. starting drive");

        if (fuelPercentage <= 20) // 35 <= 20? False, will not print
        {System.out.println("2. Fill the Fuel");}

        System.out.println("3. Ending drive");

        System.out.println();

//EXAMPLE 3
        int fuelPercent = 0;
        System.out.println("1. starting drive");

        if (fuelPercent <= 20) // 0 <= 20? True, will print
        {System.out.println("2. Fill the Fuel");}

        System.out.println("3. Ending drive");

        System.out.println();

//EXAMPLE 4
        int fuelLevel = 20;
        System.out.println("1. starting drive");

        if (fuelLevel <= 20) // 20 <= 20? True, will print
        {System.out.println("2. Fill the Fuel");}

        System.out.println("3. Ending drive");

    }
}
