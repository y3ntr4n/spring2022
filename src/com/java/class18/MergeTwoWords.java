package com.java.class18;
//                          METHODS
//                          1. Method Name (Mandatory)
//                          2. Method Parameter (Optional)
//                          3. Method Return Type (mandatory)
//                          4. Method body (Optional if it's void)

import java.util.Scanner;

public class MergeTwoWords {
    public static void main(String[] args) {
        /**
         * Merge two words with three characters one by one and print them
         * if words have more than three characters print Error message "Incorrect input! Cannot merge".
         *
         * ex
         * "ice", "sea"
         *
         *
         * output:
         * isceae
         *
         * ex2:
         * "Hot", "Day"
         *
         * output:
         * HDoaty
         *
         */
        Scanner sc = new Scanner(System.in);
        String word1 = "";
        String word2 = "";
        String newStr = word1 + word2;

        System.out.println("Enter 1st word");
        word1 = sc.nextLine();

        System.out.println("Enter 2nd word");
        word2 = sc.nextLine();

        System.out.println(printMerge(word1, word2));
        }


    static String printMerge(String word1, String word2) {
        //Initialize with empty string
        String newStr = "";

        // word 1 OR word2 has more than 3 characters, print Incorrect Input
        if(word1.length()>3 || word2.length()>3){
            System.out.println("Incorrect Input");
        }else{
            for(int i = 0; i <word2.length(); i++){
                newStr = newStr + word1.charAt(i)+ "" + word2.charAt(i);
            }
        }
        return newStr;

    }

}

