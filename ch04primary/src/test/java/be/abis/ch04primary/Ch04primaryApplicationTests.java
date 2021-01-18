package be.abis.ch04primary;

import be.abis.ch04primary.model.Person;
import be.abis.ch04primary.service.ReceptionService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class Ch04primaryApplicationTests {


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
