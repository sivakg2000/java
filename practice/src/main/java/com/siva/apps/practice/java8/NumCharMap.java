package com.siva.apps.practice.java8;

import java.util.*;

public class NumCharMap {


    public static void  main(String[] args){

        String text = "hellojava";
        System.out.println(new NumCharMap().find(text));


    }

    public Map<Character,Integer> find(String str){

        Map<Character,Integer> rVal=new HashMap<>();
        str.chars().mapToObj(c->(char)c).forEach(c->rVal.put(c,rVal.getOrDefault(c,0)+1));
        return rVal;
    }


}
