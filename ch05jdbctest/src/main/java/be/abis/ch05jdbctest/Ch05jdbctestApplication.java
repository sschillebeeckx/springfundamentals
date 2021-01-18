package be.abis.ch05jdbctest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.sql.DataSource;

@SpringBootApplication
public class Ch05jdbctestApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch05jdbctestApplication.class, args);
    }

    @Bean
    @Profile("development")
    public DataSource testDataSource(){
        return new EmbeddedDatabaseBuilder()
                .setType(EmbeddedDatabaseType.DERBY)
                .addScript("classpath:derby.sql")
                .build();
    }
}
