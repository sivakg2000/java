package com.siva.apps.practice.java8;

import  java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class J3LString {
    public static void  main(String[] args){
        List<String> words = Arrays.asList("Java", "C", "Python", "Javascript", "Ruby","Jub", "Julia");
        List<String> resultList=new J3LString().find(words);
        resultList.forEach(System.out::println);


    }

    public List<String> find(List<String> list){
        return list.stream().filter(word->(word.startsWith("J") && word.length()==3)).collect(Collectors.toList());
    }
}
