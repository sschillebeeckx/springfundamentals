CREATE TABLE companies
 ( cono       SMALLINT      NOT NULL ,
   coname     CHAR(45)      NOT NULL ,
   costreet   VARCHAR(45)   NOT NULL ,
   costrno    VARCHAR(10)            ,
   cotown     CHAR(45)      NOT NULL ,
   cotownno   CHAR(10)               ,
   cocountr   CHAR(4)                ,
   cotel      CHAR(16)               ,
   covat      CHAR(11)               ,
   cobankno   CHAR(14)               ,
   coc_pno    SMALLINT
  , PRIMARY KEY (cono));
  --, FOREIGN KEY (coc_pno) REFERENCES persons (pno)
  --  ON DELETE RESTRICT ) ;
	
INSERT INTO companies VALUES (   1 , 'LOC COMPUTER CORP.',
 'RING'               , '189'    , 'BRUSSEL'    , '1020'    , 'B' ,
 '02/6784523'  , '345-786-890' , NULL             ,  12 ) ;
INSERT INTO companies VALUES (   2 , 'DATAWISHES N.V.'   ,
 'AVENUE LAMBERT'     , '45 B6'  , 'BRUSSEL'    , '1060'    , 'B' ,
 '02/3421632'  , '403-146-747' , '210-0040988-09' ,   8 ) ;
INSERT INTO companies VALUES (   3 , 'ABIS N.V.'         ,
 'DIESTSEVEST'        , '32'     , 'LEUVEN'     , '3000'    , 'B' ,
 '016/245610'  , '423-345-567' , '739-0000673-02' ,   1 ) ;
INSERT INTO companies VALUES (   4 , 'ESCON'             ,
 'ANTONIUSLAAN'       , '2'      , 'GENT'       , '8200'    , 'B' ,
 '091/456213'  , '120-450-002' , '009-4568791-45' ,  66 ) ;
INSERT INTO companies VALUES (   5 , 'COVERDAT'          ,
 'WARMTESTRAAT'       , '67'     , 'NAARDEN'    , '1411 AR' , 'NL',
 '08879-3844'  , NULL          , '003-780034-54'  ,  24 ) ;
INSERT INTO companies VALUES (   6 , 'ASC COMPANY'       ,
 'KAAI 345'           , '67 b5'  , 'ANTWERPEN'  , '2030'    , 'B' ,
 '03/3451298'  , '567-345-453' , '009-0000345-45' ,  34 ) ;
INSERT INTO companies VALUES (   9 , 'TECHNISOFT B.V.'   ,
 'ZWARTEWEG'          , '112'    , 'ROTTERDAM'  , '1420-WK' , 'NL',
 '02977-22456' , NULL          , NULL             ,  32 ) ;
INSERT INTO companies VALUES (  10 , 'BET MECHANICS NV.' ,
 'INDUSTRIEPARK'      , '678'    , 'MECHELEN'   , '1240'    , 'B' ,
 '015/348778'  , '009-568-562' , '021-0000456-78' ,  87 ) ;
INSERT INTO companies VALUES (  11 , 'CandC INTERNATIONAL',
 'GOSWELL ROAD'       , '521'    , 'LONDON'     , 'EC1N7JQ' , 'GB',
 '01 278 2377' , NULL          , NULL             ,  36 ) ;
INSERT INTO companies VALUES (  12 , 'BROWN AG'          ,
 'HELGA FELD'         , '3'      , 'MUNICH'     , '8906'    , 'D' ,
 '7-6566'      , NULL          , NULL             ,  17 ) ;
INSERT INTO companies VALUES (  13 , 'FLYGT'             ,
 'HOOGSTRAAT'         , '67'     , 'TERNAT'     , '1200'    , 'B' ,
 '02/7800056'  , '900-120-324' , '021-456098-45'  ,  35 ) ;
