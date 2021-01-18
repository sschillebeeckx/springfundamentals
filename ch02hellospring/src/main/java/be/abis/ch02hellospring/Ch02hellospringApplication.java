package be.abis.ch02hellospring;

import be.abis.ch02hellospring.service.AbisHelloService;
import be.abis.ch02hellospring.service.HelloService;
import be.abis.ch02hellospring.service.IngHelloService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Ch02hellospringApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch02hellospringApplication.class, args);
    }



}
