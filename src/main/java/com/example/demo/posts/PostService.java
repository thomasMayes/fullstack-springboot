package com.example.demo.posts;




import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service

public class PostService {

    private final PostRepository postRepository;


    public List<Post> getAllPosts() {

      return postRepository.findAll();

    }

}
