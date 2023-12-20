package com.siva.apps.practice.java8;

import java.util.Arrays;
import java.util.List;

public class Day1 {
    public static void main(String[] args){

        List<Integer> mainList= Arrays.asList(1,3,78,108);
        System.out.println(mainList);

        int value=mainList.stream().filter(n->n%2==0).max(Integer::compareTo).orElse(0);

        System.out.println(value);
    }
}
