package edu.miu.cse.professor_dep.repository;

import edu.miu.cse.professor_dep.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor, Integer> {
}
