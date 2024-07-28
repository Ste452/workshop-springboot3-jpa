# Readme still under development!

## Spring Boot Project WebService

This project is a web service developed with Spring Boot and JPA/Hibernate to provide resource management functionalities.

## Goals

- Create Spring Boot project Java
- Implement domain model
- Structure logical layers: resource, service, repository
- Config test database (H2)
- Populate the database
- CRUD - Create, Retrieve, Update, Delete
- Exception handling

## Technologies used

- Java 17
- Spring Boot 2.5.4
- Spring Data JPA
- Spring Security
- H2 Database
- Maven
- Apache Tomcat
- PostgreSQL
- Postman
- Heroku

## Prerequisites

- Java 17+
- Maven 3.6+
- PostgreSQL (for production)

## Dependencies:

      <dependency>
         <groupId>org.springframework.boot</groupId>
         <artifactId>spring-boot-starter-data-jpa</artifactId>
      </dependency>
    
      <dependency>
         <groupId>com.h2database</groupId>
         <artifactId>h2</artifactId>
         <scope>runtime</scope>
      </dependency>


    
## application.properties:

      spring.profiles.active=test

      spring.jpa.open-in-view=true  

## aplication-test.properties:

      # DATASOURCE 
      spring.datasource.driverClassName=org.h2.Driver
      spring.datasource.url=jdbc:h2:mem:testdb
      spring.datasource.username=sa
      spring.datasource.password= 
      
      # H2 CLIENT 
      spring.h2.console.enabled=true
      spring.h2.console.path=/h2-console
      
      # JPA, SQL 
      spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
      spring.jpa.defer-datasource-initialization=true
      spring.jpa.show-sql=true
      spring.jpa.properties.hibernate.format_sql=true
      

## Instalation:

1. Repository's clone:
   ```bash
   git clone https://github.com/acenelio/workshop-springboot2-jpa.git

2. Navigate to the project directory:
   ```bash
   cd workshop-springboot2-jpa

3. Install dependencies:
   ```bash
   mvn install

   
