package com.siva.apps.practice.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueWordLength {

    public static void main(String[] args){
        List<String> words = Arrays.asList("apple", "banana", "orange", "kiwi", "strawberry", "grapes");
        List<Integer> fList=new UniqueWordLength().find(words);
        System.out.println(fList);

    }

    public List<Integer> find(List<String> list){
        //return list.stream().filter(word->word.length()>=5).map(String::toUpperCase).collect(Collectors.toList());
        return list.stream().filter(this::isUniqueLetWork).mapToInt(String::length).boxed().collect(Collectors.toList());
    }


    private boolean isUniqueLetWork(String s){

        String rUqStr= s.chars().distinct().mapToObj(c->(char)c).collect(StringBuilder::new,StringBuilder::append,StringBuilder::append).toString();
        System.out.println(s+" -> "+rUqStr);
        return s.length()== rUqStr.length();
    }
}
