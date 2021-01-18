package be.abis.ch03javaconfigcomponentscan.service;


import be.abis.ch03javaconfigcomponentscan.model.Person;

public interface ReceptionService {
    HelloService getHelloService();
    void welcomePersonAndGetCoffee(Person person);
}
