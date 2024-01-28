package com.siva.apps.practice.java8;

import java.util.function.Function;
import java.util.stream.Collectors;

public class VowelCount {

    public static void  main(String[] args){
        String input1 = "programming is fun";
        new VowelCount().find(input1);




    }

    public void find(String str){

        System.out.println(str);

        System.out.println(str.chars().filter(this::isVowel).mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));

    }


    private boolean isVowel(int c){
        return "aeiou".indexOf(c)!=-1;
    }
}
