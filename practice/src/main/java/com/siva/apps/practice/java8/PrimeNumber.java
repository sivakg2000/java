package com.siva.apps.practice.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrimeNumber {



    public static void  main(String[] args){

        List<Integer> numbers = Arrays.asList(2, 7, 15, 23, 12, 31, 8, 17);



        List<Integer> result=new PrimeNumber().find(numbers);
        System.out.println(result);


    }

    public List<Integer> find(List<Integer> list){
        return list.stream().filter(PrimeNumber::isPrime).collect(Collectors.toList());
    }

    public static boolean isPrime(int num){
        if(num<1)
            return false;
        for(int i=2;i<Math.sqrt(num);i++){
            if(num%i==0)
                return false;
        }
        return true;
    }


}
