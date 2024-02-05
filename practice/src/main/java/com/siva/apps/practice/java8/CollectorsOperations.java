package com.siva.apps.practice.java8;

import com.siva.apps.practice.java8.bo.Person;
import org.jeasy.random.EasyRandom;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsOperations {

    public static void main(String[] args){


        Collection<Person> mainList= new ArrayList<>();

        mainList.add(new Person("Ram","G",Person.Gender.MALE,40, "Chennai" ));
        mainList.add(new Person("Rani","S",Person.Gender.FEMALE,30, "Trichy" ));
        mainList.add(new Person("Selvam","G",Person.Gender.MALE,39, "Delhi" ));
        mainList.add(new Person("Saraswathi","L",Person.Gender.FEMALE,29, "Coimbatore" ));
        mainList.add(new Person("Saraswathi","L",Person.Gender.FEMALE,29, "Coimbatore" ));

        //toList

        List<Person> maleList=mainList.stream().filter(p->p.getGender()==Person.Gender.MALE).collect(Collectors.toList());

        System.out.println(maleList);

        //toSet

        Set<Person> femaleList=mainList.stream().filter(p->p.getGender()==Person.Gender.FEMALE).collect(Collectors.toSet());

        System.out.println(femaleList);



        //summarizingInt

        //3 method int,accumulate,combine exo ArrayList new,add,addAll

        //Customer Collectors int,accumulate,combine

        //groupingBy 1 Arg
        //groupingBy 2 Arg
        //



    }


}