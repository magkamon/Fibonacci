package com.epam;

public class Fibonacci {

    public static long countFibonacciSequence(int elementNumber) {
        if (elementNumber < 0) {
            throw new IllegalArgumentException();
        }
        if (elementNumber == 0) {
            return 0;
        }
        if (elementNumber == 1) {
            return 1;
        }
        return countFibonacciSequence(elementNumber - 1) + countFibonacciSequence(elementNumber - 2);
    }
}
