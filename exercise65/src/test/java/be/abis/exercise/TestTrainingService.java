package be.abis.exercise;

import be.abis.exercise.model.Address;
import be.abis.exercise.model.Company;
import be.abis.exercise.model.Course;
import be.abis.exercise.model.Person;
import be.abis.exercise.service.TrainingService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class TestTrainingService {

    @Autowired
    TrainingService ts;


    @Test
    void findAllPersons(){
        int size = ts.getAllPersons().size();
        assertEquals(45,size);
    }

    @Test
    void findPerson3isAnn(){
       Person found = ts.findPerson(3);
        assertEquals("ANN",found.getFirstName().toUpperCase());
    }

    @Test
    void findPersonViaMailAndPwd(){
        Person found = ts.findPerson("smiths@abis.be","jan1");
        assertEquals("JAN",found.getFirstName().toUpperCase());
    }

    @Test
    void addPersonNewCompany() throws IOException {
        Address a = new Address("somestreet","Brussels","1000","5");
        Company c = new Company("ING","02/1234567","BE1235",a);
        Person p = new Person(0,"Jane","Doe",54,"jadoe@ing.be","jane34","en",c);
        ts.addPerson(p);
    }

    @Test
    void addPersonExistingCompany() throws IOException {
        Address a = new Address("somestreet","Leuven","1000","5");
        Company c = new Company("COMPUTRAIN","02/1234567","BE1235",a);
        Person p = new Person(0,"John","Doe",42,"jdoe@abis.be","john140","nl",c);
        ts.addPerson(p);
    }

    @Test
    void changePassword() throws IOException {
        String newpwd = "newpwd";
        Person p = ts.findPerson(136);
        ts.changePassword(p,newpwd);
    }

    @Test
    void deletePersonExistingCompany() throws IOException {
        Address a = new Address("somestreet","Leuven","1000","5");
        Company c = new Company("COMPUTRAIN","02/1234567","BE1235",a);
        Person p = new Person(0,"John","Doe",42,"jdoe@abis.be","john140","nl",c);
        ts.addPerson(p);
        Person dbp = ts.findPerson(p.getEmailAddress(),p.getPassword());
        System.out.println("person created: " + dbp.getPersonId());
        ts.deletePerson(dbp.getPersonId());
    }


    @Test
    void deletePersonNewCompany() throws IOException {
        Address a = new Address("somestreet","Brussels","1000","5");
        Company c = new Company("ING","02/1234567","BE1235",a);
        Person p = new Person(0,"Jane","Doe",54,"jadoe@ing.be","jane34","en",c); ts.addPerson(p);
        Person dbp = ts.findPerson(p.getEmailAddress(),p.getPassword());
        System.out.println("person created: " + dbp.getPersonId());
        ts.deletePerson(dbp.getPersonId());
    }

    @Test
    public void person3hasFollowed2courses(){
        Person p = ts.findPerson(3);
        List<Course> coursesFollowed = ts.showFollowedCourses(p);
        coursesFollowed.forEach(c->System.out.println(c.getShortTitle()));
        assertEquals(2,coursesFollowed.size());
    }



}
