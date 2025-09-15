# S04T01N01 - First Spring Boot Project with Maven

This project is a basic introduction to Spring Boot and Maven. It consists of a simple REST API that returns a greeting message based on the provided name.

## 🔧 Technologies Used

- Java 17
- Spring Boot 3.x
- Maven
- Spring Web
- Spring Boot DevTools

## 🚀 How to Run the Project

1. Make sure you have the following installed:
    - Java 17 (minimum)
    - Maven

2. Clone or download this repository.

3. Navigate to the project directory using your terminal:

```bash
cd S04T01N01
```

4. Run the application using Maven:

```bash
mvn clean spring-boot:run
```

5. Once the app is running, open your browser or Postman and test the available endpoints.

## 🌐 Available Endpoints

| Endpoint                                   | Description                                     | Example URL                                    |
|--------------------------------------------|-------------------------------------------------|------------------------------------------------|
| `/HelloWorld`                              | Returns a greeting using `@RequestParam`        | `http://localhost:9000/HelloWorld?name=Ignasi` |
| `/HelloWorld2` or `/HelloWorld2/{name}`    | Returns a greeting using `@PathVariable`        | `http://localhost:9000/HelloWorld2/Ignasi`     |

### 🧪 Example Responses

- `http://localhost:9000/HelloWorld`  
  → `Hello, UNKNOWN. You're executing a Maven Project`

- `http://localhost:9000/HelloWorld?name=yourName`  
  → `Hello, yourName. You're executing a Maven Project`

- `http://localhost:9000/HelloWorld2`  
  → `Hello, UNKNOWN. You're executing a Maven Project`

- `http://localhost:9000/HelloWorld2/yourName`  
  → `Hello, uourName. You're executing a Maven Project`

## ⚙️ Useful Maven Commands

| Command                  | Description                             |
|--------------------------|-----------------------------------------|
| `mvn clean`              | Deletes the `target/` directory         |
| `mvn compile`            | Compiles the project                    |
| `mvn package`            | Packages the application as a `.jar`    |
| `mvn spring-boot:run`    | Runs the Spring Boot application        |

## 📚 Resources Used

- https://docs.spring.io/spring-boot/documentation.html
- https://spring.io/guides/gs/rest-service
- [Spring Initializr - Project Generator](https://start.spring.io/)
