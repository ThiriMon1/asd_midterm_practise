package edu.miu.cse.professor_dep.service.impl;

import edu.miu.cse.professor_dep.model.Course;
import edu.miu.cse.professor_dep.repository.CourseRepository;
import edu.miu.cse.professor_dep.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@RequiredArgsConstructor
public class CourseServiceImpl implements CourseService {
    private final CourseRepository courseRepository;

    @Override
    public void addCourse(Course course) {
        courseRepository.save(course);
    }

    @Override
    public List<Course> getAllCourses() {
        return List.of();
    }


}
