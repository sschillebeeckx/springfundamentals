package be.abis.ch03importxmlconfig.service;

import be.abis.ch03importxmlconfig.model.Person;

public interface HelloService {

    Person findPerson(int id);
    void sayHelloTo(Person person);

}
