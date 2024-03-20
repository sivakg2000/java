package com.siva.apps.springboot.helloworld.user;

import com.fasterxml.jackson.annotation.*;
import com.siva.apps.springboot.helloworld.post.Post;
import jakarta.persistence.*;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDate;
import java.util.List;


@Entity(name = "user_details")
/*@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString*/
//@JsonIgnoreProperties({"age","city"})
@JsonFilter("UserFilter")
public class User {
    @Id
    private Integer id;

    @Size(min = 3,message = "Username should min 3 characters")
    private String name;

    @Past(message = "BirthDay Should be in Past")
    @JsonProperty("birth_date")
    private LocalDate birthDate;

    //@JsonIgnore
    private  int age;

    private  String city;


    @OneToMany(fetch = FetchType.LAZY)
    private List<Post> posts;


    public User() {
    }

    public User(Integer id, String name, LocalDate birthDate, int age, String city, List<Post> posts) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.age = age;
        this.city = city;
        this.posts = posts;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", age=" + age +
                ", city='" + city + '\'' +
                ", posts=" + posts +
                '}';
    }
}
