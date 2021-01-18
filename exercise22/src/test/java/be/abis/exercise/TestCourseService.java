package be.abis.exercise;

import be.abis.exercise.service.CourseService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class TestCourseService {

    @Autowired
    CourseService cs;

    @Test
    void contextLoads() {
    }

    @Test
    void courseNumber7900IsWorkshopSQL(){
        String title = cs.findCourse(7900).getShortTitle();
        assertEquals("Workshop SQL",title);
    }
}
