package com.siva.apps.springboot.helloworld.user;

import org.springframework.web.bind.annotation.*;

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
        return this.service.findById(id);
    }


    @PostMapping(path = "/users")
    public User addUser(@RequestBody User newUser){
        return this.service.saveUser(newUser);
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
