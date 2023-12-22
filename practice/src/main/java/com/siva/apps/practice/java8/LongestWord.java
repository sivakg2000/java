package com.siva.apps.practice.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LongestWord {

    public static void main(String[] args){
        List<String> mainList= Arrays.asList("apple", "banana", "apple1", "orange", "banana2","banana1", "apple2");

        String longWord=mainList.stream().max((word1,word2)->Integer.compare(word1.length(),word2.length())).orElse("");
        System.out.println(longWord);
    }
}
