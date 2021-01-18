package be.abis.ch03javaconfig.service;


import be.abis.ch03javaconfig.model.Person;

public interface HelloService {

    Person findPerson(int id);
    void sayHelloTo(Person person);

}
