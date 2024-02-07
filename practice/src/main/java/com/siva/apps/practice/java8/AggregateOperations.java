package com.siva.apps.practice.java8;

import com.siva.apps.practice.java8.bo.Person;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class AggregateOperations {

    public static void main(String[] args){
        Collection<Person> mainList= new ArrayList<>();

        mainList.add(new Person("Ram","G",Person.Gender.MALE,40, "Chennai" ));
        mainList.add(new Person("Rani","S",Person.Gender.FEMALE,30, "Trichy" ));
        mainList.add(new Person("Selvam","G",Person.Gender.MALE,39, "Delhi" ));
        mainList.add(new Person("Saraswathi","L",Person.Gender.FEMALE,29, "Coimbatore" ));
        mainList.add(new Person("Saraswathi","L",Person.Gender.FEMALE,29, "Coimbatore" ));



        //count

        long maleCount=mainList.stream().filter(p->p.getGender()== Person.Gender.MALE).count();
        System.out.println("maleCount :"+maleCount);

        //average

        double maleAvgAge=mainList.stream().filter(p->p.getGender()== Person.Gender.MALE).mapToInt(Person::getAge).average().orElse(0.0);
        System.out.println("maleAvgAge :"+maleAvgAge);

        //max

        int maleMaxAge=mainList.stream().filter(p->p.getGender()== Person.Gender.MALE).mapToInt(Person::getAge).max().orElse(0);
        System.out.println("maleMaxAge :"+maleMaxAge);

        
        //sum


        //reduce
        //IntBinaryOperator //maxFemaleAge //lambdaExp minMaleAge //sumFemaleAge








    }


}
