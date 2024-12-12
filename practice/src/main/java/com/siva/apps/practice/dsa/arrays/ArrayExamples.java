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
        System.out.println("sortedSquares "+ Arrays.toString(numbers3) +", Result :"+ Arrays.toString(result3));*/

 
        arrayExamples.insertElement(-1,1000,new int[10]);
        arrayExamples.insertElement(0,1000,new int[10]);
        arrayExamples.insertElement(2,1000,new int[10]);
        arrayExamples.insertElement(33,1000,new int[10]);

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
}
