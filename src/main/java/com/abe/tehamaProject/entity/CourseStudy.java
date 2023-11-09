package com.abe.tehamaProject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data

public class CourseStudy {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer courseId;
    public  String courseName;
}
