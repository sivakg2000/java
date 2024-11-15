package com.siva.apps.practice.dailycoding;


import java.util.*;
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

        System.out.println("Output 1 : "+new Problem386().getSortDecFreChar1(str));
        System.out.println("Output 2 : "+new Problem386().getSortDecFreChar2(str));
        System.out.println("Output 3 : "+new Problem386().getSortDecFreCharLegacy(str));


    }


    public static String getSortDecFreChar1(String s) {
        // Step 1: Count the frequency of each character
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Step 2: Create a list of characters and sort it by frequency
        List<Map.Entry<Character, Integer>> sortedEntries = new ArrayList<>(frequencyMap.entrySet());
        sortedEntries.sort((a, b) -> b.getValue() - a.getValue());

        // Step 3: Build the sorted string based on frequency
        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : sortedEntries) {
            char c = entry.getKey();
            int count = entry.getValue();
            result.append(String.valueOf(c).repeat(Math.max(0, count)));
        }

        return result.toString();
    }
    String getSortDecFreChar2(String s){
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
