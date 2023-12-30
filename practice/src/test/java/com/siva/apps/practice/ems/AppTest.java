package com.siva.apps.practice.ems;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;




public class AppTest {

    Application app=new Application();
    List<Employee> list=app.intEmployeeList();

    @Test
    public void getEmployeeListSalary50K(){

        List<Employee> rList=app.getEmployeeListSalary50K(list);
        assertTrue(rList.get(0).salary>50000);

    }



}
