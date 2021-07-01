package com.epam;

import java.util.ArrayList;
import java.util.List;

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
        List<Long> fibonacciValues = new ArrayList<>();
        fibonacciValues.add(0L);
        fibonacciValues.add(1L);
        countFibonacciSequence(elementNumber, fibonacciValues);
        return fibonacciValues.get(fibonacciValues.size()-1);
//        return countFibonacciSequence(elementNumber - 1) + countFibonacciSequence(elementNumber - 2);
    }

    private static void countFibonacciSequence(int elementNumber, List<Long> list) {
        if(elementNumber > 1){
            countFibonacciSequence((elementNumber-1), list);
            Long n1 = list.get(list.size()-1);
            Long n2 = list.get(list.size()-2);
            list.add(n1 + n2);
        }
    }
}
