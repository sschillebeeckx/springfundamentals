package be.abis.ch04conditonalonproperty;

import be.abis.ch04conditonalonproperty.model.Person;
import be.abis.ch04conditonalonproperty.service.ReceptionService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class Ch04conditonalonpropertyApplicationTests {

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
