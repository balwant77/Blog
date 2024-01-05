package com.Blog.BlogPost.Entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name="posts")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Post {
    private long id;
    private String title;

    private String Desc;
    private String content;

}
