# User Management System

This is a backend application built with **Spring Boot**, **Hibernate**, and **Spring Data JPA**. It allows you to perform CRUD operations (Create, Read, Update, Delete) on user details such as first name, last name, phone number, email, and address. The application uses a database to store user information and includes basic data validation.

## Features
- REST APIs for managing users
- Data validation for user inputs
- CRUD operations
- Database storage using MySQL or H2 (in-memory)

## Technologies Used
- Java 17
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL or H2 (for database)
- Postman (for testing)

## Endpoints
- `GET /api/users` - Retrieve all users
- `GET /api/users/{id}` - Retrieve a user by ID
- `POST /api/users` - Create a new user
- `PUT /api/users/{id}` - Update an existing user
- `DELETE /api/users/{id}` - Delete a user

## How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/your-repo/user-management-system.git
   ```

2. Update `application.properties` for MySQL configuration or use the default H2 database.

3. Run the application:
   ```bash
   mvn spring-boot:run
   ```

4. Use Postman to test the APIs at `http://localhost:8080/api/users`.
