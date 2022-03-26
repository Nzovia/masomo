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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int subjectId;
    @Column(unique = true)
    private String subjectCode;
    private String subjectName;
//    @OneToOne
//    @JoinColumn(name = "teacherId")
//    private Teacher teacher;
//
//    //many subjects are studied by one student
//    @ManyToOne
//    @JoinColumn(name = "studentId")
//    private Student student;


}
