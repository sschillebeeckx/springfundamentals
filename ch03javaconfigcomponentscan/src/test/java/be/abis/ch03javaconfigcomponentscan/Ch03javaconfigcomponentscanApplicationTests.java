package be.abis.ch03javaconfigcomponentscan;

import be.abis.ch03javaconfigcomponentscan.model.Person;
import be.abis.ch03javaconfigcomponentscan.service.ReceptionService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class Ch03javaconfigcomponentscanApplicationTests {

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
