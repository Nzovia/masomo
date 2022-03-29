package com.example.masomo.entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "SubjectDetails")
public class Subject {
    @Id
    @SequenceGenerator(
            name = "subject_sequence",
            sequenceName = "subject_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "subject_sequence"
    )
    private int subjectId;
    @Column(unique = true)
    private String subjectCode;
    private String subjectName;


    //many subjects are studied by one student
    @ManyToOne
    @JoinColumn(name = "studentId")
    private Student student;


}
