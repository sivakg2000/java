package com.siva.apps.practice.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class UpperCaseConCat {



    public static void  main(String[] args){

        List<String> list1= Arrays.asList("Java", "8", "Streams", "Challenge");

        System.out.println(new UpperCaseConCat().find(list1));
    }
    public String find(List<String > l1){
        return l1.stream().filter(this::isInitCase).collect(StringBuilder::new,StringBuilder::append,StringBuilder::append).toString().toUpperCase();

    }

    private boolean isInitCase(String s) {
        int c = (int) s.charAt(0);
        return c >= 65 && c < 90;
    }
}
