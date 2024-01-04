package com.siva.apps.practice.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArmstrongNumber {

    public static void  main(String[] args){
        List<String> words = Arrays.asList("Java", "C", "Python", "Javascript", "Ruby","Jub", "Julia");



    }

    public List<String> find(List<String> list){
        return list.stream().filter(word->(word.startsWith("J") && word.length()==3)).collect(Collectors.toList());
    }
}
}
