package com.siva.apps.practice.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntersectTwoList {

    public static void  main(String[] args){

        List<Integer> list1= Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2= Arrays.asList(3, 4, 5, 6, 7);

        System.out.println(new IntersectTwoList().find(list1,list2));
    }
    public List<Integer> find(List<Integer> l1,List<Integer> l2){
        return  l1.stream().filter(l2::contains).collect(Collectors.toList());
        //return l1.stream().filter(n1-> this.isAvail(n1,l2)).collect(Collectors.toList());
    }

    private boolean isAvail(int n,List<Integer> l2){
        return l2.contains(n);
    }


}
