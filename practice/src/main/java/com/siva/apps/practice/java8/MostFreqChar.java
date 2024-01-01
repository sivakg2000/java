package com.siva.apps.practice.java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostFreqChar {

    public static void main(String[] args){
        List<String> words = Arrays.asList("apple", "banana", "orange", "kiwi", "banana", "apple", "kiwi", "strawberry");


        Map.Entry<Character,Long> res=new MostFreqChar().find(words);
        System.out.println(res);

    }

    public Map.Entry<Character,Long> find(List<String> list){

        Optional<Map.Entry<Character,Long>> fChar= list.stream().flatMapToInt(CharSequence::chars).mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByValue());
        return fChar.orElse(null);
    }
}
