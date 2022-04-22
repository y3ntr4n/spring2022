package com.java.class16;

public class StringDemo {
    public static void main(String[] args){
        String str = "Hello";

        //Thread-safe, synchronized, slower
        StringBuffer sBuffer = new StringBuffer ("Hello");
        sBuffer.reverse();

        //Not thread-safe, not synchronized, faster, does not have buffer mechanism
        StringBuilder sBuilder = new StringBuilder("Hello");
        sBuilder.reverse();











    }
}
