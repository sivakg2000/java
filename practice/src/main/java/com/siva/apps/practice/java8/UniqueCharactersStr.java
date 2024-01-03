package com.siva.apps.practice.java8;

public class UniqueCharactersStr {



    public static void  main(String[] args){

        String str= "abcdefg";
        boolean result=new UniqueCharactersStr().find(str);
        System.out.println(result);


    }

    public boolean find(String str){

        return str.length()==str.chars().distinct().count();

    }
}
