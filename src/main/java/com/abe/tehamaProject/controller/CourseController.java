package com.abe.tehamaProject.controller;

import com.abe.tehamaProject.entity.CourseStudy;
import com.abe.tehamaProject.services.CourseServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/course")
@CrossOrigin("*")
public class CourseController {
    @Autowired
    public CourseServices services;

   @PostMapping
    public CourseStudy addCourse(@RequestBody CourseStudy courseStudy){
        return services.addCourse(courseStudy);
    }
   @GetMapping
    public List<CourseStudy> getAll(){
       return services.getAll();
    }

    @GetMapping("/{courseId}")
    public Optional<CourseStudy> findOne(@PathVariable Integer courseId){
       return services.getOne(courseId);

    }
    @DeleteMapping("/{courseId}")
    public void deleteCourse(@PathVariable Integer courseId){
       services.deleteOne(courseId);
    }
    @PutMapping("{courseId}")
    public CourseStudy updateCourseStudy(@RequestBody CourseStudy courseStudy,@PathVariable Integer courseId){
       courseStudy.setCourseId(courseId);
       return services.updateCourse(courseStudy);
    }
}
