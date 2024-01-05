package com.Blog.BlogPost.Service.Impl;

import com.Blog.BlogPost.Entity.Post;
import com.Blog.BlogPost.Payload.PostDto;
import com.Blog.BlogPost.Repository.PostRepository;
import com.Blog.BlogPost.Service.PostService;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {

    private PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public PostDto createPost(PostDto postDto) {
        Post post=new Post();
        post.setTitle(postDto.getTitle());
        post.setDescription(postDto.getDescription());
        post.setContent(postDto.getContent());
        Post saved = postRepository.save(post);
        PostDto dto=new PostDto();
        dto.setTitle(saved.getTitle());
        dto.setDescription(saved.getDescription());
        dto.setContent(saved.getContent());


        return dto;
    }
}