INSERT INTO companies VALUES (  15 , 'DIRECT SOFT Ltd.'  ,
 'CORPORATION STREET' , '14'     , 'BIRMINGHAM' , 'B2 4RN'  , 'GB',
 '021 643 5072', NULL          , NULL             ,  15 ) ;
INSERT INTO companies VALUES (  17 , 'POUDRE BELGE'      ,
 'RUE D''EAU'         , '67'     , 'NAMUR'      , '7200'    , 'B' ,
 '042/563409'  , '900-678-232' , '009-4560004-56' ,  43 ) ;
INSERT INTO companies VALUES (  20 , 'OLIVER'            ,
 'GASTSTRAAT'         , '243'    , 'HASSELT'    , '3500'    , 'B' ,
 '011/459123'  , '451-546-789' , '458-1285006-45' ,  92 ) ;
INSERT INTO companies VALUES (  21 , 'PROCESS'           ,
 'DESGUINLEI'         , '109 B56', 'ANTWERPEN'  , '2030'    , 'B' ,
 '03/3456723'  , '789-456-234' , '410-4567894-67' ,  21 ) ;
INSERT INTO companies VALUES (  22 , 'BELGISCHE BANK'    ,
 'HOOFDSTRAAT'        , '675'    , 'ANTWERPEN'  , '2000'    , 'B' ,
 '03/3451078'  , '567-231-430' , '554-4620439-45' ,  22 ) ;
INSERT INTO companies VALUES (  25 , 'DIEMEN'            ,
 'HEERBAAN'           , '250'    , 'AMSTERDAM'  , '1014 BA' , 'NL',
 '01720-45665' , NULL          , NULL             ,  33 ) ;
INSERT INTO companies VALUES (  32 , 'BERENDSEN CP'      ,
 'EXSELSIORLAAN'      , '67 B45' , 'BRUSSEL'    , '1220'    , 'B' ,
 '02/4568791'  , '125-002-021' , '009-4587661-12' ,  14 ) ;
INSERT INTO companies VALUES (  41 , 'RALBERG'           ,
 'SCHIPHOLWEG'        , '34'     , 'LEIDEN'     , '6574 HK' , 'NL',
 '071-218112'  , NULL          , NULL             , 132 ) ;
INSERT INTO companies VALUES (  42 , 'EDUCA Ltd.'        ,
 'WORSHIP STREET'     , '74'     , 'LONDON'     , 'EC2A 2EN', 'GB',
 '01 377 4645' , NULL          , NULL             ,  56 ) ;
INSERT INTO companies VALUES (  43 , 'COMPUTRAIN'        ,
 'SCHIEDAMSE VEST'    , '99A'    , 'ROTTERDAM'  , '3012'    , 'NL',
 '010-4134409' , NULL          , NULL             ,   5 ) ;
INSERT INTO companies VALUES (  46 , 'ASSUR'             ,
 'GRASMARKT'          , '67'     , 'GENT'       , '8000'    , 'B' ,
 '091/450065'  , '021-102-212' , '079-4580056-45' ,  28 ) ;
INSERT INTO companies VALUES (  52 , 'BANC'              ,
 'AVENUE LOUISE'      , '78 B4'  , 'BRUSSEL'    , '1000'    , 'B' ,
 '02/4561236'  , '002-456-442' , '079-0007549-05' ,  18 ) ;
INSERT INTO companies VALUES ( 104 , 'ASCO'              ,
 'DEEP LANE'          , '1A'     , 'OXFORD'     , 'RG211RY' , 'GB',
 '0256 469460' , NULL          , '000-111111-54'  , 104 ) ;
 
 CREATE TABLE persons
 ( pno        SMALLINT      NOT NULL ,
   plname     CHAR(40)      NOT NULL ,
   pfname     VARCHAR(15)            ,
   pfunc      CHAR(20)               ,
   pa_cono    SMALLINT               ,
   padept     CHAR(30)               ,
   ptel       CHAR(16)               ,
   psex       CHAR(1)
  , PRIMARY KEY (pno)
  , FOREIGN KEY (pa_cono) REFERENCES companies (cono)
--    ON DELETE SET NULL
 ) ;

