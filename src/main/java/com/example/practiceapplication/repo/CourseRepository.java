package com.example.practiceapplication.repo;

import com.example.practiceapplication.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CourseRepository extends JpaRepository<Course, Long> {

    void deleteCourseById(Long id);

    Optional<Course> findCourseById(Long id);
}
