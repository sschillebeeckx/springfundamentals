package be.abis.exercise.repository;

import be.abis.exercise.model.Address;
import be.abis.exercise.model.Company;
import be.abis.exercise.model.Course;
import be.abis.exercise.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
@Profile("production")
public class JdbcPersonRepository implements PersonRepository {

    @Autowired
    JdbcTemplate jt;

    private PersonRowMapper prm = new PersonRowMapper();

    @Override
    public List<Person> getAllPersons() {
        String myquery = "select *  from persons2 left outer join companies2 on pa_cono=cono inner join personsExtra2 on pe_pno=pno";
        return jt.query(myquery, prm);
    }

    @Override
    public Person findPerson(int id) {
        String myquery = "select *  from persons2 left outer join companies2 on pa_cono=cono inner join personsExtra2 on pe_pno=pno where pno=?";
        return jt.queryForObject(myquery, prm, id);
    }

    @Override
    public Person findPerson(String emailAddress, String passWord) {
        String myquery = "select *  from persons2 left outer join companies2 on pa_cono=cono inner join personsExtra2 on pe_pno=pno where pemail=? and pepassword=?";
        return jt.queryForObject(myquery, prm, emailAddress, passWord);
    }

    @Override
    public void addPerson(Person p) throws IOException {
        boolean companyExists = false;
        int cono = 0;

        Company pcomp = p.getCompany();
        if (pcomp != null) {
            System.out.println("company name to look for: " + pcomp.getName());
            List<String> compNames = this.getAllCompanyNames();

            for (String coname : compNames){
                if (coname.trim().equalsIgnoreCase(pcomp.getName())) {
                    companyExists = true; break;
                }
            }

            System.out.println("company existed: " + companyExists);
            if (companyExists) {
                cono = this.findCompanyNumber(pcomp.getName());
            } else {
                cono = this.calculateNewCompanyNumber();


                String insertCompany = "insert into companies2(cono,coname,costreet,costrno,cotown,cotownno,cocountr,cotel,covat,cobankno)" +
                        " values(?,?,?,?,?,?,?,?,?,?)";

                jt.update(insertCompany, cono, pcomp.getName(), pcomp.getAddress().getStreet(),
                        pcomp.getAddress().getNr(), pcomp.getAddress().getTown(),
                        pcomp.getAddress().getZipcode(), null, pcomp.getTelephoneNumber(), pcomp.getVatNr(), null);
            }
        }

        String insertPerson = "insert into persons2(pno,pfname,plname,pa_cono) values(?,?,?,?)";
        int pno = this.calculateNewPersonNumber();
        String compno = (cono!=0? cono+"" : null);
        jt.update(insertPerson, pno, p.getFirstName(), p.getLastName(), compno);

        String insertPersonExtra = "insert into personsExtra2 values(?,?,?,?,?)";
        jt.update(insertPersonExtra, pno, p.getEmailAddress(), p.getPassword(), p.getLanguage(), p.getAge());
    }

    private int calculateNewPersonNumber() {
        String myquery = "select max(pno)+1 from persons2 ";
        return jt.queryForObject(myquery, Integer.class);
    }

    private int findCompanyNumber(String name) {
        String myquery = "select cono from companies2 where rtrim(coname)=?";
        return jt.queryForObject(myquery, Integer.class, name.trim());
    }

    private int calculateNewCompanyNumber() {
        String myquery = "select max(cono)+1 from companies2 ";
        return jt.queryForObject(myquery, Integer.class);
    }


    @Override
    public void deletePerson(int id) {
        String deleteString1="delete from personsExtra2 where pe_pno=?";
        String deleteString2="delete from persons2 where pno=?";
        jt.update(deleteString1,id);
        jt.update(deleteString2,id);

        /*List<Integer> compnumbersOfPersons =  this.getAllCompanyNumbers();
        Person person = this.findPerson(id);
        Company comp = person.getCompany();
        if(comp!=null){
           int compno= this.findCompanyNumber(comp.getName());
           boolean noPersonWithComp= compnumbersOfPersons.stream().noneMatch(cn -> cn==compno);
           if (noPersonWithComp){
               String deleteComp = "delete from companies2 where cono=?";
               jt.update(deleteComp,compno);
           }
        } */

    }

    private List<Integer> getAllCompanyNumbers() {
        String myquery = "select distinct pa_cono from persons2";
        return jt.queryForList(myquery,Integer.class);
    }

    private List<String> getAllCompanyNames() {
        String myquery = "select coname from companies2";
        return jt.queryForList(myquery,String.class);
    }

    @Override
    public void changePassword(Person p, String newPswd) throws IOException {
        String myupdate = "update PERSONSEXTRA2  set pepassword=? where pe_pno=?";
        jt.update(myupdate,newPswd,p.getPersonId());
    }

    private static final class PersonRowMapper implements RowMapper<Person> {

        @Override
        public Person mapRow(ResultSet rs, int arg1) throws SQLException {

            Address a = new Address();
            a.setNr(rs.getString("costrno"));
            a.setStreet(rs.getString("costreet"));
            a.setTown(rs.getString("cotown"));
            a.setZipcode(rs.getString("cotownno"));
            Company c = new Company();
            c.setName(rs.getString("coname"));
            c.setTelephoneNumber(rs.getString("cotel"));
            c.setVatNr(rs.getString("covat"));
            c.setAddress(a);
            Person p = new Person();
            p.setFirstName(rs.getString("pfname"));
            p.setLastName(rs.getString("plname"));
            p.setPersonId(Integer.parseInt(rs.getString("pno")));
            p.setEmailAddress(rs.getString("pemail"));
            p.setPassword(rs.getString("pepassword"));
            p.setLanguage(rs.getString("pelanguage"));
            p.setAge(rs.getInt("peage"));
            p.setCompany(c);
            return p;
        }

    }

}
