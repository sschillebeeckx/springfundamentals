package be.abis.ch07jdbctemplate;

import be.abis.ch07jdbctemplate.model.Company;
import be.abis.ch07jdbctemplate.repository.CompanyRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

@SpringBootTest
class Ch07jdbctemplateApplicationTests {

    @Autowired
    DataSource dataSource;
    @Autowired
    Environment env;
    @Autowired
    @Qualifier("basic")
    CompanyRepository cr;

    @Test
    public void testConnectionViaDataSource() {

        try {
            Connection c = dataSource.getConnection();
            System.out.println("connection succeeded via " + c.getMetaData().getDatabaseProductName() + " in profile " + env.getProperty("spring.profiles.active"));
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Test
    public void dbTest(){
        Company c = new Company(100,"My Company", "some street", "30", "3000", "Leuven","B");

        cr.createCompanyTableCopy();
        cr.insertCompany(c);
        List<Company> companies = cr.getCompanies();
        companies.forEach(System.out::println);
        System.out.println("-----------------------------------------------------------------------");
        c.setStreet("Diestsevest");
        cr.updateCompany(c);
        System.out.println(cr.getCompany(100));
        cr.deleteCompany(100);
        System.out.println("-----------------------------------------------------------------------");
        List<Company> companies2 = cr.getCompaniesForCountry("B");
        companies2.forEach(System.out::println);
        System.out.println("-----------------------------------------------------------------------");
    }

    @Test
    public void dropTableTest(){
        cr.dropCompanyTableCopy(); // if exists
    }

}
