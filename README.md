# spring_jdbc_db2

HOW TO INSTALL

- Run this command in CMD, replace <PATH TO DB2JCC FILE> by path to db2jcc.jar in lib folder.

mvn install:install-file -Dfile=<PATH TO DB2JCC FILE> -DgroupId=com.ibm.db2 -DartifactId=db2jcc -Dversion=3.66.46 -Dpackaging=jar -DgeneratePom=true

- Create new connection name 'SAMPLE' and run SQL in STUDENT.sql file to create STUDENT table and data.

- Build and run project, see the log in console
