package com.siva.apps.practice.ems;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Application {
    public static void main(String[] args){


        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1, "Alice", 30, "HR", 50000));
        employees.add(new Employee(2, "Bob", 28, "IT", 60000));
        employees.add(new Employee(3, "Charlie", 35, "Finance", 75000));
        employees.add(new Employee(4, "David", 32, "Marketing", 55000));
        employees.add(new Employee(5, "Eva", 27, "HR", 48000));

        employees.forEach(System.out::println);



        new Application().getEmployeeListSalary50K(employees);
        new Application().getEmployeeListSortBySalary(employees);

    }


    public void getEmployeeListSalary50K(List<Employee> list){
        System.out.println("---------50K> Start -----------");
        list.stream().filter(emp->emp.salary>50000).forEach(System.out::println);
        System.out.println("---------50K> End -----------");

    }


    public void getEmployeeListSortBySalary(List<Employee> list){



        System.out.println("---------Sort By Salary> Start -----------");
        list.stream().sorted(Comparator.comparing(o ->  o.salary)).forEach(System.out::println);
        System.out.println("---------Sort By Salary> End -----------");

    }


}
