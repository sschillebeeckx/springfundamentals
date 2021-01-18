package be.abis.ch06aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication

public class Ch06aopApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch06aopApplication.class, args);
    }

}
