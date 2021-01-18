package be.abis.ch03importjavaconfig.service;

import be.abis.ch03importjavaconfig.model.Person;

public interface ReceptionService {
    HelloService getHelloService();
    void welcomePersonAndGetCoffee(Person person);
}
