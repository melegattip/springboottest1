package com.example.demo.converter;

import com.example.demo.entity.Annotates;
import com.example.demo.model.Mannotates;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("converter")
public class Converter {
    public List<Mannotates> convertList (List<Annotates> annotatesList){
        List<Mannotates> mannotatesList = new ArrayList<>();
        for (Annotates annotate: annotatesList) {
                mannotatesList.add(new Mannotates(annotate));
        }
        return mannotatesList;
    }
}