--CREATE UNIQUE INDEX pno_idx ON persons (pno);
--CREATE INDEX pa_cono_idx ON persons (pa_cono);

INSERT INTO persons VALUES (   1 , 'SMITHS'        , 'JAN'      ,
 'TRAINING CONSULT'  ,  3 , 'SYSTEM SOFTWARE', '916/242569'  , 'M' ) ;
INSERT INTO persons VALUES (   2 , 'TAVERNIER'     , 'PETER'    ,
 'PROGRAMMER'        ,  3 , 'SYSTEM SOFTWARE', '016/242564'  , 'M' ) ;
INSERT INTO persons VALUES (   3 , 'DE KEYSER'     , 'ANN'      ,
 'PROGRAMMER'        ,  3 , 'SYSTEM SOFTWARE', NULL          , 'F' ) ;
INSERT INTO persons VALUES (   5 , 'NIEHOF'        , 'RUUD'     ,
 'EDP-MANAGER'       , 43 , 'INFOCENTER'     , '010-4134409' , 'M' ) ;
INSERT INTO persons VALUES (   6 , 'VAN HEIJKOOP'  , 'GERT'     ,
 'ANALYST'           , 43 , 'INFOCENTER'     , NULL          , 'M' ) ;
INSERT INTO persons VALUES (   7 , 'DE GROOT'      , 'ATY'      ,
 'OPERATOR'          , 43 , 'INFOCENTER'     , NULL          , 'F' ) ;
INSERT INTO persons VALUES (   8 , 'PEREZ'         , 'MARIA'    ,
 'MANAGER'           ,  2 , NULL             , '02/3421632'  , 'F' ) ;
INSERT INTO persons VALUES (   9 , 'LIVIER'        , 'F.'       ,
 'ANALYST'           ,  2 , NULL             , NULL          , 'M' ) ;
INSERT INTO persons VALUES (  10 , 'LUTZ'          , 'C.'       ,
 'ANALYST'           ,  2 , NULL             , NULL          , 'F' ) ;
INSERT INTO persons VALUES (  11 , 'LOOSE'         , 'K.'       ,
 'CONSULTANT'      , NULL , NULL             , '02/4560215'  , 'M' ) ;
INSERT INTO persons VALUES (  12 , 'BENOIT'        , 'PHILIP'   ,
 'SOFTWARE ENGINEER' ,  1 , 'DEVELOPMENT'    , '02/6784524'  , 'M' ) ;
INSERT INTO persons VALUES (  13 , 'BENOIT'        , 'DIRK'     ,
 'SYSTEM  ENGINEER'  ,  1 , 'SUPPORT'        , '02/6784523'  , 'M' ) ;
INSERT INTO persons VALUES (  14 , 'DETROIT'       , 'D.'       ,
 'SECRETARY'         , 32 , NULL             , '02/4568791'  , 'M' ) ;
INSERT INTO persons VALUES (  15 , 'SPENCER'       , 'THEODORE' ,
 'SYSTEM MANAGER'    , 15 , NULL             , '021 643 5072', 'M' ) ;
INSERT INTO persons VALUES (  17 , 'SCHUMACHER'    , 'R.'       ,
 NULL                , 12 , 'ENTWIKLUNG'     , '45'          , 'M' ) ;
INSERT INTO persons VALUES (  18 , 'GELADE'        , 'BENNY'    ,
 'MANAGER'           , 52 , NULL             , NULL          , 'M' ) ;
INSERT INTO persons VALUES (  19 , 'COPPIETERS'    , 'C.'       ,
 'OPERATOR'          , 52 , NULL             , NULL          , 'F' ) ;
INSERT INTO persons VALUES (  20 , 'DE WINDT'      , 'D.'       ,
 'ANALYST'           , 52 , NULL             , NULL          , 'M' ) ;
