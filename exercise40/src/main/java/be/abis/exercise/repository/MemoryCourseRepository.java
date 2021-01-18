package be.abis.exercise.repository;


import be.abis.exercise.exception.CourseNotFoundException;
import be.abis.exercise.model.Course;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MemoryCourseRepository implements CourseRepository {
	
	private ArrayList<Course> courses = new ArrayList<Course>();

	public MemoryCourseRepository(){
		courses.add(new Course("7850","DB2, an overview","DB2, an overview",5,550.0));
		courses.add(new Course("7900","Workshop SQL","Workshop SQL",3,475.0));
		courses.add(new Course("8000","Java Prog","Java Programming",5,500.0));
		courses.add(new Course("8050","Maven","Maven",1,450.0));
		courses.add(new Course("8100","Spring","Programming with Spring",3,525.0));
	}

	public ArrayList<Course> getCourses() {
		return courses;
	}

	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}

	
	@Override
	public List<Course> findAllCourses() {
		return courses;
	}

	@Override
	public Course findCourse(int id) throws CourseNotFoundException {
		Course course = courses.stream().filter(c->c.getCourseId().equals(id+"")).findFirst().orElse(null);
		if (course==null) throw new CourseNotFoundException("course cannot be found");
		return course;
	}


	public Course findCourseNoLambda(int id) throws CourseNotFoundException {
		Course foundCourse=null;
		for (Course course : courses){
			if (course.getCourseId().equals(id+"")){
				foundCourse=course;
			}
		}
		if (foundCourse==null) throw new CourseNotFoundException("course cannot be found");
		return foundCourse;
	}

	@Override
	public Course findCourse(String shortTitle) {
		return courses.stream().filter(c->c.getShortTitle().equals(shortTitle)).findFirst().orElse(null);
	}



}
