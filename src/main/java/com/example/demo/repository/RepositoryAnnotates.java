package com.example.demo.repository;

import com.example.demo.entity.Annotates;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository("repository")
public interface RepositoryAnnotates extends JpaRepository<Annotates, Serializable> {
    public abstract Annotates findByName (String name);
    public abstract List<Annotates> findByTitle (String title);
    public abstract Annotates findByNameAndTitle (String name, String title);
    public abstract Annotates findByNameAndId (String name, long id);


}
