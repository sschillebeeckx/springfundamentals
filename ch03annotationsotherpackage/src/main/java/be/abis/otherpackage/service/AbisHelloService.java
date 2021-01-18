package be.abis.otherpackage.service;

import be.abis.otherpackage.model.Person;
import org.springframework.stereotype.Service;

@Service
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
