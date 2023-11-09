package com.abe.tehamaProject.controller;

import com.abe.tehamaProject.entity.EducationLevel;
import com.abe.tehamaProject.services.EducationServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/education")
@CrossOrigin("*")
public class EducationLevelController {
    @Autowired
    public EducationServices services;

    @PostMapping
    public EducationLevel addEducationLevel(@RequestBody EducationLevel educationLevel){
        return services.add(educationLevel);
    }
    @GetMapping
    public List<EducationLevel> getAll(){
        return services.getAll();
    }
    @GetMapping("{educationId}")
    public Optional<EducationLevel> getOne(@PathVariable Integer educationId){
        return services.getOne(educationId);
    }
    @DeleteMapping("{educationId}")
    public void deleteEducation(@PathVariable Integer educationId){
        services.deleteEducation(educationId);
    }

    @PutMapping("{educationId}")
    public EducationLevel updateEducation(@RequestBody EducationLevel educationLevel,@PathVariable Integer educationId){
        educationLevel.setEducationId(educationId);
        return services.updateEducation(educationLevel);
    }
}
