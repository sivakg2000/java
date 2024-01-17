package com.siva.apps.practice.java;

import com.siva.apps.practice.java8.AnagramPairs;

import java.util.Arrays;

public class TWOSum {
    public static void main (String[] args){

        int[] nums = {2,7,11,15};
        new TWOSum().twoSum(nums,9);

    }
    public int[] twoSum(int[] nums, int target) {

        int[] ind=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[i]+nums[j]==target){
                    System.out.println(i+">>"+j);
                    ind[0]=i;
                    ind[1]=j;
                }
            }
        }
        return  ind;

    }
}
