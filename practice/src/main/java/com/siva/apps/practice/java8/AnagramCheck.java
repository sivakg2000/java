package com.siva.apps.practice.java8;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class AnagramCheck {

    public static void main (String[] args){

        String str1 = "listen";
        String str2 = "silent";
        System.out.println(new AnagramCheck().isAnagram1(str1,str2));
        System.out.println(new AnagramCheck().isAnagram2(str1,str2));

    }
    public boolean isAnagram1(String s1,String s2){
        if(s1.length()!=s2.length())
            return false;
        String sortedS1= Arrays.toString(s1.chars().sorted().toArray());
        String sortedS2=Arrays.toString(s2.chars().sorted().toArray());;
        return sortedS1.equals(sortedS2);
    }


    public boolean isAnagram2(String s1,String s2){
        if(s1.length()!=s2.length())
            return false;
        char[] arrayS1=s1.toCharArray();
        char[] arrayS2=s2.toCharArray();

        Arrays.sort(arrayS1);
        Arrays.sort(arrayS2);
        return Arrays.equals(arrayS1,arrayS2);
    }
}
