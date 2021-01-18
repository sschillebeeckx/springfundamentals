package be.abis.ch04beanscopes;

import be.abis.ch04beanscopes.model.Person;
import be.abis.ch04beanscopes.service.ReceptionService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class Ch04beanscopesApplicationTests {

    @Autowired
    private Person person1;
    @Autowired
    private Person person2;
    @Autowired
    private ReceptionService rs1;
    @Autowired
    private ReceptionService rs2;

    @Test
    void Person1and2areDifferentObjects(){
        System.out.println("Person 1:" + person1);
        System.out.println("Person 2:" + person2);
        assertTrue(person1!=person2);
    }

    @Test
    void ReceptionServicesAreSameObject(){
        System.out.println("Service 1:" + rs1);
        System.out.println("Service 2:" + rs2);
        assertTrue(rs1==rs2);
    }

    @Test
    void welcomeJohn(){
        rs1.welcomePersonAndGetCoffee(person2);
    }


}
