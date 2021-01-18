package be.abis.ch04primary.service;

import be.abis.ch04primary.model.Person;

public interface ReceptionService {
    HelloService getHelloService();
    void welcomePersonAndGetCoffee(Person person);
}
