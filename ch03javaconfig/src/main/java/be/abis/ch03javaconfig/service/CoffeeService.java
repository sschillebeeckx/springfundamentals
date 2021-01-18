package be.abis.ch03javaconfig.service;

import be.abis.ch03javaconfig.model.Coffee;
import be.abis.ch03javaconfig.model.Person;

public interface CoffeeService {
    Coffee serveCoffeeToVisitor(Person person);
    void init();
    void destroy();
}
