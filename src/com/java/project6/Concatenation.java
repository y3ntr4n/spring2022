package com.java.project6;

public class Concatenation {
    public static void main(String[] args) {
        /**
         * Write a function that concatenates two words into single,
         * however if the concatenation creates a similar double char, then omit one of the characters
         * ex:
         * "abc" "cat" -> "abcat"
         *
         * ex2:
         * abc", "xyz" -> "abcxyz"
         *
         * ex3:
         * "happy", "yolk" -> happyolk
         */

        //TODO implement logic
        String word1 = "abc";
        String word2 = "cat";
        if(word1.charAt(word1.length()-1) == word2.charAt(0)){
            System.out.println(word1.concat(word2.substring(1)));//
        }else{
            System.out.println(word1.concat(word2));;
        }
        //Concatenation concatenation = new Concatenation();
        //String concatenated = concatenation.concat(word1, word2);
        //System.out.println(concatenated);
    }

    public String concat(String word1, String word2) {
        System.out.println(word1.concat(word2));
        return null; // TODO implement method
    }
}
