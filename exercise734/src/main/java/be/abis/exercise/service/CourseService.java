package be.abis.exercise.service;

import be.abis.exercise.exception.CourseNotFoundException;
import be.abis.exercise.model.Course;
import be.abis.exercise.model.Person;

import java.util.List;

public interface CourseService {

    public List<Course> findAllCourses();
    public Course findCourse(int id) throws CourseNotFoundException;
    List<Course> findAllCoursesCheaperThan500();
    public Course findCourse(String shortTitle);
    public void addCourse(Course c);
    public void updateCourse(Course c);
    public void deleteCourse(int id);


    List<Course> showFollowedCourses(Person person);
}