INSERT INTO persons VALUES (  21 , 'DE SCHRIJVER'  , 'E.'       ,
 'EDUCATION MANAGER' , 21 , 'TRAINING CENTER', NULL          , 'M' ) ;
INSERT INTO persons VALUES (  22 , 'HENDERSON'     , 'DAVID'    ,
 'SUPPORT ENGINEER'  , 22 , 'INFOCENTER'     , 'b 4567'      , 'M' ) ;
INSERT INTO persons VALUES (  23 , 'DELANGHE'      , 'G.'       ,
 'SYSTEM  ANALYST'   , 22 , 'INFOCENTER'     , 'b 4587'      , 'M' ) ;
INSERT INTO persons VALUES (  24 , 'VAN DE BROECK' , 'L.'       ,
 'ANALYST'           ,  5 , 'AUTOMATISATION' , 'B 456'       , 'M' ) ;
INSERT INTO persons VALUES (  25 , 'MEURIS'        , 'FRITS'    ,
 'PROGRAMMER'        ,  5 , 'AUTOMATISATION' , 'b 457'       , 'M' ) ;
INSERT INTO persons VALUES (  26 , 'HEBBELYNCK'    , 'H.J.'     ,
 'PROJECT ENGINEER'  ,  5 , 'PRODUKTION'     , 'b 546'       , 'M' ) ;
INSERT INTO persons VALUES (  28 , 'TYTGAT'        , 'ADOLF'    ,
 'EDP-MANAGER'       , 46 , NULL             , 'b 7894'      , 'M' ) ;
INSERT INTO persons VALUES (  29 , 'DEVISSER'      , 'J.'       ,
 'ANALYST'           , 46 , NULL             , 'b 4569'      , 'M' ) ;
INSERT INTO persons VALUES (  32 , 'BUENK'         , 'G.J.'     ,
 'MANAGER'           ,  9 , NULL             , NULL          , 'M' ) ;
INSERT INTO persons VALUES (  33 , 'PIELAGE'       , 'J.H.'     ,
 'PROJECT MANAGER'   , 25 , 'DATA SERVICES'  , '01720-45665' , 'M' ) ;
INSERT INTO persons VALUES (  34 , 'DE BRUYN'      , 'PATRICK'  ,
 'PRODUCT MANAGER'   ,  6 , 'DATA SERVICES'  , '03/3451298'  , 'M' ) ;
INSERT INTO persons VALUES (  35 , 'DE SMET'       , 'F.'       ,
 'MANAGER'           , 13 , NULL             , '02/7800056'  , 'M' ) ;
INSERT INTO persons VALUES (  36 , 'ADAMSON'       , 'BRUCE'    ,
 'EDUCATION MANAGER' , 11 , 'TRAINING CENTER', '01 278 2377' , 'M' ) ;
INSERT INTO persons VALUES (  43 , 'DEHEM'         , 'F.'       ,
 'ADVISOR'           , 17 , NULL             , '042/566213'  , 'M' ) ;
INSERT INTO persons VALUES (  47 , 'GOYENS'        , 'F.'       ,
 'OPERATOR'          , 32 , 'DATA SERVICES'  , '235'         , 'M' ) ;
INSERT INTO persons VALUES (  48 , 'GERRIES'       , 'G.'       ,
 'OPERATOR'          , 32 , 'DATA SERVICES'  , '452'         , 'F' ) ;
INSERT INTO persons VALUES (  49 , 'DE CORTE'      , 'EDMOND'   ,
 'PROGRAMMER'        , 32 , NULL             , NULL          , 'M' ) ;
INSERT INTO persons VALUES (  50 , 'DE WILDE'      , 'P.'       ,
 'PROGRAMMER'        , 32 , NULL             , NULL          , 'M' ) ;
INSERT INTO persons VALUES (  56 , 'PARKER'        , 'L.'       ,
 'TRAINING MANAGER'  , 42 , 'TRAINING CENTER', '01 377 4645' , 'M' ) ;
