package com.siva.apps.springboot.helloworld.user;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.siva.apps.springboot.helloworld.post.Post;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;


@Entity
@AllArgsConstructor
@Getter
@Setter
@ToString
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

    /*@OneToMany(fetch = FetchType.LAZY)
    private List<Post> posts;*/

}
