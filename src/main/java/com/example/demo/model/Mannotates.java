package com.example.demo.model;

import com.example.demo.entity.Annotates;

public class Mannotates {
    private long id;
    private String name;
    private String title;
    private String content;

    public Mannotates(long id, String name, String title, String content) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.content = content;
    }

    public Mannotates(Annotates annotate){
        this.id = annotate.getId();
        this.name = annotate.getName();
        this.title = annotate.getTitle();
        this.content = annotate.getContent();
    }

    public Mannotates(){

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
