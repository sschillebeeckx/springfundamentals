package be.abis.ch04runtimevalueinjection;

import be.abis.ch04runtimevalueinjection.model.Person;
import be.abis.ch04runtimevalueinjection.service.ReceptionService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Ch04runtimevalueinjectionApplicationTests {

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