INSERT INTO persons VALUES (  66 , 'MOORS'         , 'SYLVAIN'  ,
 NULL                ,  4 , NULL             , NULL          , 'M' ) ;
INSERT INTO persons VALUES (  87 , 'DEWULF'        , 'G.'       ,
 'EDP_MANAGER'       , 10 , 'INFOCENTER'     , '015/348778'  , 'F' ) ;
INSERT INTO persons VALUES (  92 , 'OLIVER'        , 'P.'       ,
 'MANAGER'           , 20 , NULL             , '011/459123'  , 'M' ) ;
INSERT INTO persons VALUES ( 104 , 'NICHOLLS'      , 'D.'       ,
 'ACCOUNT MANAGER'  , 104 , NULL             , '0256 469460' , 'M' ) ;
INSERT INTO persons VALUES ( 132 , 'BUNE'          , 'JAN'      ,
 'REGISTER ACCOUNT'  , 41 , 'AUDIT'          , '071-218112'  , 'M' ) ;
INSERT INTO persons VALUES ( 133 , 'KOOPS'         , 'BART'     ,
 'ASSISTANT ACCOUNT' , 41 , 'AUDIT'          , NULL          , 'M' ) ;
INSERT INTO persons VALUES ( 134 , 'MAK'           , 'L.'       ,
 'ACCOUNT'           , 41 , 'AUDIT'          , NULL          , 'F' ) ;
INSERT INTO persons VALUES ( 135 , 'MAK'           , 'L'        ,
 NULL              , NULL , NULL             , NULL          , 'F' ) ;
 
ALTER TABLE companies ADD FOREIGN KEY (coc_pno) REFERENCES persons (pno);

CREATE TABLE courses
 ( cid        CHAR(4)       NOT NULL ,
   cstitle    CHAR(45)      NOT NULL ,
   cltitle    VARCHAR(60)            ,
   cdur       SMALLINT      NOT NULL ,
   caprice    DECIMAL(9, 2) NOT NULL
  , PRIMARY KEY (cid)
 ) ;

--CREATE UNIQUE INDEX cid_idx ON courses (cid);

INSERT INTO courses VALUES
 ( '7800' , 'IMSADFII'                                 ,
 'Development of conversational transactions using IMSADF', 5, 550.00) ;
INSERT INTO courses VALUES
 ( '7801' , 'IMSADFII advanced topics'                 ,
 'IMSADFII Advanced Topics'                               , 3, 550.00) ;
INSERT INTO courses VALUES
 ( '7810' , 'ADFPLUS'                                  ,
 'ADFPLUS preprocessors and utilities'                    , 2, 550.00) ;
INSERT INTO courses VALUES
 ( '7820' , 'IMS/DB'                                   ,
 'IMS/DB application programming'                         , 5, 550.00) ;
INSERT INTO courses VALUES
 ( '7830' , 'IMS/DC'                                   ,
 'IMS/DC application programming'                         , 3, 550.00) ;
INSERT INTO courses VALUES
 ( '7840' , 'Implementation of physical IMS data bases',
 'Implementation of physical IMS data bases'              , 3, 550.00) ;
INSERT INTO courses VALUES
 ( '7850' , 'DB2, an overview'                         ,
 'DB2, an overview'                                       , 5, 550.00) ;
INSERT INTO courses VALUES
 ( '7860' , 'ISPF dialog management'                   ,
 'ISPF dialog management services'                        , 3, 550.00) ;
INSERT INTO courses VALUES
 ( '7870' , 'Generalized audit exit'                   ,
 'Generalized audit exit (GAEXIT)'                        , 3, 550.00) ;
INSERT INTO courses VALUES
 ( '7890' , 'Design of IMS data bases'                 ,
 'Design of IMS data bases'                               , 3, 550.00) ;
INSERT INTO courses VALUES
 ( '7900' , 'Workshop SQL'                             ,
 'Workshop SQL'                                           , 3, 550.00) ;
