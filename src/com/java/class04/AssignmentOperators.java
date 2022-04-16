package com.java.class04;

public class AssignmentOperators {
    public static void main(String[] args) {


        //assignment operators
        // =, +=, -=, *=, /+, %=
        // num2 = num1 ->
        // num2 += num1 -> num2 = num2 + num1
        // num2 -+ num1 -> num2 = num2 - num1
        // num2 *= num1 -> num2 * num1
        // num2 /+ num1 -> num2 /  num1
        // num2 % num1 -> num2 % num1
        //compound operators can only be used with numbers
        //only += can be used with String

        int carMileage = 1000;
        int milesUntilHome = 50;
        int finalMileage = carMileage + milesUntilHome;
        System.out.println("carMileage" + finalMileage);

        int milesUntilFriends = 28;
        int milesAtFriends = finalMileage + milesUntilFriends;
        System.out.println("Miles At Friends " + milesAtFriends);

        int milesFriendsToHome = milesAtFriends + milesUntilFriends;
        System.out.println("Miles from Friends to Home " + milesFriendsToHome); //1106

        //better way yo write same code
        int cArMileage = 1000;
        int milesToHome = 50;
        int homeToFriends = 28;

        cArMileage += milesToHome;
        System.out.println("Mileage When Arrive at Home " + cArMileage);

        cArMileage += homeToFriends;
        System.out.println("Mileage At Friends " + cArMileage);

        System.out.println();

        //given that salary grows 3% per year, whats the salary in 5 years
        int currentYear = 2020;
        int periodOfYears = 5;
        double currentYearSalary = 100_000;

        //compound interest formula
        // A = P * (1 + (r/n)) * (n * t)
        // A = final amount
        // P = Principal Balance
        // r = interest rate
        // n = Compound time (monthly or annually)
        // t = total time period

        double salaryIn2025 = currentYearSalary * (1+ ((.03/1) * periodOfYears));
        System.out.println("Salary in 2025 $" + salaryIn2025);//$114,999.99999999

        System.out.println();

        int num1 = 10;
        int num2 =20;

        num2 = num1;
        System.out.println("=Output:" + num2);//10

        num2 += num1;
        System.out.println("+=Output:" + num2);//20

        num2 -= num1;
        System.out.println("-=Output:" + num2);//10

        num2 *= num1;
        System.out.println("*=Output:" + num2);//100

        num2 /= num1;
        System.out.println("/=Output:" + num2);//10

        num2 %= num1;
        System.out.println("%=Output:" + num2);//0








    }
}
