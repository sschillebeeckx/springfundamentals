package be.abis.ch03javaconfig.service;


import be.abis.ch03javaconfig.model.Person;

public interface ReceptionService {
    HelloService getHelloService();
    void welcomePersonAndGetCoffee(Person person);
}
