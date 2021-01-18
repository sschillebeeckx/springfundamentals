package be.abis.ch04conditonalonproperty.service;


import be.abis.ch04conditonalonproperty.model.Person;

public interface ReceptionService {
    HelloService getHelloService();

    void welcomePersonAndGetCoffee(Person person);
}
