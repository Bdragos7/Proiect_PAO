package com.example.catalog.Service;

import com.example.catalog.Model.Student;
import com.example.catalog.Repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {




    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) { this.studentRepository = studentRepository; }

    public List<Student> getStudent() { return studentRepository.getStudent(); }

    public void addStudent(Student entity) { studentRepository.addStudent(entity); }

    public void updateStudent(int id, Student entity) { studentRepository.updateStudent(id, entity); }

    public void deleteStudent(int id) { studentRepository.deleteStudent(id); }
}

