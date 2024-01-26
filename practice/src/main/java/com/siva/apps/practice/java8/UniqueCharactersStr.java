package com.siva.apps.practice.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueCharactersStr {



    public static void  main(String[] args){

        String str= "abcdefg";
        boolean result=new UniqueCharactersStr().find(str);
        System.out.println(result);

        List<String> strings = Arrays.asList("hello", "world", "java", "programming", "unique");

        List<String> fList=new UniqueCharactersStr().find(strings);

        System.out.println(fList);


    }

    public boolean find(String str){

        return str.length()==str.chars().distinct().count();

    }

    public List<String> find(List<String> list){

       return list.stream().filter(this::find).collect(Collectors.toList());

    }
}
