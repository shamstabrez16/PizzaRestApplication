# PizzaRestApplication
Pizza Web Application  



The Pizza REST application is built using Java as the primary programming language. 
It utilizes the Hibernate framework, which is an open-source Object-Relational Mapping (ORM) tool for Java, 
to handle the mapping between the application's Java objects and the relational database. 
Hibernate allows the application to interact with the database using simple Java objects, rather than having to write complex SQL queries.

The application also uses the Spring framework, which is a popular Java framework for building enterprise applications. 
Spring provides a comprehensive programming and configuration model for Java applications, and it is used to manage the application's beans and dependencies, 
and to handle various aspects of the application's execution, such as transactions and security.


The Spring framework provides a set of tools for building RESTful web services, such as Spring MVC and Spring Data REST. 
These tools make it easy to create RESTful endpoints for the application and handle the HTTP requests and responses.

The use of Spring also allows for easy integration with other systems and services through the use of Spring Boot and Spring Cloud.
Spring Boot is a tool that allows for easy creation of standalone, production-grade Spring-based applications, 
while Spring Cloud provides tools for building distributed systems, including service discovery and load balancing.

By using Java, Hibernate and Spring, this application is built with enterprise-level robustness and scalability,
making it well suited for a high-traffic, high-concurrency environment.


Bcrypt Hashing for password

The Pizza REST application uses Bcrypt for password hashing and verification, it is a well-vetted and well-tested library for password hashing.
Bcrypt is designed to be slow and resource-intensive, making it more difficult for an attacker to crack the password even if they have access to the hashed password,
it also uses a unique salt for each password. Bcrypt is considered as a secure way of storing password hashes,
it is a good practice to use a library for password hashing rather than rolling your own implementation.
