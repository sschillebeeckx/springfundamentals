package be.abis.ch03javaconfigcomponentscan.service;


import be.abis.ch03javaconfigcomponentscan.model.Person;

public interface HelloService {

    Person findPerson(int id);
    void sayHelloTo(Person person);

}
