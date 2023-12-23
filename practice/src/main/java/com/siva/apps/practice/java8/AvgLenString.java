package com.siva.apps.practice.java8;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class AvgLenString {

    public static void  main(String[] args){

        List<String> words = Arrays.asList("Java", "C", "Python", "Javascript", "Ruby", "Julia");


        OptionalDouble result=new AvgLenString().find(words);
        System.out.println(result);


    }

    public OptionalDouble find(List<String> list){
        return list.stream().map(String::length).mapToDouble(Integer::doubleValue).average();
    }
}
