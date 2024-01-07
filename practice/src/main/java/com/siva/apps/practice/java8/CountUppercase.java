package com.siva.apps.practice.java8;

public class CountUppercase {

    public static void  main(String[] args){
        String string1 = "Hello World! How Are You?";
        System.out.println(new CountUppercase().find(string1));
    }

    public long find(String str){ 
        return str.chars().filter(c->(c>=65 && c<91)).count();
    }


}


