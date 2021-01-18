package be.abis.ch04spel.factory;

import be.abis.ch04spel.model.Company;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class CompanyFactory{

    private ArrayList<Company> companyList = new ArrayList<Company>();

    public CompanyFactory(){
        companyList.add(new Company("Abis","BE"));
        companyList.add(new Company("ING","NL"));
        companyList.add(new Company("KBC","BE"));
    }

    public ArrayList<Company> getCompanyList() {
        return companyList;
    }

    public void setCompanyList(ArrayList<Company> companyList) {
        this.companyList = companyList;
    }


}
