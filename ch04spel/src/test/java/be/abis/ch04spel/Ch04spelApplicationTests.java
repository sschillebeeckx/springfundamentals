package be.abis.ch04spel;

import be.abis.ch04spel.model.Person;
import be.abis.ch04spel.service.ReceptionService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Ch04spelApplicationTests {

    private Person person;
    @Autowired
    ReceptionService receptionService;

    @BeforeEach
    public void init() {
        person = new Person("Sandy", "black coffee");
    }

    @Test
    void welcomeSandy() {
        receptionService.welcomePersonAndGetCoffee(person);
    }

}
