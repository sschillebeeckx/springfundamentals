package be.abis.ch04runtimevalueinjection.service;


import be.abis.ch04runtimevalueinjection.model.Coffee;
import be.abis.ch04runtimevalueinjection.model.Person;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("test")
public class CampinaCoffeeService implements CoffeeService {
    @Override
    public Coffee serveCoffeeToVisitor(Person person) {
        return new Coffee(person.getCoffeePreference() + " with extra milk");
    }
}
