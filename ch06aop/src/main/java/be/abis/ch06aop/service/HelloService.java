package be.abis.ch06aop.service;


import be.abis.ch06aop.model.Person;

import java.util.List;

public interface HelloService {

    Person findPerson(int id);

    void sayHelloTo(Person person);

    List<String> getNamesOfbelgianCompanies();

}
