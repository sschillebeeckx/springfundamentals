package be.abis.ch04beanscopes.service;


import be.abis.ch04beanscopes.model.Person;

public interface HelloService {

    Person findPerson(int id);
    void sayHelloTo(Person person);

}
