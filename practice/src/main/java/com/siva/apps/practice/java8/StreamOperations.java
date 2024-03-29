package com.siva.apps.practice.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperations {

    public static void main(String[] args){
        List<Integer> mainList= Arrays.asList(-1,1,2,3,4,5,6,5,6,7,8,9);
        StreamOperations sOperation=new StreamOperations();
        sOperation.countMethod(mainList);
        sOperation.predicateMethod(mainList);
        sOperation.lambdaExp(mainList);

        sOperation.filter(mainList);


    }

    private void countMethod(List<Integer> mainList){
        System.out.println(mainList.stream().count());
        System.out.println(mainList.stream().distinct().count());
        System.out.println(mainList.stream().limit(5).count());
        System.out.println(mainList.stream().skip(5).count());

    }


    private void predicateMethod(List<Integer> mainList){

        System.out.println("predicateMethod");
        boolean resGreater50=mainList.stream().allMatch(new Predicate<Integer>() {

            @Override
            public boolean test(Integer integer) {
                return integer>50;
            }
        });

        System.out.println("resGreater50 :"+resGreater50);
        boolean anyLessThan0=mainList.stream().anyMatch(new Predicate<Integer>(){
            @Override
            public boolean test(Integer integer){
                return integer <0;
            }
        });
        System.out.println("anyLessThan0 :"+anyLessThan0);

    }




    private void lambdaExp(List<Integer> mainList){

        System.out.println("lambdaExp");
        boolean resGreater50=mainList.stream().anyMatch(i->i>50);

        System.out.println("resGreater50 :"+resGreater50);
        boolean anyLessThan0=mainList.stream().anyMatch(i->i<0);
        System.out.println("anyLessThan0 :"+anyLessThan0);

    }


    private void filter(List<Integer> mainList){

        Stream<Integer> f1=mainList.stream().filter(n->n<5);
        System.out.println("LessThan5 :"+Arrays.toString(f1.toArray()));
        long cVal=mainList.stream().filter(n->n<5).distinct().count();
        System.out.println("LessThan5 Count :"+cVal);
    }

}
