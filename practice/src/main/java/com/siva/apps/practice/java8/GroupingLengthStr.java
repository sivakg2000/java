package com.siva.apps.practice.java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingLengthStr {

    public static void  main(String[] args){

        List<String> list1= Arrays.asList("apple", "banana","banana", "pear", "kiwi", "grape");

        System.out.println(new GroupingLengthStr().find(list1));
    }
    public String find(List<String > l1){

        Map<Integer,List<String>> map1=new HashMap<>();
        l1.forEach(word->{
            List<String> tList=map1.getOrDefault(word.length(),new ArrayList<>());
            tList.add(word);
            map1.put(word.length(),tList);
        }
        );
        System.out.println(map1);


        System.out.println( l1.stream().collect(Collectors.groupingBy(String::length)));


     return "";

    }
}
