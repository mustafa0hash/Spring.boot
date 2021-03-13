package com.apply.back.Testing;


import com.example.demo2.Comment;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "pc_fk",referencedColumnName = "id")
    public List<Comment> comments=new ArrayList<>();


    public post(){

    }

    public post(String title, String description) {
        this.title = title;
        this.description = description;
    }



    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
