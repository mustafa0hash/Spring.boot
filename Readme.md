# Spring Boot, MySQL, JPA, Hibernate



###################################################

setting the database
    1- execute sql line creat database mydb
    or change the schema name in application.properties inside resource folder
    2- update username and password in application.properties 

## Requirements

1. Java 

2. Maven 

3. Mysql 

To run the program execute
    mvn spring-boot:run
    and look at <http://locathost:8080>
    
    
CRUD methods 

  ## GET
    
    http://locathost:8080/v1/getAll
    http://locathost:8080/hello
    http://locathost:8080/v1/read/{variable}
    http://locathost:8080
  
  ##POST
     
    http://locathost:8080/v1/insert
    http://locathost:8080/v1/exper
    http://locathost:8080/v1/certification
    http://locathost:8080/v1/equvlance
  
  ##PUT
  
    http://locathost:8080/v1/EditPerson
    http://locathost:8080/v1/exper
    http://locathost:8080/v1/certification
    http://locathost:8080/v1/equvlance
    
  ##DELETE
  
    http://locathost:8080/v1/deletePerson
    http://locathost:8080/v1/delete/{id}
  


