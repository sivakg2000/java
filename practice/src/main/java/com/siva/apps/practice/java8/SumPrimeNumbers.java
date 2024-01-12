package com.siva.apps.practice.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumPrimeNumbers {



    public static void main (String[] args){

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
       // List<Integer> list = Arrays.asList(2, 7, 15, 23, 12, 31, 8, 17);
        new SumPrimeNumbers().find(list);


    }
    public int find(List<Integer> list) {
        List<Integer> fList=list.stream().filter(this::isPrime).collect(Collectors.toList());
        System.out.println(fList);
        return 0;
    }

    private boolean isPrime(int num){
        if(num<=1)
            return false;
        for(int i=2;i<Math.sqrt(num);i++){
            if(num%i==0)
                return false;
        }
        return  true;

    }
}
