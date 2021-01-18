package be.abis.ch04profiles.service;


import be.abis.ch04profiles.model.Person;

public interface HelloService {

    Person findPerson(int id);
    void sayHelloTo(Person person);

}
