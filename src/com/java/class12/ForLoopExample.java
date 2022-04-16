package com.java.class12;
//“for” loop in Java is an entry-controlled loop that facilitates a user to execute a block of a statement(s) iteratively for a fixed number of times.
public class ForLoopExample {
    public static void main(String[] args) {
//print program 1 to 5

        //WHILE Loop conditions
        int i = 1; //initialization
        while (i <= 5) //condition
        {System.out.println(i);//body
            i++;} //increment/decrement, w/out it, output will print indefinitely

        System.out.println();

        //FOR Loop conditions
        //   for (initialization; condition; increment/decrement)
        for(int j = 5; j<= 10; j++)

        {System.out.println(j);}

        System.out.println();
        System.out.println("EXAMPLE 1");

        //EXAMPLE 1
        //   Print 2 4 6 8 10
        for(int k = 1; k<= 10; k++)
        if(k % 2 == 0)
        {System.out.println(k);}

        System.out.println();
        System.out.println("EXAMPLE 2");

        //EXAMPLE 2
        //   Print 2 4 6 8 10
        for(int l = 1; l<= 10/2; ++l)
        {System.out.println(l);}

        System.out.println();
        System.out.println("EXAMPLE 3");
        //EXAMPLE 3
        //   Print 2 4 6 8 10
        for(int m = 2; m<= 10; m=m+2)
        {System.out.println(m);}

        System.out.println();
        System.out.println("EXAMPLE 4");
        //EXAMPLE 4
        //   Print 1 2 3 4 5 6 7 8 9 10
        for(int n = 1; n <= 10; n++)
        {System.out.println(n);}

        System.out.println();
        System.out.println("EXAMPLE 5");
        //EXAMPLE 5
        //   Print 10 9 8 7 6 5 4 3 2 1
        for(int o = 10; o >= 1; o--)
        {System.out.println(o);}

        System.out.println();
        System.out.println("EXAMPLE 6");
        //EXAMPLE 6 **************
        //   Print odd numbers from 10 to 1 (9 7 5 3 2 1)
        for(int p = 10; p >= 1; --p)
        if( p % 2 != 0)
        {System.out.println(p);}








        }
    }

