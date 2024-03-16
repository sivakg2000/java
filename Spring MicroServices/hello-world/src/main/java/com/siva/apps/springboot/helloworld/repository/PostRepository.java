package com.siva.apps.springboot.helloworld.repository;

import com.siva.apps.springboot.helloworld.post.Post;
import com.siva.apps.springboot.helloworld.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Integer>{

}
