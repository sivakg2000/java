package com.siva.apps.practice.java8;


/**
 * A pangram is a sentence containing every letter of the alphabet at least once
 */
public class Pangram {
    public static void main(String[] args){
        String str="The quick brown fox jumps over the lazy dog";
        String str2 = "This is not a pangram";
        System.out.println(new Pangram().isPangram(str));
        System.out.println(new Pangram().isPangram(str2));
    }

    public boolean isPangram(String s){
      long cCount=s.toUpperCase().chars().distinct().filter(c-> c>64 && c<=90).count();

      return  cCount==26;
    }
}
