package com.example.masomo.repositories;
import com.example.masomo.entities.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
//notice that we are using @SpringBootTest and not @DataJpaTest
// because we are sending data straight to the DB
class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void addStudent(){
        Student student = Student.builder()
                .studyLevel("Form 2")
                .fullName("Nicholas Nzovia Maundu")
                .registrationNumber("1453")
                .build();
        studentRepository.save(student);
    }

    //a test to get all the data in the DB
    @Test
    public void getAlStudents(){
        List<Student> studentList = studentRepository.findAll();
        System.out.println(studentList);

    }

}