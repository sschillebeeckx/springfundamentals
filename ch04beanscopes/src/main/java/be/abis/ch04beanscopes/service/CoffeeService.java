package be.abis.ch04beanscopes.service;


import be.abis.ch04beanscopes.model.Coffee;
import be.abis.ch04beanscopes.model.Person;

public interface CoffeeService {
    Coffee serveCoffeeToVisitor(Person person);
}
