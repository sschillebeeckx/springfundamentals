package be.abis.ch03javaconfig;

import be.abis.ch03javaconfig.service.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Ch03javaconfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch03javaconfigApplication.class, args);
    }

    @Bean
    public HelloService helloService(){
        AbisHelloService ahs = new AbisHelloService();
        ahs.setHelloMessage("Welcome to Abis");
        return ahs;
    }

    @Bean(initMethod="init", destroyMethod="destroy")
    public CoffeeService coffeeService(){
        return new AbisCoffeeService();
    }

    @Bean
    public ReceptionService receptionService(){
        ReceptionService rs = new AbisReceptionService(helloService());
        ((AbisReceptionService)rs).setCoffeeservice(coffeeService());
        return rs;
    }

}
