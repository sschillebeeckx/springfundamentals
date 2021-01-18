package be.abis.ch05junithamcrest;

import be.abis.ch05junithamcrest.exception.NotBigEnoughException;
import be.abis.ch05junithamcrest.model.Person;
import be.abis.ch05junithamcrest.service.HelloService;
import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
class Ch05junithamcrestApplicationTests {

    @Autowired
    private HelloService helloService;

    private Person person;

    @Test
    void contextLoads(){ }

    @BeforeEach
    void init(){
        person = new Person("John",183);
    }

    @Test
    void helloMessage(){
        //assertEquals("Welcome to Spring", helloService.getHelloMessage());
        assertThat(helloService,
                hasProperty("helloMessage", equalTo("Welcome to Spring")));

    }
    @Test
    void personNameIsJohn(){
        String first = helloService.findPerson(1).getFirstName();
        //assertEquals("John",first);
        assertThat(first,equalTo("John"));
    }

    @Test
    void JohnHeightInches(){
        double inches = person.calculateHeightInInches();
        //assertEquals(72.0471,inches);
        assertThat(inches,is (closeTo(72.05,0.01)));
    }

    @Test
    void sayHelloToJohn() throws NotBigEnoughException {
        helloService.sayHelloTo(person);
    }

    @Test
    void sayHelloToSandyThrowsException(){
        Person person2 = new Person("Sandy",160);
        assertThrows(NotBigEnoughException.class, ()-> {helloService.sayHelloTo(person2);});
    }



}
