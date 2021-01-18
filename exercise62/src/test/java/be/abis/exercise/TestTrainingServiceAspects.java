package be.abis.exercise;

import be.abis.exercise.exception.EnrollException;
import be.abis.exercise.model.Course;
import be.abis.exercise.model.Person;
import be.abis.exercise.service.TrainingService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
class TestTrainingServiceAspects {

    @Autowired
    TrainingService ts;

    @Test
    void addCourseTriggersAspect(){
        ts.getCourseService().addCourse(new Course());
    }

    @Test
    void logEnrollOKAspect() throws EnrollException {
        Person p = new Person("Sandy");
        ts.enrollForSession(p,new Course(), LocalDate.now());
    }

    @Test
    void logEnrollFailedAspect() throws EnrollException {
        Person p = new Person("Mr. Bean");
       assertThrows(EnrollException.class,()->{ts.enrollForSession(p,new Course(), LocalDate.now());}) ;
    }









}
