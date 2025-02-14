package com.siva.apps.practice.dailycoding.leetcode;

import java.util.Arrays;

public class MinOperations {

    public static void main(String[] args){
        int[] num={2,11,10,1,3};
        int k=10;
        int result=new MinOperations().minOperations(num,k);
        System.out.println("Result :"+result);

        int[] num1={1,1,2,4,9};
        int k1=20;
        int result1=new MinOperations().minOperations(num1,k1);
        System.out.println("Result1 :"+result1);
    }

    public int minOperations(int[] nums, int k) {

        int iteration=0;
        while (!check(nums,k)){
            ++iteration;
            System.out.println("---------------Start : "+iteration);
            nums=doOperation(nums);
            System.out.println("--------------- End : "+iteration);
        }
        return iteration;
    }

    public boolean check(int[] nums, int k){
        boolean rValue=true;
        for(int r:nums){
            if(r<k){
               rValue=false;
            }
        }

        return rValue;
    }

    public int[] doOperation(int[] nums){
        System.out.println(Arrays.toString(nums));
        int[] tMin=getTwoMin(nums);
        System.out.println(Arrays.toString(tMin));
        int newVal=Math.min(tMin[0],tMin[1])*2+Math.max(tMin[0],tMin[1]);
        System.out.println("new Value : "+newVal);
        int[] nNums1=remove(nums,tMin[0]);
        System.out.println(Arrays.toString(nNums1));
        int[] nNums2=remove(nNums1,tMin[1]);
        System.out.println(Arrays.toString(nNums2));
        int[] nNums=add(nNums2,newVal);
        System.out.println(Arrays.toString(nNums));
        return nNums;
    }

    public int[] getTwoMin(int[] n){
        int[] val=new int[2];
        int a=Integer.MAX_VALUE,b=Integer.MAX_VALUE;
        for (int k : n) {
            if (k < a) {
                a = k;
            }
        }

        System.out.println("1 : "+Arrays.toString(n));
        int[] n1=remove(n,a);

        System.out.println("2 : "+Arrays.toString(n1));
        for (int j : n1) {
            if (j < b ) {
                b = j;
            }
        }
        val[0]=a;
        val[1]=b;
        return val;
    }

    public int[] remove(int[] s,int e){
        int[] nS=new int[s.length-1];
        int k=0;
        for(int i=0;i<s.length;i++){
            if(s[i]==e){
                continue;
            }
            nS[k++]=s[i];
        }
        return nS;
    } 
    public int[] add(int[] s,int e){
        int[] nS=new int[s.length+1];
        for(int i=0;i<s.length;i++){
            nS[i]=s[i];
        }
        nS[s.length]=e;
        return nS;
    }


}
