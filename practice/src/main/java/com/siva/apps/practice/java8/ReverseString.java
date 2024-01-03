package com.siva.apps.practice.java8;

public class ReverseString {

    public static void  main(String[] args){

        String str="mytest";

        char[] strArray=str.toCharArray();

        char[] revArray=new char[strArray.length];
        for(int i=strArray.length;i>0;i--){
            revArray[strArray.length-i]=strArray[i-1];
        }


        System.out.println(new String(revArray));

    }
}
