package com.epam;

import org.testng.annotations.Test;

import static com.epam.Fibonacci.*;
import static org.testng.Assert.*;

public class FibonacciTest {

    @Test
    public void shouldThrowExceptionWhenElementNumberIsSmallerThanZero(){
        //given
        int sequenceElement = -10;
        IllegalArgumentException exception = null;
        //when
        try{countFibonacciSequence(sequenceElement);}
        catch (IllegalArgumentException e){
            exception = e;
        }
        //then
        assertNotNull(exception);
    }

    @Test
    public void shouldReturnZeroForZeroElement(){
        //given
        int zeroElement = 0;
        //when
        int actualValue = countFibonacciSequence(zeroElement);
        //then
        assertEquals(actualValue,0);
    }

    @Test
    public void shouldReturnOneForFirstElement(){
        //given
        int firstElement = 1;
        //when
        int actualValue = countFibonacciSequence(firstElement);
        //then
        assertEquals(actualValue, 1);
    }


}