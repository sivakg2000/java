package com.siva.apps.springboot.helloworld.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
@Setter
@ToString
//@JsonIgnoreProperties({"age","city"})
public class User {
    private Integer id;

    @Size(min = 3,message = "Username should min 3 characters")
    private String name;

    @Past(message = "BirthDay Should be in Past")
    @JsonProperty("birth_date")
    private LocalDate birthDate;

    @JsonIgnore
    private  int age;

    private  String city;

}
