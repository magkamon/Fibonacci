package com.epam;

public class Fibonacci {

    public static int countFibonacciSequence(int elementNumber) {
        if (elementNumber < 0) {
            throw new IllegalArgumentException();
        }
        if (elementNumber == 0) {
            return 0;
        }
        return -1;
    }


}
