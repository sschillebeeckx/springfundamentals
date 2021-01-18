package be.abis.exercise;

import be.abis.exercise.model.Course;
import be.abis.exercise.model.Person;
import be.abis.exercise.service.TrainingService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class TestTrainingService {

    @Autowired
    TrainingService ts;

    @Test
    void contextLoads() {
    }

    @Test
    void welcomeMessage() {
        assertEquals("Welcome to the Abis Training Service", ts.getWelcomeMessage());
    }

    @Test
    void findPersonByEmailAndPasswordIsJohn(){
        Person p = ts.findPerson("jdoe@abis.be","def456");
        assertEquals("John",p.getFirstName());
    }

    @Test
    void findCourseViaTrainingServiceIsWorkshopSQL(){
        Course c = ts.getCourseService().findCourse(7900);
        assertEquals("Workshop SQL",c.getShortTitle());
    }


}
