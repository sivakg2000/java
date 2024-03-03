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
    private static int usersAutoIncId=0;

    static{
        users.add(new User(++usersAutoIncId,"Siva", LocalDate.now().minusYears(40)));
        users.add(new User(++usersAutoIncId,"Pragatheeswaran", LocalDate.now().minusYears(7)));
        users.add(new User(++usersAutoIncId,"Pranav", LocalDate.now().minusYears(3)));
    }

    public List<User> findAll(){
        return  users;
    }

    public User findById(int id){
        Optional<User> userById=users.stream().filter(u -> u.getId()==id).findFirst();
        return userById.orElse(null);
        //return users.stream().filter(u -> u.getId()==id).findFirst().get();
    }

    public User saveUser(User userInfo){
        if(userInfo!=null){
                    userInfo.setId(++usersAutoIncId);
            users.add(userInfo);
        }
        return userInfo;
    }

    public User updateUser(User userInfo,int id){
        users=users.stream().filter(u -> !Objects.equals(u.getId(), id)).collect(Collectors.toList());
        userInfo.setId(id);
        users.add(userInfo);
        return userInfo;
    }
    public List<User> deleteUser(int id){
        //users=users.stream().filter(u -> u.getId()!=id).collect(Collectors.toList());
        users.removeIf(u -> u.getId()==id);
        return  users;
    }



}
