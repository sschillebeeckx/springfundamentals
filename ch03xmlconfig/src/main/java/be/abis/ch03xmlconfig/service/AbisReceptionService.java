package be.abis.ch03xmlconfig.service;


import be.abis.ch03xmlconfig.model.Coffee;
import be.abis.ch03xmlconfig.model.Person;

public class AbisReceptionService implements ReceptionService {

    private HelloService helloService;
    private CoffeeService coffeeService;

    public AbisReceptionService(HelloService helloService){
        this.helloService = helloService;
    }

    public HelloService getHelloService() {
        return helloService;
    }

    public void setHelloService(HelloService helloService) {
        this.helloService = helloService;
    }
    public CoffeeService getCoffeeService() {
        return coffeeService;
    }

    public void setCoffeeService(CoffeeService coffeeService) {
        this.coffeeService = coffeeService;
    }
    @Override
    public void welcomePersonAndGetCoffee(Person person) {
        helloService.sayHelloTo(person);
        Coffee coffee= coffeeService.serveCoffeeToVisitor(person);
        System.out.println("Here is your " + coffee.getFlavour() + " coffee.");
    }
}
