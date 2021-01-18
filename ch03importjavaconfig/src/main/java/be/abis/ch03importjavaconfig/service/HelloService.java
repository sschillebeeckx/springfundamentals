package be.abis.ch03importjavaconfig.service;


import be.abis.ch03importjavaconfig.model.Person;

public interface HelloService {

    Person findPerson(int id);
    void sayHelloTo(Person person);

}
