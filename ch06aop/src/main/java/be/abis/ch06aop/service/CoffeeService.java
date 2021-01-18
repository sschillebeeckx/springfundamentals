package be.abis.ch06aop.service;


import be.abis.ch06aop.model.Coffee;
import be.abis.ch06aop.model.Person;

public interface CoffeeService {
    Coffee serveCoffeeToVisitor(Person person);
}
