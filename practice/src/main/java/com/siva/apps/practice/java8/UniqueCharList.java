package com.siva.apps.practice.java8;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class UniqueCharList {
    public static void main(String[] args){
        List<String> words = Arrays.asList("hello", "world", "java", "stream", "example", "unique", "characters");
        List<String> fList=new UniqueCharList().find(words);
        System.out.println(fList);

    }

    public List<String> find(List<String> list){
        return list.stream().filter(word->  word.length()==   word.chars().distinct().count()).collect(Collectors.toList());
    }
}
