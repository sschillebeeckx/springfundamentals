package be.abis.exercise.service;

import be.abis.exercise.exception.EnrollException;
import be.abis.exercise.model.Course;
import be.abis.exercise.model.Person;
import be.abis.exercise.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AbisTrainingService implements TrainingService {

    private String welcomeMessage;
   private CourseService courseService;
    @Autowired
    private PersonRepository personRepository;

    public AbisTrainingService(CourseService courseService){
        this.courseService=courseService;
    }

    public void setWelcomeMessage(String welcomeMessage) {
        this.welcomeMessage = welcomeMessage;
    }

    @Override
    public String getWelcomeMessage() {
        return welcomeMessage;
    }

    public CourseService getCourseService() {
        return courseService;
    }

    public void setCourseService(CourseService courseService) {
        this.courseService = courseService;
    }

    @PostConstruct
    public void init(){
        System.out.println("AbisTrainingService is ready for work!");
    }

    @Override
    public ArrayList<Person> getAllPersons() {
        return personRepository.getAllPersons();
    }

    @Override
    public Person findPerson(int id) {
        return personRepository.findPerson(id);
    }

    @Override
    public Person findPerson(String emailAddress, String passWord) {
        return personRepository.findPerson(emailAddress,passWord);
    }

    @Override
    public void addPerson(Person p) throws IOException {
        personRepository.addPerson(p);
    }

    @Override
    public void deletePerson(int id) {
        personRepository.deletePerson(id);
    }

    @Override
    public void changePassword(Person p, String newPswd) throws IOException {
        personRepository.changePassword(p,newPswd);
    }

    @Override
    public List<Course> showFollowedCourses(Person person) {
        return null;
    }

    @Override
    public void enrollForSession(Person person, Course course, LocalDate date) throws EnrollException {

    }
}
