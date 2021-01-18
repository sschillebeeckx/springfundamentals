package be.abis.ch03xmlconfig.service;


import be.abis.ch03xmlconfig.model.Person;

public interface ReceptionService {
    HelloService getHelloService();
    void welcomePersonAndGetCoffee(Person person);
}
