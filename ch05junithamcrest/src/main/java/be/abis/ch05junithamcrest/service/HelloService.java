package be.abis.ch05junithamcrest.service;


import be.abis.ch05junithamcrest.exception.NotBigEnoughException;
import be.abis.ch05junithamcrest.model.Person;

public interface HelloService {

    String getHelloMessage();
    Person findPerson(int id);
    void sayHelloTo(Person person) throws NotBigEnoughException;

}
