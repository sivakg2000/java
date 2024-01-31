package com.siva.apps.practice.java8;

import java.util.Arrays;
import java.util.List;

public class CommonPrefix {

    public static void  main(String[] args){

        List<String> words = Arrays.asList("pref", "prefix", "preposition", "prediction");
        String result=new CommonPrefix().find(words);
        System.out.println(result);


    }

    public String find(List<String> list){
        //return list.stream().mapToDouble(String::length).average().orElse(0.0);

        String s=list.stream().reduce((prefix,word)->{

            int minL=Math.min(prefix.length(),word.length());
            int comL=0;
            for(int i=0;i<minL;i++){
                if(prefix.charAt(i)!=word.charAt(i)){
                    break;
                }
                comL++;
            }

            System.out.println(prefix +">>"+word+">>"+minL+">>"+comL);
            return prefix.substring(0,comL);
        }).orElse("");
        return s;
    }

}
