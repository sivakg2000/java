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
        courseJDBCRepository.insert();
    }
}
