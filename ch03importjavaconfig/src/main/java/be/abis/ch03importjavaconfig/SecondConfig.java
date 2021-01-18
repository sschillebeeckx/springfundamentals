package be.abis.ch03importjavaconfig;

import be.abis.ch03importjavaconfig.service.AbisHelloService;
import be.abis.ch03importjavaconfig.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SecondConfig {
    @Bean
    public HelloService helloService(){
        AbisHelloService ahs = new AbisHelloService();
        ahs.setHelloMessage("Welcome to Abis");
        return ahs;
    }
}
