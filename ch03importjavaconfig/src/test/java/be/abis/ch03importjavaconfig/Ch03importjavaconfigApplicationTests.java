package be.abis.ch03importjavaconfig;

import be.abis.ch03importjavaconfig.model.Person;
import be.abis.ch03importjavaconfig.service.ReceptionService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class Ch03importjavaconfigApplicationTests {

    private static ReceptionService receptionService;
    private Person person;

    @BeforeAll
    public static void retrieveBean(){
        ApplicationContext context =
                new AnnotationConfigApplicationContext(Ch03importjavaconfigApplication.class);
        receptionService =
                (ReceptionService) context.getBean("receptionService");
    }

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
