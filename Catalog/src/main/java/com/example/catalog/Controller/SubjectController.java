package com.example.catalog.Controller;

import com.example.catalog.Model.Subject;
import com.example.catalog.Service.SubjectService;
import org.springframework.web.bind.annotation.*;

public class SubjectController {

    private final SubjectService subjectService;

    public SubjectController(SubjectService SubjectService) {
        this.subjectService = SubjectService;
    }

    @PostMapping(value = "/subject", consumes = {"application/json"})
    public void addSubject(@RequestBody Subject entity){
        subjectService.addSubject(entity);
    }

    @DeleteMapping("/student/{id}")
    public void deleteSubject(@PathVariable int id){
        subjectService.deleteSubject(id);
    }
}
