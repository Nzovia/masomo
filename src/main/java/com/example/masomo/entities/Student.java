package com.example.masomo.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Students")
public class Student {
    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    private Integer studentId;
    private String studyLevel;
    private String fullName;
    @Column(name = "admissionNumber", unique = true)
    private String registrationNumber;

//    //One Student takes Many Subjects
    @OneToMany(mappedBy = "student")
    private List<Subject> subjects;

//    //many students belong to the same level of Study
    @ManyToOne
    @JoinColumn(name = "classID")
    private LevelOfStudy levelOfStudy;

    @ManyToOne
    @JoinColumn(name = "adminId")
    private ExamsAdmin examsAdmin;

}
