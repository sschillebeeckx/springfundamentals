package be.abis.ch03annotations.service;


import be.abis.ch03annotations.model.Person;

public interface HelloService {

    Person findPerson(int id);
    void sayHelloTo(Person person);

}
