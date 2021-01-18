package be.abis.ch07datasource;

import com.zaxxer.hikari.HikariDataSource;
import oracle.jdbc.pool.OracleDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.XADataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.jndi.JndiObjectFactoryBean;

import javax.sql.DataSource;
import java.sql.SQLException;
@SpringBootApplication
public class Ch07datasourceApplication {

    @Autowired
    Environment env;

    public static void main(String[] args) {
        SpringApplication.run(Ch07datasourceApplication.class, args);
    }

    @Bean
    @Profile("development")
    public DataSource testDataSource(){
        return new EmbeddedDatabaseBuilder()
                .setType(EmbeddedDatabaseType.DERBY)
                .addScript("classpath:derby.sql")
                .build();
    }

   /* @Bean
    @Profile("qa")
    public DataSource dataSource() throws SQLException {
        OracleDataSource ds = new OracleDataSource();
        ds.setURL(env.getProperty("spring.datasource.url"));
        ds.setUser(env.getProperty("spring.datasource.username"));
        ds.setPassword(env.getProperty("spring.datasource.password"));
        ds.setDriverType(env.getProperty("spring.datasource.driver-class-name"));
        return ds;
    }*/


}
