package com.siva.apps.practice.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SecondSmallestNumber {

    public static void  main(String[] args){
        List<Integer> numbers = Arrays.asList(10, 5, 8, 2,3, 12, 7);
        int result=new SecondSmallestNumber().find(numbers);
        System.out.println(result);
    }

    public int find(List<Integer> list){
        return list.stream().distinct().sorted().skip(1).findFirst().orElseThrow(()-> new IllegalArgumentException("List is too short"));
    }
}
