package be.abis.ch04runtimevalueinjection.service;


import be.abis.ch04runtimevalueinjection.model.Person;

public interface HelloService {

    Person findPerson(int id);

    void sayHelloTo(Person person);

}
