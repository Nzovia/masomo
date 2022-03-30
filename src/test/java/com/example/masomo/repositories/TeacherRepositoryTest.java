package com.example.masomo.repositories;
import com.example.masomo.entities.Student;
import com.example.masomo.entities.Subject;
import com.example.masomo.entities.Teacher;
import lombok.Builder;
import org.junit.jupiter.api.Test;
import org.junit.platform.launcher.core.LauncherConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TeacherRepositoryTest {

    @Autowired
    private TeacherRepository teacherRepository;

    @Test
    public void addNewTeacher(){
        //Cascading will help us pass the properties of the Subject Repo
        //adding the subject
        Subject subject = Subject.builder()
                .subjectCode("0020")
                .subjectName("Chemistry Form 2")
                .build();


        //add the teacher
        Teacher teacher = Teacher.builder()
                .fullName("Mr Mutisya")
                .TSCNo("14578MK")
                .email("mutisyaKitang'a@gmail.com")
                .mobileNumber("0723144567")
                .build();
        teacherRepository.save(teacher);

    }

//    @Test
//    public <List>Subject getSubjectsList(){
//
//        return  subject;
//
//    }


}