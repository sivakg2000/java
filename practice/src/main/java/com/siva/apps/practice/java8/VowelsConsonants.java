package com.siva.apps.practice.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class VowelsConsonants {
    public static void  main(String[] args){
        String input1 = "Hello World"; // Vowels: 3, Consonants: 7
        String input2 = "Java Programming"; // Vowels: 4, Consonants: 11
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
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    private  boolean isConsonant(int c){
        return !isVowel(c);
    }

}
