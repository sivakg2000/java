package com.siva.apps.springboot.helloworld.user;


import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class UserDaoService {

    private static List<User> users=new ArrayList<>();

    static{
        users.add(new User(1,"Siva", LocalDate.now().minusYears(40)));
        users.add(new User(2,"Pragatheeswaran", LocalDate.now().minusYears(7)));
        users.add(new User(3,"Pranav", LocalDate.now().minusYears(3)));
    }

    public List<User> findAll(){
        return  users;
    }

    public User findById(int id){
        Optional<User> userById=users.stream().filter(u -> u.getId()==id).findFirst();
        return userById.orElse(null);
    }

    public void saveUser(User userInfo){
        if(userInfo!=null){
            users.add(userInfo);
        }
    }

    public void updateUserById(User userInfo){
        users=users.stream().filter(u -> !Objects.equals(u.getId(), userInfo.getId())).collect(Collectors.toList());
        users.add(userInfo);
    }
    public void deleteUser(int id){
        users=users.stream().filter(u -> u.getId()!=id).collect(Collectors.toList());
    }



}
