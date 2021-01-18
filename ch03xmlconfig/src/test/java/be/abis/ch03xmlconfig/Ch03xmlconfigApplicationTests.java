package be.abis.ch03xmlconfig;

import be.abis.ch03xmlconfig.model.Person;
import be.abis.ch03xmlconfig.service.ReceptionService;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Ch03xmlconfigApplicationTests {

    private static ReceptionService receptionService;
    private Person person;

    private static ApplicationContext context;

    @BeforeAll
    public static void retrieveBean(){
        context =
                new ClassPathXmlApplicationContext("myconfig.xml");
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

    @AfterAll
    public static void callDestroy(){
        ((ClassPathXmlApplicationContext)context).close();
    }

}
