package be.abis.ch02hellospring;

import be.abis.ch02hellospring.model.Person;
import be.abis.ch02hellospring.service.HelloService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class Ch02hellospringApplicationTests {

    @Autowired
    private HelloService helloService;

    private Person person;

    @Test
    void contextLoads(){

    }

    @BeforeEach
    void init(){
        person = new Person("Sandy");
    }

    @Test
    void personNameIsSandy(){
        assertEquals("Sandy",helloService.findPerson(1).getFirstName());
    }

    @Test
    void sayHelloToSandy(){
        helloService.sayHelloTo(person);
    }



}
