package com.example.practiceapplication.service;

import com.example.practiceapplication.exception.UserNotFoundException;
import com.example.practiceapplication.model.Course;
import com.example.practiceapplication.repo.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;

@Service
public class CourseService {
    @Autowired
    private final CourseRepository courseRepo;

    public CourseService(CourseRepository courseRepo){
        this.courseRepo =courseRepo;
    }

    public Course addCourse(Course course){
        course.setOwnerEmail("anemail@gmail.com");//TODO pass logged in user's email here
        return courseRepo.save(course);
    }
    public List<Course> findAllCourses(String email){
        return courseRepo.findCourseByOwnerEmail(email);
    }

    public Course updateCourse(Course course){
        return courseRepo.save(course);
    }
    public Course findCourseById(Long id){
        return courseRepo.findCourseById(id)
                .orElseThrow( () -> new UserNotFoundException("User by id"+id+"was not found"));
    }
    public void deleteCourse(Long id){
        courseRepo.deleteCourseById(id);
    }


}
