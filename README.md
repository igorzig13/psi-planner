![Java](https://img.shields.io/badge/java_17-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)
![Gradle](https://img.shields.io/badge/gradle-02303A?style=for-the-badge&logo=gradle&logoColor=white)
![Hibernate](https://img.shields.io/badge/Hibernate-59666C?style=for-the-badge&logo=Hibernate&logoColor=white)
![Postgres](https://img.shields.io/badge/postgresql-4169e1?style=for-the-badge&logo=postgresql&logoColor=white)

## Psi Planner API

This RESTful API is part of a major full-stack personal project called "Psi Planner".
It uses Spring Boot powered with technologies like:
- Spring Web
- Spring Data JPA
- Spring Security
- Spring Validation
- Flyway Migration
- PostgreSQL
- SwaggerUI
- Thymeleaf (just for rendering a welcome page)

## Attention: Work in progress!

This API and any front-end related to it are in early stages of development.
Later on you will be able to read an in-depth documentation and see images of the application as a whole.

### How to run

1. Clone the repository to your local machine:
    ```bash
   git clone https://github.com/igorzig13/psi-planner.git
   ```
2. Navigate to the project directory:
    ```bash
   cd /your/path/to/psi-planner
   ```
3. Make sure you have Java 17 installed on your machine. You can verify this by running:
    ```bash
   java --version
   ```
   - To ensure compatibility and avoid licensing issues, it is recommended to use OpenJDK 17.

4. On the project directory, use Gradle to build the project. Run the following command:
    ```bash
   ./gradlew build
   ```
5. After building the project, you can run the application using:

    `./gradlew bootRun`


6. Now, by accessing `http://localhost:8080` you should see a welcome page confirming the application is running. 

### Endpoints and documentation

You can explore the API endpoints interactively by visiting `http://localhost:8080/swagger-ui.html` while the application is running.

### About the major project

Psi Planner is a way  to connect therapists and other Psychology professionals with their customers or patients.
It allows clinics and other establishments to register their professionals, while the final clients can check their
agenda and availability, thus being able to make appointments.