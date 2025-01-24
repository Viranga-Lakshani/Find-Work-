# JobBoardBackend

A simple backend service for managing job postings. Built with Java and Spring Boot.

## About

This backend provides a RESTful API for handling job data. It allows clients to create, retrieve, update, and delete job listings.

## Technologies

*   Java 17+
*   Spring Boot 3.x
*   Spring Data JPA
*   H2 Database (for development)
*   Maven

## Getting Started

1.  Clone the repo: `git clone ...`
2.  Go to the project directory: `cd job-board-backend`
3.  Build: `mvn clean install`
4.  Run: `mvn spring-boot:run`

API available at `http://localhost:8080/api/jobs`.

## API Endpoints

*   `GET /api/jobs`: Get all jobs.
*   `GET /api/jobs/{id}`: Get job by ID.
*   `POST /api/jobs`: Create a new job (JSON body).
*   `PUT /api/jobs/{id}`: Update a job (JSON body).
*   `DELETE /api/jobs/{id}`: Delete a job.

## Development Notes

*   H2 is for development. Use a real database in production.
*   More features (search, auth) can be added.

## Contributing

Contributions are welcome!
