package com.siva.apps.practice.java8;

import java.util.Arrays;

public class ConsecIncSubSeq {


    public static void main (String[] args){

        String str1 = "listen";
        String str2 = "silent";
        System.out.println(new AnagramCheck().isAnagram1(str1,str2));
        System.out.println(new AnagramCheck().isAnagram2(str1,str2));

    }
    public boolean find(List<In>){
        if(s1.length()!=s2.length())
            return false;
        String sortedS1= Arrays.toString(s1.chars().sorted().toArray());
        String sortedS2=Arrays.toString(s2.chars().sorted().toArray());;
        return sortedS1.equals(sortedS2);
    }
}
