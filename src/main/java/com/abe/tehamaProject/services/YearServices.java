package com.abe.tehamaProject.services;

import com.abe.tehamaProject.entity.YearStudy;
import com.abe.tehamaProject.repository.YearStudyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class YearServices {
    @Autowired
    public YearStudyRepository repository;

    public YearStudy addYearsStudy(YearStudy yearStudy) {
        return repository.save(yearStudy);
    }

    public List<YearStudy> getAll() {
        return repository.findAll();
    }

    public Optional<YearStudy> getOne(Integer yearId) {
        return repository.findById(yearId);
    }

    public void deleteYear(Integer yearId) {
        repository.deleteById(yearId);
    }

    public YearStudy updateYearStudy(YearStudy yearStudy) {
        YearStudy exist=repository.findById(yearStudy.getYearId())
                .orElseThrow(()->new IllegalStateException("Not found"));
        exist.setYear(yearStudy.getYear());
        return repository.save(exist);
    }
}
