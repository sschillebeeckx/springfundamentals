create table courses2 as select * from tbaccad.tutcourses;
create table companies2
as select CONO, CONAME, COSTREET, COSTRNO  ,COTOWN    , COTOWNNO  , COCOUNTR   ,
          COTEL     , COVAT      , COBANKNO
from tbaccad.tutcompanies;

create table persons2 as select * from tbaccad.tutpersons;
create table sessions2 as select * from tbaccad.tutsessions;
create table enrolments2 as select * from tbaccad.tutenrolments;
