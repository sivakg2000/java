package com.siva.apps.practice.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class VowelsConsonants {
    public static void  main(String[] args){
        String input1 = "Hello World"; // Vowels: 3, Consonants: 7
        String input2 = "Java Programming"; // Vowels: 5, Consonants: 10
        String input3 = "OpenAI GPT"; // Vowels: 4, Consonants: 5
        new VowelsConsonants().find(input1);
        new VowelsConsonants().find(input2);
        new VowelsConsonants().find(input3);




    }

    public void find(String str){
        String tmpStr=str.replaceAll(" ","").toLowerCase();
        long vowels=tmpStr.chars().filter(this::isVowel).count();
        System.out.println(vowels);
        long consonants=tmpStr.chars().filter(this::isConsonant).count();
        System.out.println(consonants);

    }

    private   boolean isVowel(int c){
        return "aeiou".indexOf(c)!=-1;
    }

    private  boolean isConsonant(int c){
        return "bcdfghjklmnpqrstvwxyz".indexOf(c)!=-1;
    }

}
