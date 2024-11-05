package edu.miu.cse.professor_dep.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer course_id;
    private String course_name;
    @ManyToMany(mappedBy = "courses")
    private List<Professor> professorList;
    @ManyToOne
    private Department department;

    public Course(String course_name) {
        this.course_name = course_name;
    }

    @Override
    public String toString() {
        return "Course{" +
                "course_name='" + course_name + '\'' +
                '}';
    }
}
