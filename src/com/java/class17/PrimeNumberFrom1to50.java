package com.java.class17;

public class PrimeNumberFrom1to50 {
    // Print all prime numbers from 1 to 50
    public static class PrintPrimeNumberFrom1to50 {
        public static void main(String[] args) {
            for (int i = 1; i <= 50; i++) {
                if (isPrime(i) == true) {
                    System.out.println(i);
                }
            }
        }

        static boolean isPrime(int num) {
            int count = 0;
            //For Loop to print 1 to 50
            for (int i = 1; i <= num; i++) {

                //If to filter out the condition
                if (num % i == 0) {
                    count++;
                }
            }

            if (count == 2) {
                return true;
            } else {
                return false;
            }
        }
    }
}
