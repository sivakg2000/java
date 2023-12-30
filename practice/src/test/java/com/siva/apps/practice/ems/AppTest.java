package com.siva.apps.practice.ems;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;



public class AppTest {

    Application app=new Application();
    List<Employee> list=app.intEmployeeList();

    @Test
    public void getEmployeeListSalary50K(){

        app.getEmployeeListSalary50K();

    }



}