INSERT INTO courses VALUES
 ( '8001' , 'System development'                       ,
 'System development : management and methodology'        , 2, 550.00) ;
INSERT INTO courses VALUES
 ( '8002' , 'Projectmanagement'                        ,
 'Projectmanagement'                                      , 4, 550.00) ;
INSERT INTO courses VALUES
 ( '8003' , 'Information analysis'                     ,
 'System analysis'                                        , 5, 550.00) ;
INSERT INTO courses VALUES
 ( '8004' , 'System design'                            ,
 'System design'                                          , 5, 550.00) ;
INSERT INTO courses VALUES
 ( '8005' , 'StructuredProgramming'                    ,
 'Structured programming'                                 , 5, 550.00) ;
INSERT INTO courses VALUES
 ( '8006' , 'Technical writing'                        ,
 'Writing, evaluation and correction of technical manuals', 1, 475.00) ;
INSERT INTO courses VALUES
 ( '8031' , 'SAS fundamentals'                         ,
 'SAS fundamentals course'                                , 3, 550.00) ;
INSERT INTO courses VALUES
 ( '8032' , 'Advanced SAS'                             ,
 'Advanced SAS course'                                    , 2, 550.00) ;
INSERT INTO courses VALUES
 ( '8041' , 'Capacity planning'                        ,
 'Capacity planning : technics and strategies'            , 4, 550.00) ;
INSERT INTO courses VALUES
 ( '8042' , 'SRM parameters in MVS systems'            ,
 'Design of SRM parameters and tuning of MVS systems'     , 2, 550.00) ;
INSERT INTO courses VALUES
 ( '8043' , 'PC LAN'                                   ,
 'Seminar : PC LAN'                                       , 1, 500.00) ;
INSERT INTO courses VALUES
 ( '8051' , 'PC_DOS'                                   ,
 'Workshop PC-DOS'                                        , 2, 375.00) ;
INSERT INTO courses VALUES
 ( '8052' , 'DbaseIII programming'                     ,
 'DbaseIII (Plus) programming'                            , 3, 375.00) ;
INSERT INTO courses VALUES
 ( '8053' , 'CAD on PC'                                ,
 'CAD on PC'                                              , 1, 375.00) ;
INSERT INTO courses VALUES
 ( '8054' , 'DbaseIII systems'                         ,
 'DbaseIII systems'                                       , 3, 500.00) ;
INSERT INTO courses VALUES
 ( '8055' , 'LOTUS 123: programming'                   ,
 'LOTUS 123 (versie 2) programming'                       , 3, 375.00) ;
INSERT INTO courses VALUES
 ( '8056' , 'Autocad'                                  ,
 'Training Autocad'                                       , 2, 500.00) ;
 
 CREATE TABLE sessions
 ( sno        SMALLINT      NOT NULL ,
   sdate      DATE          NOT NULL ,
   sins_pno   SMALLINT      NOT NULL ,
   sloc_cono  SMALLINT      NOT NULL ,
   sroom      CHAR(8)       NOT NULL , -- WITH DEFAULT
   sorg_cono  SMALLINT               ,
   skind      CHAR(1)       NOT NULL ,
   sincomes   DECIMAL(9, 2) NOT NULL , -- WITH DEFAULT
   scancel    CHAR(1)                ,
   s_cid      CHAR(4)       NOT NULL
  , PRIMARY KEY (sno)
  , FOREIGN KEY (sins_pno)  REFERENCES persons (pno)
  , FOREIGN KEY (sloc_cono) REFERENCES companies (cono)
  , FOREIGN KEY (sorg_cono) REFERENCES companies (cono)
  , FOREIGN KEY (s_cid)     REFERENCES courses (cid)
 ) ;
 
INSERT INTO sessions VALUES (  1 , '2005-01-12' ,  1 ,  3 ,
 'C'   ,  3 , 'p' ,  4730.00 , NULL , '7850' ) ;
