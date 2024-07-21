# Flourite

Welcome to **Flourite**! Flourite is a data visualization tool designed to provide insightful and interactive visualizations for your data. Built using Spring Boot for the server, Vue.js for the client, and PostgreSQL for the database, Flourite offers a powerful and user-friendly platform for analyzing and presenting data.

## Table of Contents

- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [Project Structure](#project-structure)
- [API Documentation](#api-documentation)
- [Dependencies](#dependencies)
- [Contributing](#contributing)
- [License](#license)

## Features

- Interactive and dynamic data visualizations
- User-friendly interface built with Vue.js
- Robust server with Spring Boot
- Efficient data storage and retrieval with PostgreSQL
- Customizable charts and graphs
- Secure user authentication and authorization

## Installation

To set up and run Flourite locally, follow these steps:

### Server (Spring Boot)

1. **Clone the repository:**

    ```bash
    git clone https://github.com/7irelo/flourite-web.git
    cd flourite-web
    ```

2. **Navigate to the server directory:**

    ```bash
    cd server
    ```

3. **Set up your PostgreSQL database:**

    Create a PostgreSQL database and update the database connection settings in `src/main/resources/application.properties`.

4. **Build and run the Spring Boot application:**

    ```bash
    ./mvnw spring-boot:run
    ```

### Client (Vue.js)

1. **Navigate to the client directory:**

    ```bash
    cd ../client
    ```

2. **Install dependencies:**

    ```bash
    npm install
    ```

3. **Run the Vue.js application:**

    ```bash
    npm run serve
    ```

    The client will be available at `http://localhost:8080` by default.

## Usage

Flourite provides a web-based interface for creating and viewing data visualizations. After starting both the server and client, you can access the application through your web browser.

- **Home Page:** View and access various visualization options.
- **Data Upload:** Upload your data files for visualization.
- **Visualization Dashboard:** Create and customize charts and graphs based on your data.

## Project Structure

Here’s an overview of the project structure:

```
flourite/
│
├── server/                  # Spring Boot server
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   └── com/
│   │   │   │       └── 7irelo/
│   │   │   │           └── flourite/
│   │   │   │               ├── controller/       # REST controllers
│   │   │   │               ├── dao/               # Data Access Objects
│   │   │   │               ├── model/            # POJOs for data models
│   │   │   │               ├── repository/       # JDBC repositories
│   │   │   │               └── service/          # Business logic
│   │   │   └── resources/
│   │   │       ├── application.properties        # Configuration file
│   │   │       └── static/                      # Static assets
│   │   └── test/                             # Unit and integration tests
│   ├── pom.xml                               # Maven configuration
│   └── README.md                            # Server README
│
├── client/                  # Vue.js client
│   ├── src/
│   │   ├── assets/                # Static assets
│   │   ├── components/           # Vue components
│   │   ├── views/                # Vue views
│   │   └── router/               # Vue router configuration
│   ├── public/
│   ├── package.json              # Node.js dependencies
│   └── README.md                # Client README
│
├── .env                         # Environment variables
└── LICENSE                      # License file
```

## API Documentation

API documentation for the Spring Boot server is available at:

```
http://localhost:8080/swagger-ui.html
```

## Dependencies

### Server (Spring Boot)

- `Spring Boot`: Framework for building Java-based applications
- `JDBC`: Java Database Connectivity for database interaction
- `PostgreSQL`: Relational database
- `Swagger`: API documentation

### Client (Vue.js)

- `Vue.js`: JavaScript framework for building user interfaces
- `Axios`: HTTP client for making API requests
- `Vue Router`: Routing for Vue.js applications
- `Chart.js`: JavaScript library for charts and graphs

## Contributing

We welcome contributions to Flourite! To contribute:

1. Fork the repository
2. Create a new branch for your changes
3. Make your changes and commit them
4. Open a pull request with a description of your changes

## License

This project is licensed under the [MIT License](LICENSE).

---

Feel free to modify or add any details specific to your project!
