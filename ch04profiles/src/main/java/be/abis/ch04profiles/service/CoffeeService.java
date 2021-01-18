package be.abis.ch04profiles.service;


import be.abis.ch04profiles.model.Coffee;
import be.abis.ch04profiles.model.Person;

public interface CoffeeService {
    Coffee serveCoffeeToVisitor(Person person);
}
