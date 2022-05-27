package com.example.catalog.Controller;

import com.example.catalog.Model.Student;
import com.example.catalog.Service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService StudentService) {
        this.studentService = StudentService;
    }

    @GetMapping("/student")
    public List<Student> getStudent(){
        return studentService.getStudent();
    }

    @PostMapping(value = "/student", consumes = {"application/json"})
    public void addStudent(@RequestBody Student entity){
        studentService.addStudent(entity);
    }

    @PatchMapping("/student/{id}")
    public void updateStudent(@PathVariable int id, @RequestBody Student entity){
        studentService.updateStudent(id, entity);
    }

    @DeleteMapping("/student/{id}")
    public void deleteStudent(@PathVariable int id){
        studentService.deleteStudent(id);
    }
}
