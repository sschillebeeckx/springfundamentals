package be.abis.ch04conditonalonproperty.service;


import be.abis.ch04conditonalonproperty.model.Coffee;
import be.abis.ch04conditonalonproperty.model.Person;

public interface CoffeeService {
    Coffee serveCoffeeToVisitor(Person person);
}
