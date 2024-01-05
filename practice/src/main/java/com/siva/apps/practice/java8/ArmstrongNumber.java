package com.siva.apps.practice.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArmstrongNumber {

    public static void  main(String[] args){
        int number1 = 153; // Armstrong number
        int number2 = 370; // Armstrong number
        int number3 = 123; // Not an Armstrong number
        System.out.println(new ArmstrongNumber().find(number1));
        System.out.println(new ArmstrongNumber().find(number2));
        System.out.println(new ArmstrongNumber().find(number3));




    }

    public boolean find(int num){

        if(num>99 && num<1000){
            int sum=0;
            int orgNum=num;
            while(num>0){
                int digit=num%10;
                sum+= (int) Math.pow(digit,3);
                num=num/10;
            }
            System.out.println(sum);
            return orgNum==sum;
        }
        return false;
    }

}
