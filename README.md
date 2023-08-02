# Employees REST API
A simple REST API for performing CRUD operations on an employees database. The API is built using Spring Boot, Hibernate/JPA and MySQL.

## Requirements
* You need to have JDK 17 or greater installed.
* You need to have a MySQL connection with a valid user and password.

## Installation
1. Clone the repository or download the ZIP file.
2. Run the SQL script provided in the sql-script folder to use my table of employees.
3. Execute the following in terminal to build and run the project.
> ./mvnw clean install \
> ./mvnw spring-boot:run

## How to Use
The API allows the following endpoints and methods:
* "/api/employees" (GET method) - returns the list of all employees
* "/api/employees/{employeeId}" (GET method) - returns the employee with an id of {employeeId}
* "/api/employees" (POST method) - creates a new employee, using the parameters provided in the request
* "/api/employees" (PUT method) - updates an existing employee, using the parameters provided in the request
* "/api/employees/{employeeId}" - deletes an employee with an id of {employeeId}