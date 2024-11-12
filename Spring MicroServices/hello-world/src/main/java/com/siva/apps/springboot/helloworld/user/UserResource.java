package com.siva.apps.springboot.helloworld.user;

import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.siva.apps.springboot.helloworld.exception.UserNotFoundException;
import com.siva.apps.springboot.helloworld.repository.UserRepository;
import jakarta.validation.Valid;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

@RestController
public class UserResource {

    private  final UserRepository userRepository;

    public UserResource( UserRepository userRepository) {
        this.userRepository = userRepository;

    }

    @GetMapping(path = "/users")
    public MappingJacksonValue getAllUsers(){
        MappingJacksonValue mappingJacksonValue=new MappingJacksonValue(this.userRepository.findAll());
        mappingJacksonValue.setFilters(new SimpleFilterProvider().addFilter("UserFilter", SimpleBeanPropertyFilter.filterOutAllExcept("id","name")));
        return mappingJacksonValue;
    }


    @GetMapping(path = "/users/{id}")
    public MappingJacksonValue getUser(@PathVariable int id){
        MappingJacksonValue mappingJacksonValue=new MappingJacksonValue(this.userRepository.findById(id));
        mappingJacksonValue.setFilters(new SimpleFilterProvider().addFilter("UserFilter", SimpleBeanPropertyFilter.filterOutAllExcept("id","name","age","birth_date","city","posts")));
        return mappingJacksonValue;
    }

    @GetMapping(path = "/users1/{id}")
    public EntityModel<User> getUser1(@PathVariable int id){

        Optional<User> findUser=this.userRepository.findById(id);

        if(findUser.isEmpty()){
            throw new UserNotFoundException("User not exist - "+id);
        }

        System.out.println(findUser.get());
        EntityModel<User> entityModel=EntityModel.of(findUser.get());

        WebMvcLinkBuilder link=linkTo(methodOn(this.getClass()).getAllUsers());
        entityModel.add(link.withRel("all-users"));
        return entityModel;
        //return findUser.get();
    }


    @PostMapping(path = "/users")
    public ResponseEntity<User> addUser(@Valid @RequestBody User newUser){
        this.userRepository.save(newUser);
        URI location= ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newUser.getId()).toUri();
        return ResponseEntity.created(location).build();
    }

    @PutMapping(path = "/users/{id}")
    public User updateUser(@PathVariable int id,@RequestBody User updateUser){
        //return this.userRepository.save(updateUser);
        Optional<User> findUser=this.userRepository.findById(id);
        if(findUser.isEmpty() ){
            throw new UserNotFoundException("User not exist - " + id);
        }else if (id!=updateUser.getId()){
            throw new UserNotFoundException("User mismatch - Path id : " + id+", Body Id : "+updateUser.getId());
        }

        return this.userRepository.save(updateUser);

    }


    @DeleteMapping(path = "/users/{id}")
    public void deleteUser(@PathVariable int id){
        Optional<User> findUser=this.userRepository.findById(id);

        if(findUser.isEmpty()){
            throw new UserNotFoundException("User not exist - "+id);
        }
        this.userRepository.deleteById(id);
    }
}
