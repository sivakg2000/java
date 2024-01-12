package com.siva.apps.practice.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrimeNumber {



    public static void  main(String[] args){

        List<Integer> numbers = Arrays.asList(2, 7, 15, 23, 12, 31, 8, 17);


        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);


        List<Integer> result=new PrimeNumber().find(list);
        System.out.println(result);


    }

    public List<Integer> find(List<Integer> list){
        return list.stream().filter(PrimeNumber::isPrime).collect(Collectors.toList());
    }

    public static boolean isPrime(int num){
        if(num<=1) {
            return false;
        }
        for(int i=2;i<=Math.sqrt(num);i++){
            System.out.println(num+" : "+i);
            if(num%i==0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrime2(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            System.out.println(n+" : "+i);
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


}
