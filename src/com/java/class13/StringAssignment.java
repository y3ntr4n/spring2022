package com.java.class13;
//create 3 String Variables
//initialize two variables with constant values
//take third variable from user Scanner class
//compare 1st and 2nd variable using == operator
//compare 2nd and 3rd using == operator
//compare 1 and 3rd using .equals(method)
import java.util.Scanner;

public class StringAssignment {
    public static void main(String[] args) {
        System.out.println("Enter Vegetable");
        Scanner sc = new Scanner(System.in);

        String carrot ="Vegetable";
        String spinach ="Vegetable";
        String vegetable = sc.nextLine();

//compare 1st and 2nd variable using == operator
        if(carrot == spinach){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
//compare 2nd and 3rd using == operator
        if(spinach == vegetable) {
            System.out.println("True");
        }else{
            System.out.println("False");
        }
//compare 1 and 3rd using .equals(method)
            if (carrot.equals(vegetable)) {
                vegetable = sc.nextLine();
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }
    }


