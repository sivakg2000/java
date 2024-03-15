package com.siva.apps.springboot.jpahibernate.course.repository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJDBCRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    private static String INSERT_Q = """
                INSERT INTO COURSE(id,name,author) VALUES(1,'AWS Fundamentals','Siva CR');
            """;

    public void insert() {
        jdbcTemplate.update(INSERT_Q);
    }
}
