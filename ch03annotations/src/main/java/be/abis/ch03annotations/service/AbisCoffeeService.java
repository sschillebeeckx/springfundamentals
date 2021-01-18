package be.abis.ch03annotations.service;

import be.abis.ch03annotations.model.Coffee;
import be.abis.ch03annotations.model.Person;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
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
