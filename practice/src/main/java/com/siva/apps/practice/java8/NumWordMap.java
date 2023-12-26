package com.siva.apps.practice.java8;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class NumWordMap {


    public static void  main(String[] args){

        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");

        System.out.println(new NumWordMap().find(words));





    }

    public Map<String,Long> find(List<String> list){

        /*Map<String,Long> rVal=new HashMap<>();
        list.forEach(word->rVal.put(word,rVal.getOrDefault(word,0)+1));
*/

        return list.stream() .collect(Collectors.groupingBy(word -> word, Collectors.counting()));
    }


}
