package com.abe.tehamaProject.services;

import com.abe.tehamaProject.entity.EducationLevel;
import com.abe.tehamaProject.repository.EducationLevelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EducationServices {
    @Autowired
    public EducationLevelRepository repository;

    public EducationLevel add(EducationLevel educationLevel) {
        return repository.save(educationLevel);
    }

    public List<EducationLevel> getAll() {
        return repository.findAll();
    }

    public Optional<EducationLevel> getOne(Integer educationId) {
        return repository.findById(educationId);
    }

    public void deleteEducation(Integer educationId) {
        repository.deleteById(educationId);
    }

    public EducationLevel updateEducation(EducationLevel educationLevel) {
        EducationLevel exist=repository.findById(educationLevel.getEducationId())
                .orElseThrow(()->new IllegalStateException("Not found"));

        exist.setEducationName(educationLevel.getEducationName());

        return repository.save(exist);

    }
}
