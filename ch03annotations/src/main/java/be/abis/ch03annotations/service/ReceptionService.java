package be.abis.ch03annotations.service;

import be.abis.ch03annotations.model.Person;

public interface ReceptionService {
    HelloService getHelloService();
    void welcomePersonAndGetCoffee(Person person);
}
