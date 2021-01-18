package be.abis.ch04runtimevalueinjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:my.properties")
public class Ch04runtimevalueinjectionApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch04runtimevalueinjectionApplication.class, args);
    }

}
