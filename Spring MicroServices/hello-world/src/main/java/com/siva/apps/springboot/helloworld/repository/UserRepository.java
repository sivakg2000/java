package com.siva.apps.springboot.helloworld.repository;

import com.siva.apps.springboot.helloworld.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer>{

}
