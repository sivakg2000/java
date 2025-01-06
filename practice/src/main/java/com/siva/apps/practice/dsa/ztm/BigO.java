package com.siva.apps.practice.dsa.ztm;

import java.util.Arrays;

public class BigO {
    public static  void main(String[] args){
        String[] a1={"nemo"};
        String[] a2={"dory","bruce","marlin","nemo","gill","bloat","nigel","squirt","darla","hank"};
        String[] a3 = new String[100000];
        Arrays.fill(a3,"nemo");
        findNemo("nemo",a3);
    }

    public static void findNemo(String fElement,String[] array){
        long sTime=System.currentTimeMillis();
        for(String ele:array){
         if(fElement.equals(ele)){
             System.out.println("Fount "+fElement);
         }
        }
        System.out.println("Time Taken "+(System.currentTimeMillis()-sTime));

    }
}
