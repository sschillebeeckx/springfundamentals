package be.abis.ch02hellospring.service;

import be.abis.ch02hellospring.model.Person;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class AbisHelloService implements HelloService {

    @Override
    public Person findPerson(int id) {
        return new Person("Sandy");
    }

    @Override
    public void sayHelloTo(Person person) {
        System.out.println("Welcome to Spring, "+ person.getFirstName());
    }
}
