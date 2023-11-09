package com.abe.tehamaProject.repository;

import com.abe.tehamaProject.entity.CourseStudy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseStudtRepository extends JpaRepository <CourseStudy,Integer>{
}
