![Java](https://img.shields.io/badge/java_17-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)
![Gradle](https://img.shields.io/badge/gradle-02303A?style=for-the-badge&logo=gradle&logoColor=white)
![Hibernate](https://img.shields.io/badge/Hibernate-59666C?style=for-the-badge&logo=Hibernate&logoColor=white)
![Postgres](https://img.shields.io/badge/postgresql-4169e1?style=for-the-badge&logo=postgresql&logoColor=white)
![Docker](https://img.shields.io/badge/docker-%230db7ed.svg?style=for-the-badge&logo=docker&logoColor=white)

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
- Docker and Docker-Compose
- Thymeleaf (just for rendering a welcome page)

## Attention: Work in progress!

This API and any back-end related feature are in early stages of development, expect lots of updates in the coming months.
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
3. Make sure you have Docker installed on your machine. You can verify this by running:
    ```bash
   docker --version
   ```
   - If you are not using IntelliJ integration, which is highly recommended, make sure you also have docker-compose intalled.

4. On the project directory, use Gradle to build the project. Run the following command:
    ```bash
   ./gradlew build
   ```
5. After building the project, reach the `src/main/java/PsiPlannerApplication.java` on IntelliJ and click the play button on the main method.
An error message will be shown, don't worry. Now in the upper right corner of the editor, click 'Edit configurations...'

6. Choose to run 'PsiPlannerApplication' on 'Docker Compose...' and make sure to select the `springbootapp` service.
Then, just click 'next' and 'create'. This will allow you to easily debug the application even when running it on a container.

7. Open the 'docker-compose.yml' file, 'play' the postgres service. Alternatively you can run:
   ```bash
   docker-compose up postgres
   ```
   
8. Run PsiPlannerApplication again. Now, by accessing http://localhost:8080 you should see a welcome page confirming the application is running.
Alternatively you can simply run:
   ```bash
   docker-compose up springbootapp
   ```

### Endpoints and documentation

By now, you can explore the API endpoints interactively by visiting `http://localhost:8080/swagger-ui.html` while the application is running.

### About the major project

Psi Planner is intended to be a way to connect the clients and/or patients with therapists and other Psychology professionals.
It will allow clinics to register their professionals (self-employed professionals can register themselves), while the final clients can check their
schedule and availability, being able to make appointment bookings to therapy sessions, psychological tests and assessments with just a few clicks.
Professionals will have a centralized dashboard to manage their appointments, schedule and to monitor important metrics to enhance their practice.