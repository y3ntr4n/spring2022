package com.java.class04;

public class PostIncrementDecrementOperators {
    public static void main(String[] args) {

        int num1 = 100;
        int num2 = 200;

        num1++; // num1 += 1; num1 = num + 1
        num2--; // num2 -= 1; num2 = num2 - 1

        System.out.println("num1++ is " + num1);//101
        System.out.println("num2-- is " + num2);//109

        //count number of people entering the building
        int numOfPeople = 0;
        numOfPeople++ ;
        System.out.println(numOfPeople);//1

        //post increment decrement is updated next time you are using it
        System.out.println(numOfPeople++);//1
        System.out.println(numOfPeople);//2
        System.out.println(numOfPeople++);//2
        System.out.println(numOfPeople++);//3
        System.out.println(numOfPeople);//4

        numOfPeople--;
        System.out.println(numOfPeople--);//3

        //Pre increment - updates the value of a variable by1 on the same line

        int y = 11;
        int x = 9;
        --y;
        ++x;
        System.out.println(y);//10
        System.out.println(x);//10

        System.out.println("pre increment " + ++y);//updates right away
        System.out.println("pre increment " + --x);






    }
}
