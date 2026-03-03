# Typing App Backend

Typing practice web application built with Spring Boot.
Provides JWT-based authentication and typing result statistics.

## Tech Stack

- Java 17
- Spring Boot
- Spring Security (JWT)
- Spring Data JPA
- PostgreSQL
- Maven

## Features (MVP)

- User registration
- JWT authentication
- Submit typing results
- View personal typing statistics

## Project Structure

```
controller/   - REST controllers
service/      - Business logic
repository/   - Database access layer
model/entity/ - JPA entities
dto/          - Request/response models
security/     - JWT utilities and security configuration
config/       - Application configuration
```

## Environment Variables

This project requires the following environment variables:

- `DB_URL`
- `DB_USERNAME`
- `DB_PASSWORD`
- `JWT_SECRET`

Example:

```
setx DB_URL jdbc:postgresql://localhost:5432/keyboard-trainer
setx DB_USERNAME postgres
setx DB_PASSWORD yourpassword
setx JWT_SECRET your_long_random_secret
```

Restart your IDE or terminal after setting them.

## Run Locally

1. Create a PostgreSQL database named `keyboard-trainer`.
2. Set environment variables.
3. Run:

```
mvn clean install
mvn spring-boot:run
```

Application runs on:

```
http://localhost:8080
```

## Notes

- Passwords are hashed using BCrypt.
- JWT authentication is stateless.
- Secrets are not stored in the repository.