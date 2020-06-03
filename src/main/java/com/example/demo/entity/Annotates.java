package com.example.demo.entity;

import javax.persistence.*;

@Table(name="annotates")
@Entity
public class Annotates {
    @GeneratedValue
    @Id

    @Column(name = "ID_Anottates")
    private long id;

    @Column(name = "Name")
    private String name;

    @Column(name = "Title")
    private String title;

    @Column(name = "Content")
    private String content;

    public Annotates(){
    }
    public Annotates(long id, String name, String title, String content) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.content = content;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

}
