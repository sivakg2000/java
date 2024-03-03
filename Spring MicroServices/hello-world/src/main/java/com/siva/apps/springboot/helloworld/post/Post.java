package com.siva.apps.springboot.helloworld.post;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Post {
    private Integer id;
    private Integer userId;
    private String description;
}
