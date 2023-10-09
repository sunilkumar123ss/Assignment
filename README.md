# Assignment


# My Spring Boot REST API Project

A Java Spring Boot application that implements a RESTful API for managing items.

## Prerequisites

- Java Development Kit (JDK)
- Apache Maven

## Getting Started

1. Clone the repository.
2. Navigate to the project directory.
3. Build the application using Maven.
4. Run the application.
5. The application should now be running on [http://localhost:8080](http://localhost:8080).

## API Endpoints

- [GET /items](https://crowded-waste-production.up.railway.app/items): Get a list of all items.
- [GET /items/{id}](https://crowded-waste-production.up.railway.app/items/{id}): Get an item by ID.
- [POST /items](https://crowded-waste-production.up.railway.app/items): Add a new item.

  ### Adding a New Item
To add a new item to the API, you can make a POST request with the following JSON payload:
Example using cURL:
curl -X POST -H "Content-Type: application/json" -d '{"name":"New Item", "description":"Description of the new item"}' http://localhost:8080/items


### Example:

To get a list of all items, you can use the following URL:

[https://crowded-waste-production.up.railway.app/items](https://crowded-waste-production.up.railway.app/items)

To get an item by ID, replace `{id}` with the actual item ID in the following URL:

[https://crowded-waste-production.up.railway.app/items/{id}](https://crowded-waste-production.up.railway.app/items/{id})

To add a new item, you can send a POST request to the following URL:

[https://crowded-waste-production.up.railway.app/items](https://crowded-waste-production.up.railway.app/items)




