package com.siva.apps.practice.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WordCount {
    public static void main(String[] args){

        List<String> mainList= Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");

        mainList.stream().collect(Collectors.groupingBy(word->word,Collectors.counting())).forEach((word,count)->System.out.println(word+":"+count));


    }
}
