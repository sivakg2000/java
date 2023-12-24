package com.siva.apps.practice.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntMergeList {



    public static void  main(String[] args){

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> list2 = Arrays.asList(5, 6, 7, 8);

        List<Integer> mList=new IntMergeList().merge(list1,list2);

        System.out.println((mList));


    }

    public List<Integer>  merge(List<Integer> list1,List<Integer> list2){
        return IntStream.range(0,Math.min(list1.size(),list1.size())).mapToObj(i->Arrays.asList(list1.get(i),list2.get(i))).flatMap(List::stream).collect(Collectors.toList());
    }
}