INSERT INTO sessions VALUES (  2 , '2005-04-12' ,  2 ,  3 ,
 'C'   ,  3 , 'p' ,  2250.00 , NULL , '7830' ) ;
INSERT INTO sessions VALUES (  3 , '2005-01-12' ,  3 ,  3 ,
 'B'   ,  3 , 'c' ,  4950.00 , 'c'  , '7820' ) ;
INSERT INTO sessions VALUES (  4 , '2005-03-15' ,  2 ,  3 ,
 'B'   ,  3 , 'p' ,  9000.00 , NULL , '7830' ) ;
INSERT INTO sessions VALUES (  5 , '2005-04-23' ,  2 ,  3 ,
 'A'   ,  3 , 'c' ,  6000.00 , NULL , '7890' ) ;
INSERT INTO sessions VALUES (  6 , '2005-04-14' , 36 ,  3 ,
 'A'   ,  3 , 'p' ,  5615.00 , 'C'  , '7820' ) ;
INSERT INTO sessions VALUES (  7 , '2005-04-21' ,  3 ,  5 ,
 'D'   ,  3 , 'p' ,  3350.00 , NULL , '7900' ) ;
INSERT INTO sessions VALUES (  8 , '2006-01-15' ,  3 , 22 ,
 ' '   ,  3 , 'c' , 13900.00 , NULL , '7900' ) ;
INSERT INTO sessions VALUES (  9 , '2006-03-17' , 26 , 10 ,
 ' '   , 10 , 'p' ,  2250.00 , 'C'  , '7820' ) ;
INSERT INTO sessions VALUES ( 10 , '2006-05-11' ,  3 ,  3 ,
 ' '   , 10 , 'c' ,     0.00 , 'C'  , '7850' ) ;
INSERT INTO sessions VALUES ( 11 , '2006-06-14' ,  1 ,  3 ,
 ' '   ,  3 , 'c' ,  4000.00 , NULL , '8043' ) ;
INSERT INTO sessions VALUES ( 12 , '2006-06-13' ,  3 ,  5 ,
 'west', 10 , 'p' ,  5600.00 , NULL , '7800' ) ;
INSERT INTO sessions VALUES ( 13 , '2006-05-11' ,  3 ,  3 ,
 'east', 10 , 'c' ,  6250.00 , NULL , '8001' ) ;
INSERT INTO sessions VALUES ( 14 , '2006-05-11' ,  2 ,  3 ,
 ' '   , 10 , 'c' ,  5000.00 , NULL , '7900' ) ;
INSERT INTO sessions VALUES ( 15 , '2006-05-11' , 36 ,  3 ,
 ' '   , 10 , 'p' ,  4500.00 , NULL , '7840' ) ;
INSERT INTO sessions VALUES ( 16 , '2007-01-01' , 36 ,  3 ,
 ' '   ,  3 , 'p' , 10150.00 , NULL , '7900' ) ;
INSERT INTO sessions VALUES ( 17 , '2007-02-01' , 36 , 10 ,
 ' '   ,  3 , 'p' ,     0.00 , NULL , '7900' ) ;

CREATE TABLE enrolments
 ( e_sno      SMALLINT      NOT NULL ,
   eno        SMALLINT      NOT NULL ,
   e_pno      SMALLINT               ,
   epay       DECIMAL(9, 2) NOT NULL , -- WITH DEFAULT
   e_cono     SMALLINT      NOT NULL ,
   ecancel    CHAR(1)                ,
   einv_cono  SMALLINT      NOT NULL
  , PRIMARY KEY (e_sno,eno)
  , FOREIGN KEY (e_sno)     REFERENCES sessions (sno)
  , FOREIGN KEY (e_pno)     REFERENCES persons (pno)
  , FOREIGN KEY (e_cono)    REFERENCES companies (cono)
  , FOREIGN KEY (einv_cono) REFERENCES companies (cono)
 ) ;
 
 
