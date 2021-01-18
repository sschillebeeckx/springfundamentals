package be.abis.ch03annotationsotherpackage;

import be.abis.otherpackage.model.Person;
import be.abis.otherpackage.service.HelloService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class Ch03annotationsotherpackageApplicationTests {


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
