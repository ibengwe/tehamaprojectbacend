package com.abe.tehamaProject.repository;

import com.abe.tehamaProject.entity.YearStudy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface YearStudyRepository extends JpaRepository<YearStudy,Integer> {
}
