package com.abe.tehamaProject.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student {
    @Id
    public String studentId;
    public String firstName;
    public String middleName;
    public String lastName;
    public String gender;
    public Date dob;
    @ManyToOne(cascade = CascadeType.PERSIST)
    public EducationLevel educationLevel;

    @ManyToOne(cascade = CascadeType.PERSIST)
    public YearStudy yearStudy;

    @ManyToOne(cascade = CascadeType.PERSIST)
    public CourseStudy courseStudy;

    @ManyToOne(cascade = CascadeType.PERSIST)
    public University university;
}
