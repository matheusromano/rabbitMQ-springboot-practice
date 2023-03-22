# RabbitMQ with Spring Boot Application

This is a simple RabbitMQ with Spring Boot application that runs on port 8080.

## Getting Started

To get started with this application, you need to have the following:

- Java 8 or higher
- RabbitMQ installed and running
- Maven or Gradle

### Cloning the Repository

You can clone the repository using the following command:
```
git clone https://github.com/matheusromano/rabbitMQ-springboot-practice/.git
```

### Building the Application

To build the application, navigate to the project directory and run the following command:
```
mvn clean install
```

### Running the Application

To run the application, navigate to the project directory and run the following command:
```
mvn spring-boot:run
```
This will start the application on port 8080.

## Using the Application

The application exposes a REST endpoint that accepts a message and publishes it to a RabbitMQ queue. To use the application, send a **GET** request to the following URL:
```
http://localhost:8080/api/v1/publish?message=your_message
```
The application also exposes a REST endpoint for send a User as json object. To use that, send a **POST** request to the following URL:
```
http://localhost:8080/api/v1/publish
```
with the following JSON payload:
```json
{
  "id": 1,
  "firstName": "yourName",
  "lastName": "yourLastName"
}
```

## Conclusion

That's it! You now have a simple RabbitMQ with Spring Boot application up and running on port 8080. Feel free to modify the application to suit your needs.







