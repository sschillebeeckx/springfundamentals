package be.abis.ch03javaconfig.service;


import be.abis.ch03javaconfig.model.Coffee;
import be.abis.ch03javaconfig.model.Person;

public class AbisCoffeeService implements CoffeeService {

    public void init(){
        System.out.println("preparing coffee");
    }

    @Override
    public Coffee serveCoffeeToVisitor(Person person) {
        return new Coffee(person.getCoffeePreference());
    }

    public void destroy(){
        System.out.println("cleaning coffee things");
    }
}
