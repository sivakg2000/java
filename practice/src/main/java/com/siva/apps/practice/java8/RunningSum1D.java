package com.siva.apps.practice.java8;

import java.util.Arrays;
import java.util.List;

public class RunningSum1D {

    public static void  main(String[] args){

        int[] list  ={3,1,2,10,1};
        int[] newList=new int[list.length];

        int sVal=0;
        for(int i=0;i<list.length;i++){
            sVal=sVal+list[i];
            newList[i]=sVal;
        }
       Arrays.stream(newList).forEach(System.out::println);



    }


}
