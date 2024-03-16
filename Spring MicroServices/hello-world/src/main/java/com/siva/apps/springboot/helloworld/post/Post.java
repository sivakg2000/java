package com.siva.apps.springboot.helloworld.post;


import com.siva.apps.springboot.helloworld.user.User;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Post {
    @Id
    private Integer id;

    @ManyToOne
    private User user;


    private String description;
}
