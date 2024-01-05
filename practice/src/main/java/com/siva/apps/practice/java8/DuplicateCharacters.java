package com.siva.apps.practice.java8;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCharacters {
    public static void  main(String[] args){
        String string1 = "hello"; // Characters with duplicates: l (2 times)
        String string2 = "programming"; // Characters with duplicates: g (2 times), r (2 times), m (2 times)
        String string3 = "openai"; // No duplicate characters

        System.out.println(new DuplicateCharacters().find(string1));
        System.out.println(new DuplicateCharacters().find(string2));
        System.out.println(new DuplicateCharacters().find(string3));




    }

    public boolean find(String str){
        System.out.println(str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(e->e.getValue()>1).collect(Collectors.toList()));
        return false;
    }


    public boolean findWOStream(String str){
        System.out.println(str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(e->e.getValue()>1).collect(Collectors.toList()));
        return false;
    }
}
