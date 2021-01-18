package be.abis.ch04runtimevalueinjection.service;


import be.abis.ch04runtimevalueinjection.model.Coffee;
import be.abis.ch04runtimevalueinjection.model.Person;

public interface CoffeeService {
    Coffee serveCoffeeToVisitor(Person person);
}
