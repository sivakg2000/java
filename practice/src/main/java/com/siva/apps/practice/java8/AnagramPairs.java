package com.siva.apps.practice.java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AnagramPairs {

    public static void main (String[] args){

        String[] words = {"listen", "silent", "hello", "hi", "act", "cat", "earth", "heart"};
        new AnagramPairs().check(Arrays.asList(words));

    }
    public boolean isAnagram1(String s1,String s2){
        if(s1.length()!=s2.length())
            return false;
        String sortedS1= Arrays.toString(s1.chars().sorted().toArray());
        String sortedS2=Arrays.toString(s2.chars().sorted().toArray());;
        return sortedS1.equals(sortedS2);
    }

    public void check(List<String> list){

        //Map<String,Long> map=new HashMap<>();
        list.stream().map(this::sortVal ).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(e->e.getValue()>1).forEach(System.out::println);
        //System.out.println(map);
    }

    private String sortVal(String  s){

        char[] chars = s.toCharArray();
        Arrays.sort(chars);

        return new String(chars);
    }
}
