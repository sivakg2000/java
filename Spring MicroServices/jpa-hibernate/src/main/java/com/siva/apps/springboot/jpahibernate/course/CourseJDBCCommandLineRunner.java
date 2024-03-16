package com.siva.apps.springboot.jpahibernate.course;

import com.siva.apps.springboot.jpahibernate.course.repository.CourseJDBCRepository;
import com.siva.apps.springboot.jpahibernate.course.repository.CourseJPARepository;
import com.siva.apps.springboot.jpahibernate.course.repository.CourseSpringDataJPARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJDBCCommandLineRunner implements CommandLineRunner {


    @Autowired
    private CourseJDBCRepository courseJDBCRepository;

    @Autowired
    private CourseJPARepository courseJPARepository;


    @Autowired
    private CourseSpringDataJPARepository courseSpringDataJPARepository;
    @Override
    public void run(String... args) throws Exception {

        courseJDBCRepository.insert(new Course(1,"Learn AWS","Siva K"));
        courseJDBCRepository.insert(new Course(2,"Fundamentals of AWS","Pragatheeswaran S"));
        courseJDBCRepository.insert(new Course(3,"Advance Services of AWS","Pranav S"));


        courseJDBCRepository.deleteById(1);
        courseJDBCRepository.updateById(new Course(3,"Advance Services of AWS-Updated","Pranav S-Updated"));
        Course sel=courseJDBCRepository.findById(3);
        System.out.println(sel);



        courseJPARepository.insert(new CourseJPA(1,"Learn AWS","Siva K"));
        courseJPARepository.insert(new CourseJPA(2,"Fundamentals of AWS","Pragatheeswaran S"));
        courseJPARepository.insert(new CourseJPA(3,"Advance Services of AWS","Pranav S"));


        courseJPARepository.deleteById(1);
        courseJPARepository.updateById(new CourseJPA(3,"Advance Services of AWS-Updated","Pranav S-Updated"));
        CourseJPA selJPA=courseJPARepository.findById(3);
        System.out.println(selJPA);




        courseSpringDataJPARepository.save(new CourseSDJPA(1,"Learn AWS","Siva K"));
        courseSpringDataJPARepository.save(new CourseSDJPA(2,"Fundamentals of AWS","Pragatheeswaran S"));
        courseSpringDataJPARepository.save(new CourseSDJPA(3,"Advance Services of AWS","Pranav S"));


        courseSpringDataJPARepository.deleteById(1l);
        courseSpringDataJPARepository.save(new CourseSDJPA(3,"Advance Services of AWS-Updated","Pranav S-Updated"));
        CourseSDJPA selSDJPA=courseSpringDataJPARepository.findById(3l).get();
        System.out.println(selSDJPA);

        courseSpringDataJPARepository.findAll().forEach(System.out::println);

        courseSpringDataJPARepository.findByName("Fundamentals of AWS").forEach(System.out::println);
    }
}
