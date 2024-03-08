package com.siva.apps.springboot.helloworld.user;

import com.fasterxml.jackson.databind.ser.BeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.siva.apps.springboot.helloworld.exception.UserNotFoundException;
import jakarta.validation.Valid;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

@RestController
public class UserResource {
    private final UserDaoService service;

    public UserResource(UserDaoService service) {
        this.service = service;
    }

    @GetMapping(path = "/users")
    public MappingJacksonValue getAllUsers(){
        MappingJacksonValue mappingJacksonValue=new MappingJacksonValue(this.service.findAll());
        mappingJacksonValue.setFilters(new SimpleFilterProvider().addFilter("UserFilter", SimpleBeanPropertyFilter.filterOutAllExcept("id","name")));
        return mappingJacksonValue;
    }

    @GetMapping(path = "/users/{id}")
    public EntityModel<User> getUser(@PathVariable int id){

        User findUser=this.service.findById(id);
        if(findUser==null){
            throw new UserNotFoundException("id :"+id);
        }
        EntityModel<User> entityModel=EntityModel.of(findUser);

        WebMvcLinkBuilder link=linkTo(methodOn(this.getClass()).getAllUsers());
        entityModel.add(link.withRel("all-users"));
        return entityModel;
    }


    @PostMapping(path = "/users")
    public ResponseEntity<User> addUser(@Valid @RequestBody User newUser){
        this.service.saveUser(newUser);
        URI location= ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newUser.getId()).toUri();
        return ResponseEntity.created(location).build();
    }

    @PutMapping(path = "/users/{id}")
    public User updateUser(@PathVariable int id,@RequestBody User updateUser){
        return this.service.updateUser(updateUser,id);
    }


    @DeleteMapping(path = "/users/{id}")
    public List<User> deleteUser(@PathVariable int id){
        return this.service.deleteUser(id);
    }
}
