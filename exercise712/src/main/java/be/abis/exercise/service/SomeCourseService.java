package be.abis.exercise.service;

import be.abis.exercise.model.Course;
import be.abis.exercise.model.Person;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Qualifier("someCourseService")
public class SomeCourseService implements CourseService{
    @Override
    public List<Course> findAllCourses() {
        return null;
    }

    @Override
    public Course findCourse(int id) {
        return new Course("7900","Test Course","Test Course",1,300);
    }

    @Override
    public List<Course> findAllCoursesCheaperThan500() {
        return null;
    }

    @Override
    public Course findCourse(String shortTitle) {
        return null;
    }

    @Override
    public void addCourse(Course c) {

    }

    @Override
    public void updateCourse(Course c) {

    }

    @Override
    public void deleteCourse(int id) {

    }

    @Override
    public List<Course> showFollowedCourses(Person person) {
        return null;
    }
}
