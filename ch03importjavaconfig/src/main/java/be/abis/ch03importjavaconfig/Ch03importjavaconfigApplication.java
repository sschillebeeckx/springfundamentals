package be.abis.ch03importjavaconfig;

import be.abis.ch03importjavaconfig.service.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(SecondConfig.class)
public class Ch03importjavaconfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch03importjavaconfigApplication.class, args);
    }

    @Bean(initMethod="init", destroyMethod="destroy")
    public CoffeeService coffeeService(){
        return new AbisCoffeeService();
    }

    @Bean
    public ReceptionService receptionService(HelloService helloService){
        ReceptionService rs = new AbisReceptionService(helloService);
        ((AbisReceptionService)rs).setCoffeeservice(coffeeService());
        return rs;
    }
}
