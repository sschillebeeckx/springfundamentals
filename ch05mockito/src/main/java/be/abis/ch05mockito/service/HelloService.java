package be.abis.ch05mockito.service;


import be.abis.ch05mockito.exception.NotBigEnoughException;
import be.abis.ch05mockito.model.Person;

public interface HelloService {

    String getHelloMessage();
    Person findPerson(int id);
    void sayHelloTo(Person person) throws NotBigEnoughException;

}
