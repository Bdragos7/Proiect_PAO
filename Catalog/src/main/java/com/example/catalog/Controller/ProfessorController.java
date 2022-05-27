package com.example.catalog.Controller;

import com.example.catalog.Model.Professor;
import com.example.catalog.Service.ProfessorService;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class   ProfessorController {

    private final ProfessorService professorService;

    public ProfessorController(ProfessorService professorService) {
        this.professorService = professorService;
    }

    @GetMapping("/professor")
    public List<Professor> getProfessor(){
            return professorService.getProfessor();
    }

    @PostMapping(value = "/professor", consumes = {"application/json"})
    public void addProfessor(@RequestBody Professor entity){
        professorService.addProfessor(entity);
    }

    @PatchMapping("/professor/{id}")
    public void updateProfessor(@PathVariable int id, @RequestBody Professor entity){
        professorService.updateProfessor(id, entity);
    }

    @DeleteMapping("/professor/{id}")
    public void deleteProfessor(@PathVariable int id){
        professorService.deleteProfessor(id);
    }
}

