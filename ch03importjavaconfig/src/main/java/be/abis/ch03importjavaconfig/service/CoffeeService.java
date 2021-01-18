package be.abis.ch03importjavaconfig.service;


import be.abis.ch03importjavaconfig.model.Coffee;
import be.abis.ch03importjavaconfig.model.Person;

public interface CoffeeService {
    Coffee serveCoffeeToVisitor(Person person);
    void init();
    void destroy();
}
