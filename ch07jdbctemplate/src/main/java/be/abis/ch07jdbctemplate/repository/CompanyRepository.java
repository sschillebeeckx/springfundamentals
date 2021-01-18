package be.abis.ch07jdbctemplate.repository;

import be.abis.ch07jdbctemplate.model.Company;

import java.util.List;

public interface CompanyRepository {

    public void createCompanyTableCopy();
    public void dropCompanyTableCopy();

    public List<Company> getCompanies();
    public List<Company> getCompaniesForCountry(String country);

    public Company getCompany(int id);
    public void insertCompany(Company c);
    public void updateCompany(Company c);
    public void deleteCompany(int id);
}
