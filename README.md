# Load Booking System

This project is a Spring Boot-based backend service for managing load bookings. It allows users to create, retrieve, update, and delete load information. The backend is connected to a PostgreSQL database for persistent storage of load data.

## Table of Contents
1. [Setup Instructions](#setup-instructions)
2. [API Usage](#api-usage)
   - [GET all loads](#get-all-loads)
   - [GET a load by ID](#get-a-load-by-id)
   - [POST a new load](#post-a-new-load)
   - [PUT to update a load](#put-to-update-a-load)
   - [DELETE a load](#delete-a-load)
3. [Assumptions](#assumptions)

## Setup Instructions

### Prerequisites
1. **Java 17+**: Ensure you have Java 17 or higher installed.
2. **Maven**: Maven is used for dependency management and building the project. Make sure it's installed and configured.
3. **PostgreSQL**: Set up a PostgreSQL instance on your machine or use a cloud database provider (e.g., AWS RDS, Heroku Postgres).

### Steps
1. **Clone the Repository:**
2. **Configure Database Connection:**
3.Build the Project:
Use Maven to build the project:
4.Run the Application:
Start the Spring Boot application:

##Assumptions
Database Configuration: The application assumes that a PostgreSQL database is used, and the database is accessible via the credentials provided in application.properties.

Data Persistence: The application relies on Hibernate's automatic schema generation (spring.jpa.hibernate.ddl-auto=update) to manage database tables. Ensure that the database is properly configured.

Error Handling: Error responses are handled by Spring Boot and returned as JSON in case of errors like "Bad Request" or "Not Found."

Security: This version does not implement any security measures (e.g., authentication, authorization). It’s recommended to add Spring Security or other authentication methods for production environments.

