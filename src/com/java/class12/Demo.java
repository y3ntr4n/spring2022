package com.java.class12;

public class Demo {
    public static void main(String[] args) {
//print program divisible by 3 OR divisible by 7

        int i = 1;
        while (i <= 50) {
            if (i % 3 == 0 || i % 7 ==0)//will print for BOTH
            {System.out.println(i);}

            i++;
        }
        //print program divisible by 3 OR divisible by 7
//print program not divible by 3 AND divisible by 7
        int j = 1;
        while (j <= 50) {
            if (j % 3 == 0 && j % 7 ==0)//will print for
            {System.out.println(j);}

            j++;
        }
    }
}
