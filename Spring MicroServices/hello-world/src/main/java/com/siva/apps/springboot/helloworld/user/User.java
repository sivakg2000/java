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
@NoArgsConstructor
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


    @OneToMany(fetch = FetchType.LAZY)
    private List<Post> posts;


}
