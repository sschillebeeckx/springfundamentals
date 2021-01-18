package be.abis.ch04qualifier.service;

import be.abis.ch04qualifier.model.Person;

public interface ReceptionService {
    HelloService getHelloService();
    void welcomePersonAndGetCoffee(Person person);
}
