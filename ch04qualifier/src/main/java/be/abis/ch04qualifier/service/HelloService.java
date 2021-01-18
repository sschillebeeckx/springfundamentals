package be.abis.ch04qualifier.service;

import be.abis.ch04qualifier.model.Person;

public interface HelloService {

    Person findPerson(int id);
    void sayHelloTo(Person person);

}
