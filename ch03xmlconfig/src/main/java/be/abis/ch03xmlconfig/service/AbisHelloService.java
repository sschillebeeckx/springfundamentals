package be.abis.ch03xmlconfig.service;


import be.abis.ch03xmlconfig.model.Person;

public class AbisHelloService implements HelloService {

    private String helloMessage;

    public String getHelloMessage() {
        return helloMessage;
    }

    public void setHelloMessage(String helloMessage) {
        this.helloMessage = helloMessage;
    }

    @Override
    public Person findPerson(int id) {
        return new Person("Sandy");
    }

    @Override
    public void sayHelloTo(Person person) {
        System.out.println(helloMessage + ", "+ person.getFirstName());
    }
}
