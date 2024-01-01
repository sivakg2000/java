package com.siva.apps.practice.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LongestPalindrome {
    public static void main(String[] args){
        List<String> strings = Arrays.asList("madam", "racecar", "hello", "level", "noon", "world", "radar");

        String res=new LongestPalindrome().find(strings);
        System.out.println(res);

    }

    public String find(List<String> list){
        return list.stream().filter(word->{
            String rString=new StringBuffer(word).reverse().toString();
            return word.equals(rString);
        }).max(Comparator.comparing(String::length)).orElse("");
    }
}