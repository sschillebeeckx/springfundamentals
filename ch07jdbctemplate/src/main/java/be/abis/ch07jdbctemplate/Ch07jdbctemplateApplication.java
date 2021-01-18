package be.abis.ch07jdbctemplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.sql.DataSource;

@SpringBootApplication
public class Ch07jdbctemplateApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch07jdbctemplateApplication.class, args);
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
