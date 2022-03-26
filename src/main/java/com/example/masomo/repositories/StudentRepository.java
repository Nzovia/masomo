package com.example.masomo.repositories;

import com.example.masomo.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

    Student findByStudyLevel(String studyLevel);
}
