package be.abis.ch06aop.service;


import be.abis.ch06aop.factory.CompanyFactory;
import be.abis.ch06aop.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GeneralHelloService implements HelloService {

    private String helloMessage;
    @Autowired
    private CompanyFactory companyFactory;
    private List<String> namesOfbelgianCompanies = new ArrayList<>();

    public GeneralHelloService(){
    }
    public String getHelloMessage() {
        return helloMessage;
    }

    @Value("Welcome to ${hello.company}")
    public void setHelloMessage(String helloMessage) {
        this.helloMessage = helloMessage;
    }

    public CompanyFactory getCompanyFactory() {
        return companyFactory;
    }

    public void setCompanyFactory(CompanyFactory companyFactory) {
        this.companyFactory = companyFactory;
    }

    @Override
    public Person findPerson(int id) {
        return new Person("Sandy");
    }

    @Override
    public void sayHelloTo(Person person) {
        System.out.println(helloMessage + ", " + person.getFirstName());
        System.out.println("This is a list of Belgian companies:");
        this.getNamesOfbelgianCompanies().forEach(System.out::println);
    }

    @Value("#{companyFactory.companyList.?[countryCode eq 'BE'].![name]}")
    public void setnamesOfBelgianCompanies(List<String> namesOfbelgianCompanies) {
        this.namesOfbelgianCompanies = namesOfbelgianCompanies;
    }


    public List<String> getNamesOfbelgianCompanies() {
        return namesOfbelgianCompanies;
    }
}
