package com.abe.tehamaProject.services;

import com.abe.tehamaProject.entity.CourseStudy;
import com.abe.tehamaProject.repository.CourseStudtRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServices {
    @Autowired
    public CourseStudtRepository repository ;

    public CourseStudy addCourse(CourseStudy courseStudy) {
        return repository.save(courseStudy);
    }

    public List<CourseStudy> getAll() {
        return repository.findAll();
    }

    public Optional<CourseStudy> getOne(Integer courseId) {
        return repository.findById(courseId);
    }

    public void deleteOne(Integer courseId) {
        repository.deleteById(courseId);
    }

    public CourseStudy updateCourse(CourseStudy courseStudy) {
        CourseStudy exist=repository.findById(courseStudy.getCourseId())
                .orElseThrow(()->new IllegalStateException("Not found"));
        exist.setCourseName(courseStudy.getCourseName());
        return repository.save(exist);
    }
}
