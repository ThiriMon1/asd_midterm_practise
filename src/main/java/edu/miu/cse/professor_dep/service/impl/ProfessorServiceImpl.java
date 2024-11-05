package edu.miu.cse.professor_dep.service.impl;

import edu.miu.cse.professor_dep.model.Professor;
import edu.miu.cse.professor_dep.repository.ProfessorRepository;
import edu.miu.cse.professor_dep.service.ProfessorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ProfessorServiceImpl implements ProfessorService {
    private final ProfessorRepository professorRepository;

    @Override
    public void addProfessor(Professor professor) {
        professorRepository.save(professor);
    }

    @Override
    public List<Professor> getProfessors() {
        List<Professor> professors = professorRepository.findAll();
        return professors;
    }

}
