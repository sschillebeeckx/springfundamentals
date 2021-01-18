package be.abis.ch04runtimevalueinjection.service;


import be.abis.ch04runtimevalueinjection.model.Person;

public interface ReceptionService {
    HelloService getHelloService();

    void welcomePersonAndGetCoffee(Person person);
}
