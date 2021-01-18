package be.abis.ch03xmlconfig.service;


import be.abis.ch03xmlconfig.model.Coffee;
import be.abis.ch03xmlconfig.model.Person;

public interface CoffeeService {
    Coffee serveCoffeeToVisitor(Person person);
    void init();
    void destroy();
}
