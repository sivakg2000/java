package com.siva.apps.practice.dsa.arrays;

import java.util.Arrays;

public class ArrayExamples {
    public static void main(String[] args){
        int[] numbers1= {1,1,1,1,0,1,1,1};
        ArrayExamples  arrayExamples=new ArrayExamples();
        /*int result1=arrayExamples.getMaxConsecutive1(numbers1);
        System.out.println("Max getMaxConsecutive "+ Arrays.toString(numbers1) +", Result :"+result1);
        int[] numbers2={12,13,345,2,6,7896};
        int result2=arrayExamples.findNumbers(numbers2);
        System.out.println("findNumbers "+ Arrays.toString(numbers2) +", Result :"+result2);


        int[] numbers3={-4,-1,0,3,10};
        int[] result3=arrayExamples.sortedSquares(numbers3);
        System.out.println("sortedSquares "+ Arrays.toString(numbers3) +", Result :"+ Arrays.toString(result3));


        arrayExamples.insertElement(-1,1000,new int[10]);
        arrayExamples.insertElement(0,1000,new int[10]);
        arrayExamples.insertElement(2,1000,new int[10]);
        arrayExamples.insertElement(33,1000,new int[10]);

        arrayExamples.duplicateZeros(new int[]{1, 0, 2, 3, 0, 4, 5, 0});

        arrayExamples.merge(new int[]{1,2,3,0,0,0},3,new int[]{2,5,6},3);
        arrayExamples.merge(new int[]{1},1,new int[]{},0);
        arrayExamples.merge(new int[]{0},0,new int[]{1},1);

        arrayExamples.leftShitArrayWithInit(5,new int[10]);
        arrayExamples.leftShitArrayWithInit(0,new int[10]);

        arrayExamples.leftShitArrayWithInit(2,new int[10]); */

        arrayExamples.removeElement(new int[]{3,2,2,3},3);
        arrayExamples.removeElement(new int[]{0,1,2,2,3,0,4,2},2);


    }


    public int getMaxConsecutive1(int[] nums){
        int count=0;
        int result=0;
        for(int number:nums){
            if(number==0){
                count=0;
            }else{
                count++;
                result=Math.max(result,count);
            }
        }

       return result;
    }

    public int findNumbers(int[] nums) {
        int result=0;
        for(int num:nums){
            int digits=num;
            int digitsCount=0;
            do{
                digits=digits/10;
                digitsCount++;
            }while(digits>0);

            if(digitsCount%2==0){
                result++;
            }
        }

        return result;
    }


    public int[] sortedSquares(int[] nums) {
        int[] result=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            result[i]=nums[i]*nums[i];
        }
        Arrays.sort(result);
        return result;
    }


    public void insertElement(int position,int newElement,int[] nums){



        System.out.println("Before "+ Arrays.toString(nums));

        int cPosition = 0;
        for (int i = 0; i < 5; i++) {
            nums[i] = i + 1;
            cPosition++;
        }

            if(position == -1)
            {
                nums[cPosition] = newElement;

            } else if (position>=0 && position<nums.length){
                for (int i = 5; i >=position ; i--) {
                    nums[i+1] = nums[i];

                }
                nums[position] = newElement;

            }else{
                System.out.println("Out of bound error");
            }


        System.out.println("Result :"+ Arrays.toString(nums));
    }

    public void duplicateZeros(int[] arr) {
        System.out.println("Before :"+ Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                rightShitArray(i, arr);
                i++;
            }
        }
        System.out.println("Result :"+ Arrays.toString(arr));
    }
    private void rightShitArray(int position, int[] arr){

        for (int i = arr.length-1; i >=position ; i--) {
            if(i<arr.length-1)
                arr[i+1] = arr[i];

        }
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        System.out.println("Before "+ Arrays.toString(nums1)+", "+Arrays.toString(nums2));
        for (int i=m;i<nums1.length;i++){
            nums1[i]=nums2[i-m];
        }
        Arrays.sort(nums1);
        System.out.println("After "+ Arrays.toString(nums1));
    }


    private void leftShitArrayWithInit(int position, int[] arr){

        int cPosition = 0;
        for (int i = 0; i < 5; i++) {
            arr[i] = i + 1;
            cPosition++;
        }

        System.out.println("Before "+ Arrays.toString(arr)+", "+position);
        for (int i = position;i<arr.length;i++) {
            if(i>0)
                arr[i-1] = arr[i];
        }
        System.out.println("After "+ Arrays.toString(arr));
    }



    public int removeElement(int[] nums, int val) {
        System.out.println("Before "+ Arrays.toString(nums)+", S :"+val);
        int count=0;
        for (int num : nums) {
            if (num != val) {
                count++;
            }
        }
        int[] newArray=new int[count];
        int nCount=0;
        for (int num : nums) {
            if (num != val) {
                newArray[nCount] = num;
                nCount++;
            }
        }
        Arrays.sort(newArray);
        //Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i<newArray.length)
                nums[i]=newArray[i];
        } 
        return nCount;
    }
}
