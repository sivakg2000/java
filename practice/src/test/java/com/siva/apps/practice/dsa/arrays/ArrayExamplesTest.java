package com.siva.apps.practice.dsa.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArrayExamplesTest {
    private ArrayExamples arrayExamples=new ArrayExamples();

    @Test
    public void checkMaxConsecutive1(){
        int[] numbers1= {1,1,1,1,0,1,1,1};
        int expectedResult=4;
        int result=arrayExamples.getMaxConsecutive1(numbers1);
        assertEquals(expectedResult,result);
    }

}
