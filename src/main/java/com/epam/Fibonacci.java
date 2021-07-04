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
        List<Long> fibonacciAdditionsCount = new ArrayList<>();
        fibonacciAdditionsCount.add(0L);
        fibonacciAdditionsCount.add(0L);
        countFibonacciAdditions(elementNumber, fibonacciAdditionsCount);
        return fibonacciAdditionsCount.get(elementNumber - 1) + 1;
//        return countFibonacciSequence(elementNumber - 1) + countFibonacciSequence(elementNumber - 2);
    }

    private static void countFibonacciAdditions(int elementNumber, List<Long> list) {
        if (elementNumber > 1) {
            countFibonacciAdditions((elementNumber - 1), list);
            Long n1 = list.get(list.size() - 1);
            Long n2 = list.get(list.size() - 2);
            list.add(n1 + n2 + 1);
        }
    }
}
