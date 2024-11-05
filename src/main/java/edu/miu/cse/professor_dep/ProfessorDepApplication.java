package edu.miu.cse.professor_dep;

import edu.miu.cse.professor_dep.model.Course;
import edu.miu.cse.professor_dep.model.Department;
import edu.miu.cse.professor_dep.model.Professor;
import edu.miu.cse.professor_dep.service.CourseService;
import edu.miu.cse.professor_dep.service.DepartmentService;
import edu.miu.cse.professor_dep.service.ProfessorService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@RequiredArgsConstructor
public class ProfessorDepApplication {

    private final CourseService courseService;
    private final DepartmentService departmentService;
    private final ProfessorService professorService;

    public static void main(String[] args) {
        SpringApplication.run(ProfessorDepApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(){
        return args -> {
            Department department1 = new Department("Computer Science");
            Department department2 = new Department("Mathematics");
            Department department3 = new Department("Physics");

            departmentService.save(department1);
            departmentService.save(department2);
            departmentService.save(department3);

            Course course1 = new Course("Data Structures");
            Course course2 = new Course("Algorithms");
            Course course3 = new Course("Operating Systems");
            Course course4 = new Course("Calculus");
            Course course5 = new Course("Linear Algebra");
            Course course6 = new Course("Mechanics");
            Course course7 = new Course("Quantum Physics");
            course1.setDepartment(department1);
            course2.setDepartment(department1);
            course3.setDepartment(department1);
            course4.setDepartment(department2);
            course5.setDepartment(department2);
            course6.setDepartment(department3);
            course7.setDepartment(department3);

            courseService.addCourse(course1);
            courseService.addCourse(course2);
            courseService.addCourse(course3);
            courseService.addCourse(course4);
            courseService.addCourse(course5);
            courseService.addCourse(course6);
            courseService.addCourse(course7);

            Professor professor1 = new Professor("Alice", "Smith");
            professor1.setDepartment(department1);
            professor1.setCourses(Arrays.asList(course1, course2));
            professorService.addProfessor(professor1);

            Professor professor2 = new Professor("John", "Doe");
            professor2.setDepartment(department2);
            professor2.setCourses(Arrays.asList(course4, course5));
            professorService.addProfessor(professor2);

            Professor professor3 = new Professor("Emma", "Johnson");
            professor3.setDepartment(department3);
            professor3.setCourses(Arrays.asList(course6, course7));
            professorService.addProfessor(professor3);

            Professor professor4 = new Professor("Daniel", "Lee");
            professor4.setDepartment(department1);
            professor4.setCourses(Arrays.asList(course1, course3));
            professorService.addProfessor(professor4);

            professorService.getProfessors().forEach(System.out::println);

            departmentService.getCoursesByDepartment("Computer Science").get().forEach(System.out::println);

            departmentService.getAllDepartmentsAlongCourses().get().forEach(System.out::println);

        };
    }

}
