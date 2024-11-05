package edu.miu.cse.professor_dep.service;

import edu.miu.cse.professor_dep.model.Course;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface CourseService {
    public void addCourse(Course course);
    public List<Course> getAllCourses();
//    public Optional<List<Course>> getCoursesByDepartment(String department);
}
