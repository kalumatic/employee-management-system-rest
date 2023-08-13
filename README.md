# Employees REST API

A simple REST API for performing CRUD operations on an employees database. The API is built using Spring Boot, Hibernate/JPA, and MySQL.

## Table of Contents

- [Requirements](#requirements)
- [Installation](#installation)
- - [Database Setup](#database-setup)
- [Usage](#usage)
- - [Endpoints](#endpoints)
- [Authentication and Authorization](#authentication-and-authorization)
- [Contributing](#contributing)
- [License](#license)
- [Contact](#contact)

## Requirements

To run this project, ensure you have the following prerequisites:

- **JDK 17 or greater**: Make sure you have Java Development Kit (JDK) 17 or a higher version installed.

- **MySQL Database**: Set up a MySQL database connection with a valid username and password.

## Installation

Follow these steps to get the project up and running:

1. **Clone the Repository**: Clone this repository or download the ZIP file to your local machine.

### Database Setup

2. **Database Initialization**: Execute the SQL script provided in the `sql-script` folder to create the necessary employees table.

3. **Build and Run**: Open a terminal and navigate to the project's root directory. Run the following commands to build and run the project:

   ```sh
   ./mvnw clean install
   ./mvnw spring-boot:run

## Usage

### Endpoints

The API provides the following endpoints and methods:

- **GET /api/employees**: Retrieve a list of all employees. To sort the list by a specific field, append `?sort={field}` to the URL.

- **GET /api/employees/{employeeId}**: Retrieve details of an employee with the given ID.

- **POST /api/employees**: Create a new employee using the parameters provided in the request.

- **PUT /api/employees**: Update an existing employee using the parameters provided in the request.

- **DELETE /api/employees/{employeeId}**: Delete an employee with the given ID.

## Authentication and Authorization

The API includes authentication and authorization features with predefined roles and users:

Default Users: kalu, nikola, lazar

Authentication information and roles are defined in the `SecurityConfig` class.

Roles: EMPLOYEE, MANAGER, ADMIN

- EMPLOYEE: Can access the first two endpoints.
- MANAGER: Can access the second two endpoints.
- ADMIN: Can access the last endpoint.

Default Password: "password"

Note that the database stores an encrypted version of the password using the bcrypt algorithm.

Feel free to explore and interact with the API using these endpoints and roles!

## Contributing

We welcome contributions from the community! If you find any issues or want to add new features, please follow our [Contribution Guidelines](CONTRIBUTING.md).

## License

This project is licensed under the [MIT License](LICENSE).

## Contact

For any additional information or questions, please contact [Your Name] at [your@email.com].
