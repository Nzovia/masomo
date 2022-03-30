package com.example.masomo.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "teachersData")
public class Teacher {
    @Id
    @SequenceGenerator(
            name = "teacher_sequence",
            sequenceName = "teacher_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "teacher_sequence"
    )
    private Long teacherId;
    private String fullName;
    @Column(name = "TeachersNumber",unique = true)
    private String TSCNo;
    @Column(name = "userEmail", unique = true)
    private String email;
    @Column(name = "PhoneNumber",unique = true)
    private String mobileNumber;

    //Teacher has Single Subject
    @OneToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name = "courseId",
            referencedColumnName = "subjectId"

    )
    private Subject subject;
}
