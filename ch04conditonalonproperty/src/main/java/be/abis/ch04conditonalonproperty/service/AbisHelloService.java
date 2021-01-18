package be.abis.ch04conditonalonproperty.service;


import be.abis.ch04conditonalonproperty.condition.AbisCondition;
import be.abis.ch04conditonalonproperty.model.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnJava;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.system.JavaVersion;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Service;

@Service
//@ConditionalOnProperty(name="hello.company", havingValue="abis")
@Conditional(AbisCondition.class)
public class AbisHelloService implements HelloService {

    private String helloMessage;

    public String getHelloMessage() {
        return helloMessage;
    }

    @Value("Welcome to Abis")
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
    }
}
