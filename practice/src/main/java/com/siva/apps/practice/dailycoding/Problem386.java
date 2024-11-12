package com.siva.apps.practice.dailycoding;


import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 * Given a string, sort it in decreasing order based on the frequency of characters.
 * If there are multiple possible solutions, return any of them.
 *
 * For example, given the string tweet, return tteew. eettw would also be acceptable.
 */
public class Problem386 {
    public static void main(String[] args){
        String str="tweeeetttt";
        System.out.println("Input  : "+str);
        System.out.println("Output 1 : "+new Problem386().getSortDecFreChar(str));
        System.out.println("Output 2 : "+new Problem386().getSortDecFreCharLegacy(str));

    }

    String getSortDecFreChar(String s){
        Map<Character, Long> charMap=s.chars().mapToObj(a->(char)a).collect(Collectors.groupingBy(ch->ch,Collectors.counting()));
        Map<Character, Long> sortedMap = new HashMap<Character, Long>(charMap);
        StringBuilder stringBuilder=new StringBuilder();
        sortedMap.keySet().forEach(ch->stringBuilder.append(String.valueOf(ch).repeat(sortedMap.get(ch).intValue())));

        return stringBuilder.toString();
    }
    String getSortDecFreCharLegacy(String s){
        HashMap<Character, Integer> charMap=new HashMap<>();

        s.chars().mapToObj(a->(char)a).forEach(character -> {
            int iVal=1;
            if(charMap.containsKey(character)){
                iVal+=charMap.get(character);
            }
            charMap.put(character,iVal);
        });

        StringBuilder stringBuilder=new StringBuilder();
        charMap.keySet().forEach(ch->{
            int n=charMap.get(ch);
            stringBuilder.append(String.valueOf(ch).repeat(n));

        }); 
        return stringBuilder.toString();
    }

}
