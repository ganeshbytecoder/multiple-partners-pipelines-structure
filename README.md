# KaleidoPipelines

A Spring Boot application for feature engineering and data processing pipelines.

## Overview
KaleidoPipelines is a robust data processing application that handles feature engineering for different partners using a flexible and extensible architecture.

## Features
- Asynchronous data processing
- Partner-specific feature engineering
- RESTful API endpoints
- H2 in-memory database
- Actuator endpoints for monitoring
- Configurable thread pool for parallel processing

## Getting Started

### Prerequisites
- Java 11 or higher
- Maven 3.6 or higher

### Building the Application
```bash
mvn clean install
```

### Running the Application
```bash
mvn spring-boot:run
```

The application will start on port 8080 with context path `/api`.

### Accessing the H2 Console
- URL: http://localhost:8080/api/h2-console
- JDBC URL: jdbc:h2:mem:kaleidodb
- Username: sa
- Password: password

### Health Check
- http://localhost:8080/api/actuator/health

## Project Structure
```
kaleidoPipelines/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── bytecoder/
│   │   │           └── kaleidopipelines/
│   │   │               ├── config/
│   │   │               ├── controller/
│   │   │               ├── model/
│   │   │               ├── repository/
│   │   │               ├── service/
│   │   │               └── KaleidoPipelinesApplication.java
│   │   └── resources/
│   │       └── application.yml
│   └── test/
└── pom.xml
```

## Configuration
The application can be configured through `application.yml`. Key configurations include:
- Database settings
- Server port and context path
- Logging levels
- Actuator endpoints
- Thread pool settings

## API Documentation
API documentation will be available through Swagger UI at: http://localhost:8080/api/swagger-ui.html
