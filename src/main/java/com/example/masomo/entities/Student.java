package com.example.masomo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int studentId;
    private String studyLevel;
    private String fullName;
    @Column(name = "admissionNumber", unique = true)
    private String registrationNumber;

    //One Student takes Many Subjects
    @OneToMany(mappedBy = "student")
    private List<Subject> subjects;

    //many students belong to the same level of Study
    @ManyToOne
    @JoinColumn(name = "classID")
    private levelOfStudy levelOfStudy;

}
