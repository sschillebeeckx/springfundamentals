package be.abis.exercise.service;

import be.abis.exercise.exception.EnrollException;
import be.abis.exercise.model.Course;
import be.abis.exercise.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Profile("test")
@Service
public class SomeTrainingService implements TrainingService {

    @Value("hello")
    private String welcomeMessage;

    @Autowired
    @Qualifier("someCourseService")
    CourseService courseService;

    @Override
    public String getWelcomeMessage() {
        return welcomeMessage;
    }

    @Override
    public void setWelcomeMessage(String s) {
        this.welcomeMessage=s;
    }

    @Override
    public CourseService getCourseService() {
        return courseService;
    }

    @Override
    public ArrayList<Person> getAllPersons() {
        return null;
    }

    @Override
    public Person findPerson(int id) {
        return null;
    }

    @Override
    public Person findPerson(String emailAddress, String passWord) {
        Person p = new Person();
        p.setFirstName("Sandy");
        return p;
    }

    @Override
    public void addPerson(Person p) throws IOException {

    }

    @Override
    public void deletePerson(int id) {

    }

    @Override
    public void changePassword(Person p, String newPswd) throws IOException {

    }

    @Override
    public List<Course> showFollowedCourses(Person person) {
        return null;
    }

    @Override
    public void enrollForSession(Person person, Course course, LocalDate date) throws EnrollException {

    }
}
