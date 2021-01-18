package be.abis.ch03importxmlconfig.service;

import be.abis.ch03importxmlconfig.model.Person;

public interface ReceptionService {
    HelloService getHelloService();
    void welcomePersonAndGetCoffee(Person person);
}
