package com.siva.apps.practice.java8;

import java.util.Arrays;
import java.util.List;

public class FibonacciSeries {

    public static void  main(String[] args){

    int n=10;

    int a=0,b=1;
    for(int i=1;i<=n;++i){
        System.out.println(a+" ");
        int sum=a+b;
        a=b;
        b=sum;

    }
    }
}
