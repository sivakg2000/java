package com.siva.apps.SimpleRestAPI.repository;

import com.siva.apps.SimpleRestAPI.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepo extends JpaRepository<Blog, Integer> {
}
