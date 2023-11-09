package com.abe.tehamaProject.controller;

import com.abe.tehamaProject.entity.University;
import com.abe.tehamaProject.services.UniversityServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/university")
@CrossOrigin("*")
public class UniversityController {
    @Autowired
    public UniversityServices services;

   @PostMapping
   public University addUniversity(@RequestBody University university){
        return services.addUniversity(university);
    }
    @GetMapping
    public List<University> getAll(){
       return services.getAll();
    }

    @GetMapping("/{universityId}")
    public Optional<University> getOne(@PathVariable Integer universityId){
       return services.getOne(universityId);
    }

    @DeleteMapping("/{universityId}")
    public void deleteUniversity(@PathVariable Integer universityId){
       services.deleteOne(universityId);
    }

    @PutMapping("{universityId}")
    public University updateUniversity(@RequestBody University university,@PathVariable Integer universityId){
       university.setUniversityId(universityId);
       return services.updateUniversity(university);
    }
}
