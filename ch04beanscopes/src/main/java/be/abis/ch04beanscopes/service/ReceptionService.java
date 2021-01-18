package be.abis.ch04beanscopes.service;


import be.abis.ch04beanscopes.model.Person;

public interface ReceptionService {
    HelloService getHelloService();
    void welcomePersonAndGetCoffee(Person person);
}
