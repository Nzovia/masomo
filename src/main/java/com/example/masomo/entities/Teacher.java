package com.example.masomo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "teachersData")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int teacherId;
    private String fullName;
    @Column(name = "TeachersNumber",unique = true)
    private String TSCNo;
    @Column(name = "userEmail", unique = true)
    private String email;
    @Column(name = "PhoneNumber",unique = true)
    private String mobileNumber;

//    //Teacher has Single Subject
//    @OneToOne(mappedBy = "teacher")
//    private Subject subject;
}
