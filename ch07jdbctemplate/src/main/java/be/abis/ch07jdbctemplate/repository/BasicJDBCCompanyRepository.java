package be.abis.ch07jdbctemplate.repository;

import be.abis.ch07jdbctemplate.model.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
@Qualifier("basic")
public class BasicJDBCCompanyRepository implements CompanyRepository{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void createCompanyTableCopy() {
        jdbcTemplate.execute("create table companies2 as select * from companies");
    }

    @Override
    public void dropCompanyTableCopy() {
        jdbcTemplate.execute("drop table companies2");
    }


    @Override
    public List<Company> getCompanies() {
        return jdbcTemplate.query("select * from companies2",new CompanyRowMapper());
    }


    @Override
    public List<Company> getCompaniesForCountry(String country) {
        return jdbcTemplate.query("select * from companies2 where rtrim(cocountr)=?",new CompanyRowMapper(),country);
    }


    @Override
    public Company getCompany(int id) {
        return jdbcTemplate.queryForObject("select * from companies2 where cono=?", new CompanyRowMapper(),id);
    }


    @Override
    public void insertCompany(Company c) {
        jdbcTemplate.update("insert into companies2(cono,coname,costreet,costrno,cotown,cotownno,cocountr) values (?,?,?,?,?,?,?)",
                c.getCompanyNumber(),c.getName(),c.getStreet(),c.getNumber(),c.getTown(),c.getZipCode(),c.getCountry())	;
    }


    @Override
    public void updateCompany(Company c) {
        jdbcTemplate.update("update companies2 set coname=?, costreet=?, costrno=?, cotown=?, cotownno=?, cocountr=? where cono=?",
                c.getName(), c.getStreet(), c.getNumber(), c.getTown(), c.getZipCode(),c.getCountry(),c.getCompanyNumber())	;
    }


    @Override
    public void deleteCompany(int id) {
        jdbcTemplate.update("delete from companies2 where cono=?", id);
    }


    private static final class CompanyRowMapper implements RowMapper<Company> {

        @Override
        public Company mapRow(ResultSet rs, int arg1) throws SQLException {
            return new Company(rs.getInt("cono"),
                    rs.getString("coname"),
                    rs.getString("costreet"),
                    rs.getString("costrno"),
                    rs.getString("cotownno"),
                    rs.getString("cotown"),
                    rs.getString("cocountr"));
        }

    }
}
