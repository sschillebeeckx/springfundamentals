package be.abis.ch03annotations.service;

import be.abis.ch03annotations.model.Coffee;
import be.abis.ch03annotations.model.Person;

public interface CoffeeService {
    Coffee serveCoffeeToVisitor(Person person);
}
