package edu.miu.cse.professor_dep.repository;

import edu.miu.cse.professor_dep.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface CourseRepository extends JpaRepository<Course,Integer> {

//    @Query("SELECT c from Course c where c.department=:department")
//    Optional<List<Course>> findAllByDepartment(String department);
}
