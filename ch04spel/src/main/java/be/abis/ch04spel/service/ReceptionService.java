package be.abis.ch04spel.service;

import be.abis.ch04spel.model.Person;

public interface ReceptionService {
    HelloService getHelloService();

    void welcomePersonAndGetCoffee(Person person);
}
