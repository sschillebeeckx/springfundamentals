package be.abis.ch04spel.service;


import be.abis.ch04spel.model.Coffee;
import be.abis.ch04spel.model.Person;

public interface CoffeeService {
    Coffee serveCoffeeToVisitor(Person person);
}
