package com.siva.apps.springboot.helloworld.user;

import com.siva.apps.springboot.helloworld.exception.UserNotFoundException;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class UserResource {
    private final UserDaoService service;

    public UserResource(UserDaoService service) {
        this.service = service;
    }

    @GetMapping(path = "/users")
    public List<User> getAllUsers(){
        return this.service.findAll();
    }

    @GetMapping(path = "/users/{id}")
    public User getUser(@PathVariable int id){
        User findUser=this.service.findById(id);
        if(findUser==null){
            throw new UserNotFoundException("id :"+id);
        }
        return this.service.findById(id);
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
