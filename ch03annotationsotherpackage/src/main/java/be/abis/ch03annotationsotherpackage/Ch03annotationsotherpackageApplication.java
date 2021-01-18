package be.abis.ch03annotationsotherpackage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = "be.abis.otherpackage" )
//@ComponentScan(basePackages = "be.abis.otherpackage")
public class Ch03annotationsotherpackageApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch03annotationsotherpackageApplication.class, args);
    }

}
