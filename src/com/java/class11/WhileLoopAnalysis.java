package com.java.class11;
import java.util.Scanner;
//while loop is a control flow statement that allows code to be executed repeatedly based on a given Boolean condition.
//10 1 9 2 8 3 7 4 6 5
public class WhileLoopAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();

        int i = 1 ;

        while (i <= limit/2) {
            System.out.println(11-i);
            System.out.println(i);
            i++;
        }
    }
}
