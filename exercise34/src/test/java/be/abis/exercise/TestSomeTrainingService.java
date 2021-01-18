package be.abis.exercise;

import be.abis.exercise.model.Course;
import be.abis.exercise.model.Person;
import be.abis.exercise.service.TrainingService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ActiveProfiles("test")
class TestSomeTrainingService {

    @Autowired
    TrainingService ts;

    @Test
    void contextLoads() {
    }

    @Test
    void welcomeMessage() {
        assertEquals("hello", ts.getWelcomeMessage());
    }

    @Test
    void findPersonByEmailAndPasswordIsJohn(){
        Person p = ts.findPerson("jdoe@abis.be","def456");
        assertEquals("Sandy",p.getFirstName());
    }

    @Test
    void findCourseViaTrainingServiceIsWorkshopSQL(){
        Course c = ts.getCourseService().findCourse(7900);
        assertEquals("Test Course",c.getShortTitle());
    }


}
