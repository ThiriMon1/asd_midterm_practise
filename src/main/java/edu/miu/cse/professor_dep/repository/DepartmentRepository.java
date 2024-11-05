package edu.miu.cse.professor_dep.repository;

import edu.miu.cse.professor_dep.model.Course;
import edu.miu.cse.professor_dep.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface DepartmentRepository extends JpaRepository<Department, Integer>{
    @Query("select c.course_name from Department d join d.courses c where d.name=:department order by c.course_name ASC")
    Optional<List<String>> findCourseByDepartment(String department);
}
