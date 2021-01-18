package be.abis.ch03xmlconfig.service;


import be.abis.ch03xmlconfig.model.Person;

public interface HelloService {

    Person findPerson(int id);
    void sayHelloTo(Person person);

}
