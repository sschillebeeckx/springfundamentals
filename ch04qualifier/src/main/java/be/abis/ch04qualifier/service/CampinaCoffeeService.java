package be.abis.ch04qualifier.service;

import be.abis.ch04qualifier.model.Coffee;
import be.abis.ch04qualifier.model.Person;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("campina")
public class CampinaCoffeeService implements CoffeeService {
    @Override
    public Coffee serveCoffeeToVisitor(Person person) {
        return new Coffee(person.getCoffeePreference() + " with extra milk");
    }
}
