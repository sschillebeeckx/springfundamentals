package be.abis.exercise.exception;

public class CourseNotFoundException extends Exception {
    public CourseNotFoundException(String course_cannot_be_found) {
        super(course_cannot_be_found);
    }
}
