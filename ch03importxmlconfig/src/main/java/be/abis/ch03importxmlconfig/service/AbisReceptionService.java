package be.abis.ch03importxmlconfig.service;

import be.abis.ch03importxmlconfig.model.Coffee;
import be.abis.ch03importxmlconfig.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AbisReceptionService implements ReceptionService {

    private HelloService helloService;
    @Autowired
    private CoffeeService coffeeservice;

    public AbisReceptionService(HelloService helloService){
        this.helloService = helloService;
    }

    public HelloService getHelloService() {
        return helloService;
    }

    public void setHelloService(HelloService helloService) {
        this.helloService = helloService;
    }
    public CoffeeService getCoffeeservice() {
        return coffeeservice;
    }

    public void setCoffeeservice(CoffeeService coffeeservice) {
        this.coffeeservice = coffeeservice;
    }
    @Override
    public void welcomePersonAndGetCoffee(Person person) {
        helloService.sayHelloTo(person);
        Coffee coffee= coffeeservice.serveCoffeeToVisitor(person);
        System.out.println("Here is your " + coffee.getFlavour() + " coffee.");
    }
}
