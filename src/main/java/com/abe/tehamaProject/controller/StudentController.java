package com.abe.tehamaProject.controller;

import com.abe.tehamaProject.entity.Student;
import com.abe.tehamaProject.services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/student")
@CrossOrigin("*")
public class StudentController {
    @Autowired
    public StudentServices services;

    @PostMapping
    public Student addStudent(@RequestBody Student  student){
        return services.add(student);
    }

    @GetMapping
    public List<Student> getAll(){
        return services.getAll();
    }
    @GetMapping("/{studentId}")
    public Optional<Student> getOne(@PathVariable String studentId){
        return services.getOne(studentId);
    }
    @DeleteMapping("/{studentId}")
    public void deleteStudent(@PathVariable String studentId){
        services.deleteOne(studentId);
    }
    @PutMapping("/{studentId}")
    public Student updateStudent(@RequestBody Student  student,@PathVariable String studentId){
        student.setStudentId(studentId);
        return services.updateStudent(student);
    }
    @GetMapping("/count/male")
    public long getMaleStudentsCount() {
        return services.countMaleStudents();
    }

    @GetMapping("/count/female")
    public long getFemaleStudentsCount() {
        return services.countFemaleStudents();
    }

}
