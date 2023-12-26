package com.siva.apps.practice.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Len5UpperCase {

    public static void main(String[] args){
        List<String> words = Arrays.asList("apple", "banana", "orange", "kiwi", "strawberry", "grapes");
        List<String> fList=new Len5UpperCase().find(words);
        System.out.println(fList);

    }

    public List<String> find(List<String> list){
        return list.stream().filter(word->word.length()>5).map(String::toUpperCase).collect(Collectors.toList());
    }
}
