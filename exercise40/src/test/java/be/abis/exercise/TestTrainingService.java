package be.abis.exercise;

import be.abis.exercise.exception.CourseNotFoundException;
import be.abis.exercise.model.Course;
import be.abis.exercise.model.Person;
import be.abis.exercise.repository.PersonRepository;
import be.abis.exercise.service.TrainingService;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@SpringBootTest
class TestTrainingService {

    @Autowired
    TrainingService ts;

    @MockBean
    PersonRepository personRepository;

    @Test
    void contextLoads() {
    }

    @Test
    void welcomeMessage() {
        assertEquals("Welcome to the Abis Training Service", ts.getWelcomeMessage());
    }

    @Test
    void findPersonByEmailAndPasswordIsJohn(){
        when(personRepository.findPerson(anyString(),anyString())).thenReturn(new Person("John"));
        Person p = ts.findPerson("jdoe@abis.be","def456");
        assertEquals("John",p.getFirstName());
    }

    @Test
    void findCourseViaTrainingServiceIsWorkshopSQL() throws CourseNotFoundException {
        Course c = ts.getCourseService().findCourse(7900);
        assertEquals("Workshop SQL",c.getShortTitle());
    }

    @Test
    void priceOfCourse7900HigherThan400() throws CourseNotFoundException {
        double price = ts.getCourseService().findCourse(7900).getPricePerDay();
        assertThat(price, greaterThan(400.0));
    }

    @Test
    void welcomeMessageStartsWithWelcome() throws CourseNotFoundException {
        double price = ts.getCourseService().findCourse(7900).getPricePerDay();
        assertThat(ts.getWelcomeMessage(), startsWith("Welcome"));
    }

    @Test
    void useMockRepositoryToFindYourself(){
        when(personRepository.findPerson(anyInt())).thenReturn(new Person("Sandy"));
        Person p = ts.findPerson(1);
        assertEquals("Sandy",p.getFirstName());
    }

    //JUnit5
    @Test
    void lookingForCourseThatDoesNotExistThrowsException() throws CourseNotFoundException {
        assertThrows(CourseNotFoundException.class, () -> {Course c = ts.getCourseService().findCourse(12345);});
    }

    /*  JUnit4
    @Test(expected=CourseNotFoundException.class)
    void lookingForCourseThatDoesNotExistThrowsException() throws CourseNotFoundException {
        ts.getCourseService().findCourse(12345);
    }*/

}
