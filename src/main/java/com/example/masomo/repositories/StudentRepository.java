package com.example.masomo.repositories;

import com.example.masomo.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
    Student findByForm(String form);
}
