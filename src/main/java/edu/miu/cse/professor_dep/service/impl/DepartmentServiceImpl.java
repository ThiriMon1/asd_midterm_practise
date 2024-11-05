package edu.miu.cse.professor_dep.service.impl;

import edu.miu.cse.professor_dep.model.Course;
import edu.miu.cse.professor_dep.model.Department;
import edu.miu.cse.professor_dep.repository.DepartmentRepository;
import edu.miu.cse.professor_dep.service.DepartmentService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {
    private final DepartmentRepository departmentRepository;

    @Override
    public void save(Department department) {
        departmentRepository.save(department);
    }

    @Override
    public Optional<Department> getDepartment(int id) {
        return null;
    }

    @Override
    public List<Department> getAllDepartments() {
        return List.of();
    }

    @Override
    public Optional<List<String>> getCoursesByDepartment(String department) {
        return departmentRepository.findCourseByDepartment(department);
    }

    @Override
    public Optional<List<Department>> getAllDepartmentsAlongCourses() {
        return Optional.of(departmentRepository.findAll(Sort.by(Sort.Direction.ASC, "name")));
    }
}
