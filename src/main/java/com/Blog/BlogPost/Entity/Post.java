package com.Blog.BlogPost.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name="blog")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;

    private String description;
    private String content;

}
