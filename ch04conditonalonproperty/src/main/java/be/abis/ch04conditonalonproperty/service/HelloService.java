package be.abis.ch04conditonalonproperty.service;


import be.abis.ch04conditonalonproperty.model.Person;

public interface HelloService {

    Person findPerson(int id);

    void sayHelloTo(Person person);

}
