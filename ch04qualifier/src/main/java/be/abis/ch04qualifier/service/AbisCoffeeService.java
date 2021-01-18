package be.abis.ch04qualifier.service;


import be.abis.ch04qualifier.model.Coffee;
import be.abis.ch04qualifier.model.Person;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
@Qualifier("Abis")
public class AbisCoffeeService implements CoffeeService {

    @PostConstruct
    public void init(){
        System.out.println("preparing coffee");
    }

    @Override
    public Coffee serveCoffeeToVisitor(Person person) {
        return new Coffee(person.getCoffeePreference());
    }

    @PreDestroy
    public void destroy(){
        System.out.println("cleaning coffee things");
    }
}
