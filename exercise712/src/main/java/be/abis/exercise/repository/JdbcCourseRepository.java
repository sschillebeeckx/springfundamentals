package be.abis.exercise.repository;

import be.abis.exercise.exception.CourseNotFoundException;
import be.abis.exercise.model.Course;
import be.abis.exercise.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
@Profile("production")
public class JdbcCourseRepository implements CourseRepository {

    @Autowired
    JdbcTemplate jt;

    private CourseRowMapper crm = new CourseRowMapper();

    @Override
    public List<Course> findAllCourses() {
        return jt.query("select * from courses2", crm);
    }

    @Override
    public Course findCourse(int id) throws CourseNotFoundException {
        Course c =null;
        try {
            c = jt.queryForObject("select * from courses2 where cid=?", crm, id + "");
        } catch (EmptyResultDataAccessException erdae){
            throw new CourseNotFoundException("course not found");
        }
        return c;
    }

    @Override
    public Course findCourse(String shortTitle) {
        return jt.queryForObject("select * from courses2 where rtrim(cstitle)=?",crm,shortTitle);
    }

    @Override
    public void addCourse(Course c) {
        String key = getCourseKey();
        String myInsert = "insert into courses2  values (?,?,?,?,?)";
       jt.update(myInsert,key,c.getShortTitle(),c.getLongTitle(),c.getNumberOfDays(),c.getPricePerDay());
    }

    @Override
    public void updateCourse(Course c) {
        String myUpdate="update courses2 set cstitle=? , cltitle=?, cdur=?, caprice=? where cid=?";
        jt.update(myUpdate,c.getShortTitle(),c.getLongTitle(),c.getNumberOfDays(),c.getPricePerDay(),c.getCourseId());
    }

    @Override
    public void deleteCourse(int id) {
        jt.update("delete from courses2 where cid=?", id);
    }

    @Override
    public List<Course> showFollowedCourses(Person person) {
        String myquery = "select distinct courses2.*\n" +
                "from persons2 inner join enrolments2 on e_pno=PNO\n" +
                "              inner join sessions2 on e_sno=SNO\n" +
                "              inner join courses2 on s_cid=cid\n" +
                "where pno=?";
        return jt.query(myquery,crm,person.getPersonId());
    }

    private String getCourseKey(){
        return jt.queryForObject("select max(cid) + 50 from courses2",String.class);
    }

    private static final class CourseRowMapper implements RowMapper<Course> {

        @Override
        public Course mapRow(ResultSet rs, int arg1) throws SQLException {
            return new Course(rs.getString("cid"),
                    rs.getString("cstitle"),
                    rs.getString("cltitle"),
                    rs.getInt("cdur"),
                    rs.getDouble("caprice"));
        }

    }

}
