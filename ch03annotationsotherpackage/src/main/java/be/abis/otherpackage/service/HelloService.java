package be.abis.otherpackage.service;

import be.abis.otherpackage.model.Person;

public interface HelloService {

    Person findPerson(int id);
    void sayHelloTo(Person person);

}
