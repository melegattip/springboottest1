package com.example.demo.service;

import com.example.demo.converter.Converter;
import com.example.demo.entity.Annotates;
import com.example.demo.model.Mannotates;
import com.example.demo.repository.AnnotatesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("service")
public class AnnotatesService {
    @Autowired
    @Qualifier("repository")
    private AnnotatesRepository repository;

    @Autowired
    @Qualifier("converter")
    private Converter converter;

    public boolean create(Annotates annotate) {
        try {
            repository.save(annotate);

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean modify(Annotates annotate) {
        try {
            if (annotate != null && annotate.getId() != 0) {
                repository.save(annotate);
                return true;
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean delete(String name, long id) {
        try {
            Annotates annotate = repository.findByNameAndId(name, id);
            repository.delete(annotate);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<Mannotates> get() {
        return converter.convertList(repository.findAll());
    }

    public Mannotates getNameAndTitle(String name, String title) {
        var mannotates = new Mannotates(repository.findByNameAndTitle(name, title));
        return mannotates;
    }
    public List<Mannotates> getTitle(String title) {
        return converter.convertList(repository.findByTitle(title));
    }
}


