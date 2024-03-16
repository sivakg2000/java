package com.siva.apps.springboot.jpahibernate.course;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CourseSDJPA {

    @Id
    private long id;

    //@Column(name="name")
    private String name;
    private String author;


    public CourseSDJPA() {
    }

    public CourseSDJPA(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "CourseSDJPA{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
