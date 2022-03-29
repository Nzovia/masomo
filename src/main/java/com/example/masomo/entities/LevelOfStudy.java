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
@Table(name = "ClassForm")

public class LevelOfStudy {
    @Id
    @SequenceGenerator(
            name = "levelOfStudy_sequence",
            sequenceName = "levelOfStudy_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "levelOfStudy_sequence"
    )
    private int classID;
    private String className;
    private String studentsNumber;

    @OneToMany(mappedBy = "levelOfStudy")
    private List<Student> students;

}
