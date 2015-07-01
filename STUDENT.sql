delete from "DB2ADMIN"."STUDENT";

CREATE TABLE "DB2ADMIN"."STUDENT"  (
		  "ID" INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (  
		    START WITH +0  
		    INCREMENT BY +1  
		    MINVALUE +0  
		    MAXVALUE +2147483647  
		    NO CYCLE  
		    CACHE 20  
		    NO ORDER ) , 
		  "NAME" VARCHAR(255 OCTETS) , 
		  "AGE" INTEGER )   
		 IN "USERSPACE1"  
		 ORGANIZE BY ROW; 

ALTER TABLE "DB2ADMIN"."STUDENT" PCTFREE 0;


-- DDL Statements for Primary Key on Table "DB2ADMIN"."STUDENT"

ALTER TABLE "DB2ADMIN"."STUDENT" 
	ADD PRIMARY KEY
		("ID")
	NOT ENFORCED;


ALTER TABLE "DB2ADMIN"."STUDENT" ALTER COLUMN "ID" RESTART WITH 20;

insert into "DB2ADMIN"."STUDENT" ("ID","NAME","AGE") 
  values (0,'tu',20) ;
insert into "DB2ADMIN"."STUDENT" ("ID","NAME","AGE") 
  values (1,'luong',24) ;
insert into "DB2ADMIN"."STUDENT" ("ID","NAME","AGE") 
  values (2,'dung',24) ;
insert into "DB2ADMIN"."STUDENT" ("ID","NAME","AGE") 
  values (3,'quan',22) ;
