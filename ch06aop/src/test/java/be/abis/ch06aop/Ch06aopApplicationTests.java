package be.abis.ch06aop;

import be.abis.ch06aop.exception.PersonNotWelcomeException;
import be.abis.ch06aop.model.Person;
import be.abis.ch06aop.service.HelloService;
import be.abis.ch06aop.service.ReceptionService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
class Ch06aopApplicationTests {

    private Person person;
    @Autowired
    ReceptionService receptionService;

    @BeforeEach
    public void init() {
        person = new Person("Sandy", "black coffee");
    }

    @Test
    void personNameIsSandy(){
        assertEquals("Sandy",receptionService.getHelloService().findPerson(1).getFirstName());
    }


    @Test
    void welcomeSandy() throws PersonNotWelcomeException {
        receptionService.welcomePersonAndGetCoffee(person);
    }

    @Test
    void findBelgianCompanies(){
       receptionService.getHelloService().getNamesOfbelgianCompanies();
    }

    @Test
    void welcomeMrBean() throws PersonNotWelcomeException {
        Person person2 = new Person("Mr. Bean", "black coffee");
        assertThrows(PersonNotWelcomeException.class,() -> {receptionService.welcomePersonAndGetCoffee(person2);});
     ;
    }


}
