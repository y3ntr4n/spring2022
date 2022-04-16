package com.java.class12;
//Find the result of
// 1 * 2 * 3 * 4 * 5
//Factorial
public class HomeworkFactorial {
    public static void main(String[] args) {

        int factorial = 1;
        for (int i = 1; i <= 5; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
