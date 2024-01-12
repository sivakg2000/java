package com.siva.apps.practice.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Divisible3A5 {

    public static void  main(String[] args){
 System.out.println(new Divisible3A5().find(100));
    }
    public List<Integer> find(int max){
        return IntStream.range(1,max).filter(n-> n%3==0 && n%5==0).boxed().collect(Collectors.toList());
    }
}
