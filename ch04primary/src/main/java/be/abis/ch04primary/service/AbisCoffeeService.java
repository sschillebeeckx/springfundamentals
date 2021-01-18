package be.abis.ch04primary.service;


import be.abis.ch04primary.model.Coffee;
import be.abis.ch04primary.model.Person;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
@Primary
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
