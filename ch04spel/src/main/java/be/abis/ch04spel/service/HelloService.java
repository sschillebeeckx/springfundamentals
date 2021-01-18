package be.abis.ch04spel.service;


import be.abis.ch04spel.model.Person;

public interface HelloService {

    Person findPerson(int id);

    void sayHelloTo(Person person);

}
