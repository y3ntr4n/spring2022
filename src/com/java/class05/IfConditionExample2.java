package com.java.class05;

public class IfConditionExample2 {
    public static void main(String[] args) {

        //syntax for if condition
        //if(condition){
        //statements to execute if condition is true
        // when condition is false, output will not print
        // }

//EXAMPLE 1
        int batteryPercentage = 1;
        System.out.println("1. Playing Games");

        if (batteryPercentage == 0) // 0 == 1? False, will not print
        {System.out.println("2. Turn Off");}

        System.out.println("3.Lock phone");

        System.out.println();

//EXAMPLE 2
        int batteryPercent = 1;
        System.out.println("1. starting drive");

        if (batteryPercentage == 1) // 1 == 1? True, will print
        {System.out.println("2. Turn off");}

        System.out.println("3. Lock phone");





    }
}

