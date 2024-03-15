package com.siva.apps.springboot.jpahibernate.course;

import com.siva.apps.springboot.jpahibernate.course.repository.CourseJDBCRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJDBCCommandLineRunner implements CommandLineRunner {


    @Autowired
    private CourseJDBCRepository courseJDBCRepository;
    @Override
    public void run(String... args) throws Exception {
        courseJDBCRepository.insert(new Course(1,"Learn AWS","Siva K"));
        courseJDBCRepository.insert(new Course(2,"Fundamentals of AWS","Pragatheeswaran S"));
        courseJDBCRepository.insert(new Course(3,"Advance Services of AWS","Pranav S"));


        courseJDBCRepository.deleteById(1);

        courseJDBCRepository.updateById(new Course(3,"Advance Services of AWS-Updated","Pranav S-Updated"));

        Course sel=courseJDBCRepository.findById(3);

        System.out.println(sel);
    }
}
