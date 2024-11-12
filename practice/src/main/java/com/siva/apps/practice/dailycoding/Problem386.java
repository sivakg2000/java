package com.siva.apps.practice.dailycoding;


import java.util.HashMap;

/**
 * Given a string, sort it in decreasing order based on the frequency of characters.
 * If there are multiple possible solutions, return any of them.
 *
 * For example, given the string tweet, return tteew. eettw would also be acceptable.
 */
public class Problem386 {
    public static void main(String[] args){
        String str="tweeeett";
        String result=new Problem386().getSortDecFreChar(str);
        System.out.println("Input  : "+str);
        System.out.println("Output : "+result);

    }

    String getSortDecFreChar(String s){
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
            for(int i=0;i<n;i++){
                stringBuilder.append(ch);
            }
        });
        System.out.println("\n");
        return stringBuilder.toString();
    }

}
