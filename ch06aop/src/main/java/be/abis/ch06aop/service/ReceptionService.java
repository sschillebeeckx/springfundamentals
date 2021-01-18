package be.abis.ch06aop.service;


import be.abis.ch06aop.exception.PersonNotWelcomeException;
import be.abis.ch06aop.model.Person;

public interface ReceptionService {
    HelloService getHelloService();
    void welcomePersonAndGetCoffee(Person person) throws PersonNotWelcomeException;
}
