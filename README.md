# Assignment
# Simple Java Spring Boot REST API

A Java Spring Boot application that implements a RESTful API for managing items.

## Prerequisites

- Java Development Kit (JDK)
- Apache Maven

## Getting Started

1. Clone the repository.
2. Navigate to the project directory.
3. Build the application using Maven.
4. Run the application.

The application should now be running on `http://localhost:8080`.

## API Endpoints

- **GET /items**: Get a list of all items.
- **GET /items/{id}**: Get an item by ID.
- **POST /items**: Add a new item.

### Adding a New Item
To add a new item to the API, you can make a POST request with the following JSON payload:
Example using cURL:
curl -X POST -H "Content-Type: application/json" -d '{"name":"New Item", "description":"Description of the new item"}' http://localhost:8080/items


```json
{
    "name": "New Item",
    "description": "Description of the new item"
}


