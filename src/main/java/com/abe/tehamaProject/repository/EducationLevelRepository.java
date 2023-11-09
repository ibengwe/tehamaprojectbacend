package com.abe.tehamaProject.repository;

import com.abe.tehamaProject.entity.EducationLevel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducationLevelRepository extends JpaRepository<EducationLevel,Integer> {
}