INSERT INTO enrolments VALUES (1,  1,  25, 385.00,   5, NULL,   9) ;
INSERT INTO enrolments VALUES (1,  2,  18, 500.00,  52, 'C' ,  52) ;
INSERT INTO enrolments VALUES (1,  3,  24, 385.00,   5, NULL,   9) ;
INSERT INTO enrolments VALUES (1,  4, 104, 495.00, 104, NULL, 104) ;
INSERT INTO enrolments VALUES (1,  5, 132, 550.00,   3, NULL, 104) ;
INSERT INTO enrolments VALUES (2,  1,  15, 385.00,  15, NULL,   3) ;
INSERT INTO enrolments VALUES (2,  2,  22, 385.00,  22, NULL,  22) ;
INSERT INTO enrolments VALUES (2,  3,  23, 385.00,  22, NULL,  22) ;
INSERT INTO enrolments VALUES (3,  1,  25, 385.00,   5, NULL,   5) ;
INSERT INTO enrolments VALUES (4,  1,  17, 550.00,  12, 'C' ,   1) ;
INSERT INTO enrolments VALUES (4,  2,   6, 550.00,  43, NULL,  43) ;
INSERT INTO enrolments VALUES (4,  3,   7, 550.00,  43, NULL,  43) ;
INSERT INTO enrolments VALUES (4,  4,   5, 550.00,  43, NULL,  43) ;
INSERT INTO enrolments VALUES (6,  1,   3,   0.00,   3, NULL,   3) ;
INSERT INTO enrolments VALUES (6,  2,   9, 440.00,   2, 'C' ,   2) ;
INSERT INTO enrolments VALUES (6,  3,  10, 440.00,   2, NULL,   2) ;
INSERT INTO enrolments VALUES (6,  4,  34, 550.00,   6, NULL,   6) ;
INSERT INTO enrolments VALUES (6,  5,  35, 550.00,  13, NULL,  13) ;
INSERT INTO enrolments VALUES (6,  6,  47, 550.00,  43, NULL,  43) ;
INSERT INTO enrolments VALUES (6,  7,  48, 550.00,  32, NULL,  32) ;
INSERT INTO enrolments VALUES (6,  8,  28, 495.00,  46, NULL,  46) ;
INSERT INTO enrolments VALUES (7,  1,  25, 330.00,   5, NULL,   9) ;
INSERT INTO enrolments VALUES (7,  2,  18, 375.00,  52, NULL,  52) ;
INSERT INTO enrolments VALUES (7,  3,  24, 375.00,   5, NULL,   9) ;
INSERT INTO enrolments VALUES (7,  4, 104, 495.00, 104, NULL, 104) ;
INSERT INTO enrolments VALUES (7,  5, 132, 440.00,  41, NULL,  41) ;
INSERT INTO enrolments VALUES (8,  1,   3,   0.00,   3, NULL,   3) ;
INSERT INTO enrolments VALUES (8,  2,   9, 440.00,   2, NULL,   2) ;
INSERT INTO enrolments VALUES (8,  3,  10, 440.00,   2, NULL,   2) ;
INSERT INTO enrolments VALUES (8,  4,  34, 550.00,   6, NULL,   6) ;
INSERT INTO enrolments VALUES (8,  5,  35, 550.00,  13, NULL,  13) ;
INSERT INTO enrolments VALUES (8,  6,  36, 550.00,  11, 'C' ,  11) ;
INSERT INTO enrolments VALUES (8,  7,  48, 495.00,  32, 'C' ,  32) ;
INSERT INTO enrolments VALUES (8,  9,  49, 495.00,  32, NULL,  32) ;
INSERT INTO enrolments VALUES (8, 10,  50, 495.00,  32, NULL,  32) ;
INSERT INTO enrolments VALUES (8, 11,  24, 550.00,   5, NULL,   5) ;
INSERT INTO enrolments VALUES (8, 12,  25, 550.00,   5, NULL,   5) ;
INSERT INTO enrolments VALUES (9,  1,  25, 499.95,  52, NULL,   9) ;

