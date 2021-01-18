package be.abis.ch04conditonalonproperty.service;


import be.abis.ch04conditonalonproperty.condition.AbisCondition;
import be.abis.ch04conditonalonproperty.condition.OtherCompanyCondition;
import be.abis.ch04conditonalonproperty.model.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Service;

@Service
//@ConditionalOnProperty(name="hello.company", havingValue="other")
@Conditional(OtherCompanyCondition.class)
public class OtherHelloService implements HelloService {

    private String helloMessage;

    public String getHelloMessage() {
        return helloMessage;
    }

    @Value("Welcome at our company")
    public void setHelloMessage(String helloMessage) {
        this.helloMessage = helloMessage;
    }

    @Override
    public Person findPerson(int id) {
        Person p = new Person("John");
        return p;
    }

    @Override
    public void sayHelloTo(Person person) {
        System.out.println(helloMessage + ", " + person.getFirstName());
    }
}
