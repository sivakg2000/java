package com.siva.apps.practice.ems;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args){




        Application app=new Application();

        List<Employee> employees=app.intEmployeeList();
        employees.forEach(System.out::println);
        app.getEmployeeListSalary50K(employees);
        app.getEmployeeListSortBySalary(employees);
        app.getEmployeeListGroupByDepartment(employees);
        app.getEmployeeAvgAge(employees);
        app.getEmployeeAvgSalary(employees);

    }

    public List<Employee> intEmployeeList(){


        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1, "Alice", 30, "HR", 50000));
        employees.add(new Employee(2, "Bob", 28, "IT", 60000));
        employees.add(new Employee(3, "Charlie", 35, "Finance", 75000));
        employees.add(new Employee(4, "David", 32, "Marketing", 55000));
        employees.add(new Employee(5, "Eva", 27, "HR", 48000));

        return employees;


    }



    public List<Employee> getEmployeeListSalary50K(List<Employee> list){

        System.out.println("---------50K> Start -----------");
        return list.stream().filter(emp->emp.salary>50000).collect(Collectors.toList());
       

    }


    public void getEmployeeListSortBySalary(List<Employee> list){


        System.out.println("---------Sort By Salary> Start -----------");
        list.stream().sorted(Comparator.comparing(o ->  o.salary)).forEach(System.out::println);
        System.out.println("---------Sort By Salary> End -----------");

    }



    public void getEmployeeListGroupByDepartment(List<Employee> list){

        System.out.println("--------- Group By Department> Start -----------");
        list.stream().collect(Collectors.groupingBy(Employee::getDepartment)).forEach((k,v)->System.out.println(k+" : "+v));
        System.out.println("---------Group By Department> End -----------");

    }



    public void getEmployeeAvgAge(List<Employee> list){

        System.out.println("--------- Avg Age > Start -----------");
        System.out.println(list.stream().mapToInt(Employee::getAge).average().orElse(0.0));
        System.out.println("--------- Avg Age> End -----------");

    }



    public void getEmployeeAvgSalary(List<Employee> list){

        System.out.println("--------- Avg Salary > Start -----------");
        System.out.println(list.stream().mapToDouble(Employee::getSalary).average().orElse(0.0));
        System.out.println("--------- Avg Salary> End -----------");

    }



}
