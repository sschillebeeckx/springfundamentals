package be.abis.ch04qualifier;

import be.abis.ch04qualifier.model.Person;
import be.abis.ch04qualifier.service.ReceptionService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class Ch04qualifierApplicationTests {


    private Person person;
    @Autowired
    ReceptionService receptionService;

    @BeforeEach
    public void init(){
        person = new Person("Sandy","black");
    }

    @Test
    void welcomeSandy(){
        receptionService.welcomePersonAndGetCoffee(person);
    }

}
