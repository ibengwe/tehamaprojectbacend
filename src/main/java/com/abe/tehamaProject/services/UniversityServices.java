package com.abe.tehamaProject.services;

import com.abe.tehamaProject.entity.University;
import com.abe.tehamaProject.repository.UniversityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UniversityServices {
    @Autowired
    public UniversityRepository repository;

    public University addUniversity(University university) {
        return repository.save(university);
    }

    public List<University> getAll() {
        return repository.findAll();
    }

    public Optional<University> getOne(Integer universityId) {
        return repository.findById(universityId);
    }

    public void deleteOne(Integer universityId) {
        repository.deleteById(universityId);
    }

    public University updateUniversity(University university) {
        University exist=repository.findById(university.getUniversityId())
                .orElseThrow(()->new IllegalStateException("Not found"));
        exist.setUniversityName(university.getUniversityName());

        return repository.save(exist);
    }
}
