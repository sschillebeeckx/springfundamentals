package be.abis.ch05jdbctest;

import be.abis.ch05jdbctest.model.Company;
import be.abis.ch05jdbctest.repository.CompanyRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.JdbcUtils;
import org.springframework.test.jdbc.JdbcTestUtils;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class Ch05jdbctestApplicationTests {

    Company company;

    @Autowired
    @Qualifier("basic")
    CompanyRepository cr;
    @Autowired
    JdbcTemplate jt;

    @BeforeEach
    public void init(){
      company = new Company(100,"My Company", "some street", "30", "3000", "Leuven","B");
    }

    @Test
    public void createTableTest(){
        cr.createCompanyTableCopy();
    }

    @Test
    public void insertTest(){
        int linesBefore = JdbcTestUtils.countRowsInTable(jt,"companies2");
        cr.insertCompany(company);
        int linesAfter = JdbcTestUtils.countRowsInTable(jt,"companies2");
        assertEquals(1,linesAfter-linesBefore);
    }

    @Test
    public void updateTest() {
        company.setStreet("Diestsevest");
        cr.updateCompany(company);
        System.out.println(cr.getCompany(100));
    }

    @Test
    public void deleteTest() {
        cr.deleteCompany(100);
    }

    @Test
    public void belgianCompaniesTest() {
        List<Company> companies2 = cr.getCompaniesForCountry("B");
        assertEquals(14,JdbcTestUtils.countRowsInTableWhere(jt,"companies2","cocountr='B'"));
    }

    @Test
    public void dropTableTest(){
        JdbcTestUtils.dropTables(jt,"companies2");
    }


}
