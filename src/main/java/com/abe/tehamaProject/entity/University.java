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

public class University {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer universityId;
    public String universityName;








}
