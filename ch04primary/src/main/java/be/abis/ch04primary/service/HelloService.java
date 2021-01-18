package be.abis.ch04primary.service;


import be.abis.ch04primary.model.Person;

public interface HelloService {

    Person findPerson(int id);
    void sayHelloTo(Person person);

}
