package com.example.demo.controller;

import com.example.demo.entity.Annotates;
import com.example.demo.service.AnnotatesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class AnnotatesController {

    @Autowired
    @Qualifier("service")
    AnnotatesService service;

    @PutMapping("/annotates")
    public Boolean addAnnotate (@RequestBody @Validated Annotates annotate){

        return service.create(annotate);

    }

    @PostMapping("/annotates")
    public boolean modifyAnnotate (@RequestBody @Validated Annotates annotate){
        return service.modify(annotate);
    }

    @DeleteMapping("/annotate/{id}/{name}")
    public boolean deleteAnnotate (@PathVariable("id") long id, @PathVariable("name") String name){

        return service.delete(name, id);
    }

}
