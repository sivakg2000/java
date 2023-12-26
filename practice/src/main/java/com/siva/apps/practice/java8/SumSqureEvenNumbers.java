package com.siva.apps.practice.java8;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class SumSqureEvenNumbers {

    public static void  main(String[] args){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        new SumSqureEvenNumbers().find(numbers);

    }

    public int find(List<Integer> list){
        return list.stream().filter(num->num%2==0).mapToInt(n->n*n).sum();

    }

}
