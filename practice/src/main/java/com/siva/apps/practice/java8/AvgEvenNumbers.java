package com.siva.apps.practice.java8;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class AvgEvenNumbers {
    public static void main (String[] args){
        List<Integer> mainList= Arrays.asList(1,2,3,4,5,6,7,8,9);

        OptionalDouble avgEvenNumber=mainList.stream().filter(n->n%2==0).mapToDouble(Integer::doubleValue).average();

        System.out.println(avgEvenNumber);
    }
}
