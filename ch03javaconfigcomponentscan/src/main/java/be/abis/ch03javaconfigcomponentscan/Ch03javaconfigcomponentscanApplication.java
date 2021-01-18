package be.abis.ch03javaconfigcomponentscan;

import be.abis.ch03javaconfigcomponentscan.service.AbisCoffeeService;
import be.abis.ch03javaconfigcomponentscan.service.AbisHelloService;
import be.abis.ch03javaconfigcomponentscan.service.CoffeeService;
import be.abis.ch03javaconfigcomponentscan.service.HelloService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Ch03javaconfigcomponentscanApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch03javaconfigcomponentscanApplication.class, args);
    }

    @Bean(initMethod="init", destroyMethod="destroy")
    public CoffeeService coffeeService(){
        return new AbisCoffeeService();
    }

}
