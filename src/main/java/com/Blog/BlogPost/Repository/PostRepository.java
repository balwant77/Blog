package com.Blog.BlogPost.Repository;

import com.Blog.BlogPost.Entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {

}
