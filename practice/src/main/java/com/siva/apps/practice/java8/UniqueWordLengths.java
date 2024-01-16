package com.siva.apps.practice.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueWordLengths {


    public static void main(String[] args){
        List<String> words = Arrays.asList("apple", "banana", "orange", "kiwi", "strawberry", "grapes");


        List<Integer> fList1=new UniqueWordLengths().findUniqueWordLengths(words);
        System.out.println(fList1);

    }

    public   List<Integer> findUniqueWordLengths(List<String> words) {
        return words.stream()
                .map(String::length)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }



}
