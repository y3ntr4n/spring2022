package com.java.class02;

public class PrimitiveDataTypes2 {
    //-> 8 types, stores data, can only hold 1 value, uses less memory, fast
    //byte 1 byte
    //short 2 bytes
    //int 2 bytes
    //long 8 bytes
    //float 4 bytes
    //double 8 bytes
    //char 2 bytes
    //boolean 1 bit

    public static void main(String[] args) {
        byte age = 127;
        //byte -128 to 127
        System.out.println(age);

        short miles = 32000;
        //short -32,768 to 32,767
        System.out.println(miles);

        int views = 2_000_000_000;
        //int -2 billion to 2 billion
        System.out.println(views);

        long worldPopulation = 7_800_000_000L;
        //long -9 quintillion to 9 quintillion, must include L at the end for big numbers
        System.out.println(worldPopulation);

        float itemPrice = 12.99F;
        //float decimal up to 7 digits end with F

        double itemPrice2 = 12.99;
        //double decimal up to 15 digits, used more often in real world

        char gender = 'M';
        char excellentGrade = 'A';
        char goodGrade = 'B';
        char emailSign = '@';
        //any single character, must be in single quotes to identify its value
        //letters without quotes will be read as Variables
        //we can initialize chars by using ASCII table decimal conversion table

        boolean isMicrowaveOn = true;
        boolean dogsHas4Legs = true;
        boolean dogsHas2legs = false;
        //true or false
        //isOn, isCold, isRed, isLarge, isCat

        int num1 = 2000;
        int num2 = 1000;
        System.out.println(num1);
        System.out.println(num2);

        //swap the value of num1 and num2
        //when reassigning values to variables, they must have the same data type
        int temp = num2;
        num2 = num1;
        num1 = temp;
        System.out.println(num1);


        //data type casting/converting
        //explicit casting - converts larger data type to smaller one
        //implicit casting - converts smaller data type to larger one (happens automatic in IntelliJ)

        System.out.println();

        long x = 5000;
        int y = (int)x;
        y += x;
        System.out.println(x);//5000
        System.out.println(y);//10000

        x /= y;
        System.out.println(x);//0













    }
}
