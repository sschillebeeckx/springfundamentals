package be.abis.ch03importxmlconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:myconfig.xml")
public class Ch03importxmlconfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch03importxmlconfigApplication.class, args);
    }

}
