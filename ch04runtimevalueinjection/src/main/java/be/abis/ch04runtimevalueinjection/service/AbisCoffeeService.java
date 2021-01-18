package be.abis.ch04runtimevalueinjection.service;


import be.abis.ch04runtimevalueinjection.model.Coffee;
import be.abis.ch04runtimevalueinjection.model.Person;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
@Profile("production")
public class AbisCoffeeService implements CoffeeService {

    @PostConstruct
    public void init() {
        System.out.println("preparing coffee");
    }

    @Override
    public Coffee serveCoffeeToVisitor(Person person) {
        return new Coffee(person.getCoffeePreference());
    }

    @PreDestroy
    public void destroy() {
        System.out.println("cleaning coffee things");
    }
}
