package com.siva.apps.springboot.jpahibernate.course.repository;

import com.siva.apps.springboot.jpahibernate.course.CourseSDJPA;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CourseSpringDataJPARepository extends JpaRepository<CourseSDJPA,Long> {


    List<CourseSDJPA> findByName(String name);
}
