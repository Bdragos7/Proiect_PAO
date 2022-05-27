package com.example.catalog.Service;

import com.example.catalog.Model.Subject;
import com.example.catalog.Repository.SubjectRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectService {

    private final SubjectRepository subjectRepository;

    public SubjectService(SubjectRepository subjectRepository) { this.subjectRepository = subjectRepository; }

    public void addSubject(Subject entity) { SubjectRepository.addSubject(entity); }

    public void deleteSubject(int id) { SubjectRepository.deleteSubject(id); }
}

