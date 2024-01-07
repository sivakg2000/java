package com.siva.apps.practice.java8;

import java.util.function.Function;
import java.util.stream.Collectors;

public class Factorial {

    public static void  main(String[] args){
        int number1 = 5; // Factorial: 5! = 120
        int number2 = 7; // Factorial: 7! = 5040
        int number3 = 0; // Factorial: 0! = 1

        System.out.println(new Factorial().find(number1));
        System.out.println(new Factorial().find(number2));
        System.out.println(new Factorial().find(number3));

        System.out.println(new Factorial().factReg(number1));
        System.out.println(new Factorial().factReg(number2));
        System.out.println(new Factorial().factReg(number3));




    }

    public int find(int num){
        if(num==0 || num==1){
            return 1;
        }else {
            int fVal = num;
            for (int n = 1; n < num; n++) {
                fVal *= num - n;
            } ;
            return fVal;
        }
    }

    public int factReg(int num){
        if(num==0 || num==1){
            return 1;
        }else{
            return num*factReg(num-1);
        }
    }
}
