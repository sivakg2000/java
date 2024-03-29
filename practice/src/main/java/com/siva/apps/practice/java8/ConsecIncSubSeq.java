package com.siva.apps.practice.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;

public class ConsecIncSubSeq {


    public static void main (String[] args){

        List<Integer> list1 = Arrays.asList(1, 2, 3, 5, 6, 7, 8, 10, 11,12);
        System.out.println(new ConsecIncSubSeq().find(list1));

    }


    public List<List<Integer>> find(List<Integer> list){
        List<List<Integer>> fList=new ArrayList<>();
        ConcurrentMap<Object, List<Integer>> map=list.stream().collect(Collectors.groupingByConcurrent(i->i-list.indexOf(i)));
        fList=map.values().stream().filter(s->s.size()>=3).collect(Collectors.toList());
        System.out.println(map);

        return fList;

    }
    public List<List<Integer>> find1(List<Integer> list){
        List<List<Integer>> fList=new ArrayList<>();

        for(int i=1;i<list.size()-1;i++){

            if(list.get(i)-1==list.get(i-1) && list.get(i)+1==list.get(i+1)){
                List<Integer> tmpList=new ArrayList<>();
                tmpList.add(list.get(i-1));
                tmpList.add(list.get(i));
                tmpList.add(list.get(i+1));

                if(i+2<list.size() &&  list.get(i)+2==list.get(i+2)){
                    tmpList.add(list.get(i+2));
                }


                fList.add(tmpList);
                System.out.println(i+">>"+list.get(i));
            }

        }
         return fList;
    }
}
