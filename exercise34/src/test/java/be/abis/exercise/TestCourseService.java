package be.abis.exercise;

import be.abis.exercise.model.Course;
import be.abis.exercise.service.CourseService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class TestCourseService {

    @Autowired
    @Qualifier("abisCourseService")
    CourseService cs;

    @Test
    void contextLoads() {
    }

    @Test
    void courseNumber7900IsTestCourse(){
        String title = cs.findCourse(7900).getShortTitle();
        assertEquals("Workshop SQL",title);
    }

    @Test
    void coursesCheaperThan500(){
        List<Course> courseList= cs.findAllCoursesCheaperThan500();
        assertEquals(2,courseList.size());
    }

}
