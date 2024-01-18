package com.siva.apps.practice.java;

public class BuySellStock {


    public static void main (String[] args){

        int[] prices = {7,1,5,3,6,4};
        new BuySellStock().maxProfit(prices);

    }

    public int maxProfit(int[] prices) {

        int min=10;
        int minIndex=-1;

        int max=0;
        int maxIndex=-1;


        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
                minIndex=i;
            }
        }


        for(int i=minIndex;i<prices.length;i++){
            if(prices[i]>max){
                max=prices[i];
                maxIndex=i;
            }
        }
        System.out.println(minIndex+">>"+min);
        System.out.println(maxIndex+">>"+max);

        return  max-min;
    }
}
