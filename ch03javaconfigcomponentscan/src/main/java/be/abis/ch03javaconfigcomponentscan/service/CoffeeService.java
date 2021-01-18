package be.abis.ch03javaconfigcomponentscan.service;


import be.abis.ch03javaconfigcomponentscan.model.Coffee;
import be.abis.ch03javaconfigcomponentscan.model.Person;

public interface CoffeeService {
    Coffee serveCoffeeToVisitor(Person person);
}
