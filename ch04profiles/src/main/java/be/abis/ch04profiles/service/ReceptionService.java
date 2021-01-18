package be.abis.ch04profiles.service;


import be.abis.ch04profiles.model.Person;

public interface ReceptionService {
    HelloService getHelloService();
    void welcomePersonAndGetCoffee(Person person);
}
