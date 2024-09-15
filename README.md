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

First, clone the repository to your local machine:
    `git clone https://github.com/igorzig13/psi-planner.git`
Then, navigate to the project directory:
    `cd /your/path/to/psi-planner`
Make sure you have Java 17 installed on your machine. You can verify this by running:
    `java -version` or `java --version`
If Java 17 is not installed, download and install it from the official Java website or use a package manager suitable for your operating system.
On the project directory, use Gradle to build the project. Run the following command:
    `./gradlew build`
After building the project, you can run the application using:
    `./gradlew bootRun`
Now, by accessing `http://localhost:8080` you should see a welcome page confirming the application is running. 

### Endpoints and documentation

You can explore the API endpoints interactively by visiting `http://localhost:8080/swagger-ui.html` while the application is running.

### About the major project

Psi Planner is a way  to connect therapists and other Psychology professionals with their customers or patients.
It allows clinics and other establishments to register their professionals, while the final clients can check their
agenda and availability, thus being able to make appointments.