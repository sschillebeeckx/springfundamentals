package be.abis.exercise.repository;


import be.abis.exercise.exception.CourseNotFoundException;
import be.abis.exercise.model.Course;

import java.util.List;

public interface CourseRepository {

	public List<Course> findAllCourses();
	public Course findCourse(int id) throws CourseNotFoundException;
	public Course findCourse(String shortTitle);
		
}
