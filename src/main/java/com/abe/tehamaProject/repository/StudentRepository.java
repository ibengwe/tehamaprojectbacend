package com.abe.tehamaProject.repository;

import com.abe.tehamaProject.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,String> {
    Long countByGender(String gender);
}
