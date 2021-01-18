package be.abis.ch03importxmlconfig.service;

import be.abis.ch03importxmlconfig.model.Coffee;
import be.abis.ch03importxmlconfig.model.Person;

public interface CoffeeService {
    Coffee serveCoffeeToVisitor(Person person);
    void init();
    void destroy();
}
