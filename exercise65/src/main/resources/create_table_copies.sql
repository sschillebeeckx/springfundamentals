create table courses2 as select * from tbaccad.tutcourses;
create table companies2
as select CONO, CONAME, COSTREET, COSTRNO  ,COTOWN    , COTOWNNO  , COCOUNTR   ,
          COTEL     , COVAT      , COBANKNO
from tbaccad.tutcompanies;

create table persons2 as select * from tbaccad.tutpersons;
create table sessions2 as select * from tbaccad.tutsessions;
create table enrolments2 as select * from tbaccad.tutenrolments;

create table personsExtra2
(pe_pno number,
 pemail varchar(40),
 pepassword varchar(20),
 pelanguage char(2),
 peage number(3,0)
);

insert into personsExtra2
select PNO, lower(regexp_replace(plname,'[^a-zA-Z'']',''))||'@abis.be', lower(regexp_replace(pfname,'[^a-zA-Z'']',''))||pno,
       case
           when mod(pno,3)=0 then 'nl'
           when mod(pno,3)=1 then 'fr'
           else 'en'
           end,
       round(dbms_random.value(20,67))
from persons2;
commit;


