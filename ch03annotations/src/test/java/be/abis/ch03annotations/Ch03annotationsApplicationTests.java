package be.abis.ch03annotations;

import be.abis.ch03annotations.model.Person;
import be.abis.ch03annotations.service.ReceptionService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class Ch03annotationsApplicationTests {

    private Person person;
    @Autowired
    ReceptionService receptionService;

    @BeforeEach
    public void init(){
        person = new Person("Sandy","black");
    }

    @Test
    void personNameIsSandy(){
        assertEquals("Sandy",receptionService.getHelloService().findPerson(1).getFirstName());
    }

    @Test
    void welcomeSandy(){
        receptionService.welcomePersonAndGetCoffee(person);
    }

}
