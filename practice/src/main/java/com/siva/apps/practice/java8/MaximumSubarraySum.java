package com.siva.apps.practice.java8;

/**
 * This program uses Kadane's algorithm to find the maximum subarray sum.
 * It iterates through the array, keeping track of the current sum and the maximum sum encountered so far.
 */
public class MaximumSubarraySum {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSum = new MaximumSubarraySum().maxSubArray(nums);
        System.out.println("Maximum subarray sum: " + maxSum);
    }

    public  int maxSubArray(int[] nums) {
        int maxSum=nums[0];
        int currentSum=nums[0];
        for(int i=1;i<nums.length;i++){
            currentSum=Math.max(nums[i],currentSum+nums[i]);
            maxSum=Math.max(maxSum,currentSum);
        }
        return  maxSum;
    }
}
