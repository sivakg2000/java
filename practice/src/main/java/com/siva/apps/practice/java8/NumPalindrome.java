package com.siva.apps.practice.java8;

import java.util.Arrays;
import java.util.List;

public class NumPalindrome {
    public static void  main(String[] args){

        System.out.println(new NumPalindrome().isNumPalindrome(11232321));
        System.out.println(new NumPalindrome().isNumPalindrome(1232321));



    }

    public boolean isNumPalindrome(int x){
        int original=x;
        int reversed=0;
        while(x>0){
            int digit=x%10;
            reversed=reversed*10+digit;
            x=x/10;
        }
        return reversed==original;
    }
}
