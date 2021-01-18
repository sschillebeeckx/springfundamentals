package be.abis.exercise.service;

import be.abis.exercise.exception.CourseNotFoundException;
import be.abis.exercise.model.Course;
import be.abis.exercise.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Qualifier("abisCourseService")
@Profile("production")
public class AbisCourseService implements CourseService {
    List<Course> allCoursesCheaperThan500=new ArrayList<Course>();

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public List<Course> findAllCourses() {
        return courseRepository.findAllCourses();
    }

    @Override
    public Course findCourse(int id) throws CourseNotFoundException {
        return courseRepository.findCourse(id);
    }

   // @Value("#{memoryCourseRepository.courses.?[pricePerDay lt 500]}")
    public void setAllCoursesCheaperThan500(List<Course> allCoursesCheaperThan500) {
        this.allCoursesCheaperThan500 = allCoursesCheaperThan500;
    }

    public List<Course> findAllCoursesCheaperThan500(){
        return allCoursesCheaperThan500;
    }

    @Override
    public Course findCourse(String shortTitle) {
        return courseRepository.findCourse(shortTitle);
    }

    @Override
    public void addCourse(Course c) {
        courseRepository.addCourse(c);
    }

    @Override
    public void updateCourse(Course c) {
        courseRepository.updateCourse(c);
    }

    @Override
    public void deleteCourse(int id) {
        courseRepository.deleteCourse(id);
    }




}
