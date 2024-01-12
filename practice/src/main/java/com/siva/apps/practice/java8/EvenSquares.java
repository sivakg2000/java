package com.siva.apps.practice.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenSquares {


    public static void main (String[] args){

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        new EvenSquares().find(list);


    }
    public boolean find(List<Integer> list) {
        List<Integer> fList=list.stream().map(n->n*n).filter(sNum->sNum%2==0).collect(Collectors.toList());
        System.out.println(fList);
        return false;
    }
}
