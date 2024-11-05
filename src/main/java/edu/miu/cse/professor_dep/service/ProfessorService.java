package edu.miu.cse.professor_dep.service;

import edu.miu.cse.professor_dep.model.Professor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProfessorService {
    public void addProfessor(Professor professor);
    public List<Professor> getProfessors();

}
