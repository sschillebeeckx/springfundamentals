package be.abis.ch05junithamcrest.service;


import be.abis.ch05junithamcrest.exception.NotBigEnoughException;
import be.abis.ch05junithamcrest.model.Person;
import org.springframework.stereotype.Service;

@Service
public class AbisHelloService implements HelloService {

    private String helloMessage="Welcome to Spring";

    @Override
    public String getHelloMessage() {
        return helloMessage;
    }

    public void setHelloMessage(String helloMessage) {
        this.helloMessage = helloMessage;
    }

    @Override
    public Person findPerson(int id) {
        return new Person("John");
    }

    @Override
    public void sayHelloTo(Person person) throws NotBigEnoughException {
        if (person.calculateHeightInInches()>63) {
            System.out.println(helloMessage + ", " + person.getFirstName());
        } else throw new NotBigEnoughException("You are too small");
    }
}
