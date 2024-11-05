package edu.miu.cse.professor_dep.service;

import edu.miu.cse.professor_dep.model.Course;
import edu.miu.cse.professor_dep.model.Department;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface DepartmentService {
    public void save(Department department);
    public Optional<Department> getDepartment(int id);
    public List<Department> getAllDepartments();
    public Optional<List<String>> getCoursesByDepartment(String department);
    public Optional<List<Department>> getAllDepartmentsAlongCourses();
}
