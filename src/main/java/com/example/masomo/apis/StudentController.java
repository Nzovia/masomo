package com.example.masomo.apis;

import com.example.masomo.entities.Student;
import com.example.masomo.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    //here we create all the RestEndPoints
//     Note: RequestBody -> enhance passage of the input Json to the object
    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student student) {
        return studentService.saveStudentData(student);
    }

    //add list of products api
    @PostMapping("/addStudents")
    public List<Student> addStudents(@RequestBody List<Student> students) {
        return studentService.saveStudentsData(students);
    }

    //Get api methods
    @GetMapping("/displayClass/{form}")
    public Student findAllStudents(@PathVariable String form) {
        return studentService.getStudentsClass(form);
    }

    @GetMapping("/getStudent/{studentId}")
    public Student findSpecificStudent(@PathVariable int studentId) {
        return studentService.getStudent(studentId);
    }

    @GetMapping("/allStudents")
    public List<Student> findAllStudents() {
        return studentService.getAllStudents();
    }

    //Put api, methods- enhances updating data
    @PutMapping("/updateStudentData")
    public Student updateStudent(@RequestBody Student student) {
        return studentService.updateStudent(student);
    }

    //Delete api method
    @DeleteMapping("/deleteStudent/{studentId}")
    public String deleteStudent(@PathVariable int studentId) {
        return studentService.deleteStudent(studentId);
    }


}
