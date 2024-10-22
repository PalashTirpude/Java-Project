package com.java.project.exercises.number;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        System.out.println(isPrimeNumber(20));
    }

/*
    Algorithm for Primality Check:
    Here is a simple algorithm you can follow for any number n:

    1. If n <= 1, it is not prime.
    2. Check if n is divisible by any integer from 2 to sqrt(n). If yes, n is not prime.
    3. If no divisors are found, n is prime.
*/

    public static boolean isPrimeNumber(int inputNumber) {
        if (inputNumber <= 1) {
            return false;
        }
        int nearestSquareRoot = (int) Math.pow(inputNumber, 0.5);
        for (int i = 2; i <= nearestSquareRoot; i++) {
            if (inputNumber % i == 0) {
                return false;
            }
        }
        return true;
    }
}
