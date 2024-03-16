package com.siva.apps.springboot.jpahibernate.course.repository;

import com.siva.apps.springboot.jpahibernate.course.Course;
import com.siva.apps.springboot.jpahibernate.course.CourseJPA;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CourseJPARepository {

    @PersistenceContext
    private EntityManager entityManager;
    public void insert(CourseJPA course) {
        entityManager.merge(course);
    }

    public void deleteById(int id) {
        CourseJPA fCourse=entityManager.find(CourseJPA.class,id);
        entityManager.remove(fCourse);
    }

    public void updateById(CourseJPA course) {
        entityManager.merge(course);
    }

    public CourseJPA findById(int id) {
        return entityManager.find(CourseJPA.class,id);
    }
}
