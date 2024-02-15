package com.siva.apps.SimpleRestAPI.service.implementation;

import com.siva.apps.SimpleRestAPI.dao.BlogDao;
import com.siva.apps.SimpleRestAPI.model.Blog;
import com.siva.apps.SimpleRestAPI.repository.BlogRepo;
import com.siva.apps.SimpleRestAPI.service.BlogService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BlogServiceImpl implements BlogService {
    private final BlogRepo blogRepo;

    public BlogDao createBlog(BlogDao blogDao){
        Blog blog=blogDaoToBlog(blogDao);
        blogRepo.save(blog);
        return blogDao;
    }

    private Blog blogDaoToBlog(BlogDao blogDao) {
        Blog blog=new Blog();
        //blog.setContent(blogDao.g);
        return blog;
    }
}
