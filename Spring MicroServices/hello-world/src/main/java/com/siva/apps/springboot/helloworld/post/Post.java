package com.siva.apps.springboot.helloworld.post;


import com.siva.apps.springboot.helloworld.user.User;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Post {
    @Id
    private Integer id;

    @ManyToOne
    private User userInfo;

    private String description;
}
