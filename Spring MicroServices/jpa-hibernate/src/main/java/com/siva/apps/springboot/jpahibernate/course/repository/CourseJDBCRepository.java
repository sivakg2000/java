package com.siva.apps.springboot.jpahibernate.course.repository;


import com.siva.apps.springboot.jpahibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJDBCRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    private static String INSERT_Q = """
                INSERT INTO COURSE(id,name,author) VALUES(?,?,?);
            """;
    private static String DELETE_Q = """
                DELETE FROM COURSE WHERE id=?;
            """;

    private static String UPDATE_Q = """
                UPDATE COURSE SET name=?,author=? WHERE id=?;
            """;

    private static String SELECT_Q = """
                SELECT * FROM COURSE WHERE id=?;
            """;
    public void insert(Course course) {
        jdbcTemplate.update(INSERT_Q,course.getId(),course.getName(),course.getAuthor());
    }

    public void deleteById(int id) {
        jdbcTemplate.update(DELETE_Q,id);
    }

    public void updateById(Course course) {
        jdbcTemplate.update(UPDATE_Q,course.getName(),course.getAuthor(),course.getId());
    }

    public Course findById(int id) {
        return jdbcTemplate.queryForObject(SELECT_Q,new BeanPropertyRowMapper<>(Course.class),id);
    }
}
