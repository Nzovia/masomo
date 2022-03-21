package com.example.masomo.services;

import com.example.masomo.entities.Student;
import com.example.masomo.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    //add single student to the databases
    public Student saveStudentData(Student student) {
        return studentRepository.save(student);
    }

    //add a list of students
    public List<Student> saveStudentsData(List<Student> students) {
        return studentRepository.saveAll(students);
    }

    //fetch data for a single student
    public Student getStudent(int studentId) {
        return studentRepository.findById(studentId).orElse(null);
    }

    //fetching data for all students
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    //fetch data for students in a given  class
    public Student getStudentsClass( String studyLevel) {
        return studentRepository.findByForm( studyLevel);
    }

    //deleting Student data
    public String deleteStudent(int studentId) {
        studentRepository.deleteById(studentId);
        return "student deleted";
    }

    //updating student data, getting the exiting student by ID from the database
    public Student updateStudent(Student student) {
        Student exists = studentRepository.findById(student.getStudentId()).orElse(null);
        exists.setStudyLevel(student.getStudyLevel());
        exists.setFullName(student.getFullName());
        exists.setRegistrationNumber(student.getRegistrationNumber());
        return studentRepository.save(exists);

    }


}
