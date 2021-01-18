package be.abis.exercise;

import be.abis.exercise.exception.CourseNotFoundException;
import be.abis.exercise.model.Course;
import be.abis.exercise.service.CourseService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
class CourseServiceDBTests {

    @Autowired
    DataSource dataSource;
    @Autowired
    @Qualifier("abisCourseService")
    CourseService cs;

    @Test
    public void testConnectionViaDataSource() {

        try {
            Connection c = dataSource.getConnection();
            System.out.println("connection succeeded via " + c.getMetaData().getDatabaseProductName());
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Test
    void courseNumber7900IsWorkshopSQL() throws CourseNotFoundException {
        String title = cs.findCourse(7900).getShortTitle();
        assertEquals("Workshop SQL",title.trim());
    }

    @Test
    void lookingForCourseThatDoesNotExistThrowsException()  {
        assertThrows(CourseNotFoundException.class, () -> {
            Course c = cs.findCourse(12345);});
    }

    @Test
    void thereAre28CoursesInTable()  {
        assertEquals(28,cs.findAllCourses().size());
    }

    @Test
    void workshopSQLTakes3Days(){
        assertEquals(3,cs.findCourse("Workshop SQL").getNumberOfDays());
    }

    @Test
    void dmlTest(){
        Course c = new Course("Spring","Spring Fundamentals",3,555.0);
        cs.addCourse(c);
        assertEquals(29,cs.findAllCourses().size());
        c.setCourseId(cs.findCourse(c.getShortTitle()).getCourseId());
        c.setNumberOfDays(4);
        cs.updateCourse(c);
        assertEquals(4,cs.findCourse("Spring").getNumberOfDays());
        cs.deleteCourse(Integer.parseInt(c.getCourseId()));
        assertEquals(28,cs.findAllCourses().size());

    }

}
