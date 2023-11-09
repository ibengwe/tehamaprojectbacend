package com.abe.tehamaProject.controller;

import com.abe.tehamaProject.entity.YearStudy;
import com.abe.tehamaProject.services.YearServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/years")
@CrossOrigin("*")
public class YearStudyController {
    @Autowired
    public YearServices services;

    @PostMapping
    public YearStudy addYearStudy(@RequestBody YearStudy yearStudy){
        return services.addYearsStudy(yearStudy);
    }
    @GetMapping
    public List<YearStudy> getAll(){
        return services.getAll();
    }
    @GetMapping("/{yearId}")
    public Optional<YearStudy> getOne(@PathVariable Integer yearId){
        return services.getOne(yearId);
    }
    @DeleteMapping("/{yearId}")
    public void deleteYearStudy(@PathVariable Integer yearId){
        services.deleteYear(yearId);
    }
    @PutMapping("/{yearId}")
    public YearStudy updateYearStudy(@PathVariable Integer yearId,@RequestBody YearStudy yearStudy){
        yearStudy.setYearId(yearId);
        return services.updateYearStudy(yearStudy);
    }
}
