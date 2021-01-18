package be.abis.ch04runtimevalueinjection.service;


import be.abis.ch04runtimevalueinjection.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class GeneralHelloService implements HelloService {

    @Autowired
    private Environment env;
    private String helloMessage;

    public String getHelloMessage() {
        return helloMessage;
    }

    @Value("Welcome to ${hello.company}")
    public void setHelloMessage(String helloMessage) {
        this.helloMessage = helloMessage;
    }

    @Override
    public Person findPerson(int id) {
        return new Person("Sandy");
    }

    @Override
    public void sayHelloTo(Person person) {
        System.out.println(helloMessage + ", " + person.getFirstName());
        //System.out.println("Welcome to " + env.getProperty("hello.company") + ", " + person.getFirstName());
    }
}
