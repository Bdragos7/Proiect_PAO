package com.example.catalog.Service;

import com.example.catalog.Model.Professor;
import com.example.catalog.Repository.ProfessorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorService {

    private final ProfessorRepository professorRepository;

    public ProfessorService(ProfessorRepository professorRepository) { this.professorRepository = professorRepository; }

    public List<Professor> getProfessor() { return professorRepository.getProfessor(); }

    public void addProfessor(Professor entity) { professorRepository.addProfessor(entity); }

    public void updateProfessor(int id, Professor entity) { professorRepository.updateProfessor(id, entity); }

    public void deleteProfessor(int id) { professorRepository.deleteProfessor(id); }
}

