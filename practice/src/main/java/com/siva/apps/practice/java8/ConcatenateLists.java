package com.siva.apps.practice.java8;

import java.util.Arrays;
import java.util.List;

public class ConcatenateLists {

    public static void main (String[] args){

        List<String> list1 = Arrays.asList("apple", "banana", "kiwi");
        List<String> list2 = Arrays.asList("grape", "pear", "orange");
        System.out.println(new ConcatenateLists().doConCat(list1,list2));

    }

    public List<String> doConCat(List<String> l1,List<String> l2){

        return null;
    }
}
