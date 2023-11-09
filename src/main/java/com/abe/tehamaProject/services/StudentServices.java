package com.abe.tehamaProject.services;

import com.abe.tehamaProject.entity.Student;
import com.abe.tehamaProject.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServices {
    @Autowired
    public StudentRepository repository;

    public Student add(Student student) {
        return repository.save(student);
    }

    public List<Student> getAll() {
        return repository.findAll();
    }

    public Optional<Student> getOne(String studentId) {
        return repository.findById(studentId);
    }

    public void deleteOne(String studentId) {
        repository.deleteById(studentId);
    }

    public Student updateStudent(Student student) {
        Student exist=repository.findById(student.getStudentId())
                .orElseThrow(()->new IllegalStateException("Not found"));

        exist.setFirstName(student.getFirstName());
        exist.setLastName(student.getLastName());
        exist.setMiddleName(student.getMiddleName());
        exist.setGender(student.getGender());
        exist.setEducationLevel(student.getEducationLevel());
        exist.setYearStudy(student.getYearStudy());
        exist.setCourseStudy(student.getCourseStudy());
        exist.setUniversity(student.getUniversity());
        return repository.save(exist);
    }

    public long countMaleStudents() {
        return repository.countByGender("male");
    }

    public long countFemaleStudents() {
        return repository.countByGender("female");
    }
}
