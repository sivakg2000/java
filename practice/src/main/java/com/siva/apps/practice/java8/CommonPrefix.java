package com.siva.apps.practice.java8;

import java.util.Arrays;
import java.util.List;

public class CommonPrefix {

    public static void  main(String[] args){

        List<String> words = Arrays.asList("pre", "prefix", "preposition", "prediction");
        double result=new AvgLenString().find(words);
        System.out.println(result);


    }

    public double find(List<String> list){
        return list.stream().mapToDouble(String::length).average().orElse(0.0);
    }
}
}
