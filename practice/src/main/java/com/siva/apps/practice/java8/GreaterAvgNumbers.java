package com.siva.apps.practice.java8;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class GreaterAvgNumbers {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 35, 40);
        List<Integer> resList=new GreaterAvgNumbers().findList(numbers);
    System.out.println(resList);
    }

    public List<Integer> findList(List<Integer> list){
        double avg=list.stream().mapToInt(Integer::intValue).average().orElse(0.0);
        //System.out.println(avg);
        return list.stream().filter(n->n>avg).collect(Collectors.toList());
    }
}
