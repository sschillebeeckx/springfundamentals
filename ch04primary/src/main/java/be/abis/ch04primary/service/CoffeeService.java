package be.abis.ch04primary.service;


import be.abis.ch04primary.model.Coffee;
import be.abis.ch04primary.model.Person;

public interface CoffeeService {
    Coffee serveCoffeeToVisitor(Person person);
}
