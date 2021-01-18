package be.abis.ch02hellospring.service;


import be.abis.ch02hellospring.model.Person;

public interface HelloService {

    Person findPerson(int id);
    void sayHelloTo(Person person);

}
