package com.example.demo.posts;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository
        extends JpaRepository<Post, Long> {
}


