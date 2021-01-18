package be.abis.ch04qualifier.service;


import be.abis.ch04qualifier.model.Coffee;
import be.abis.ch04qualifier.model.Person;

public interface CoffeeService {
    Coffee serveCoffeeToVisitor(Person person);
}
