# integration-kafka-avro-registry

This project demonstrates integration of Apache Kafka as the message broker along with Confluent Schema Registry and Avro serialization using Spring Boot.

## Features

- Spring Boot based Kafka producer and consumer
- Avro serialization/deserialization
- Schema Registry integration for Avro schemas

## Prerequisites

- Java 17+
- Apache Kafka
- Confluent Schema Registry

## Getting Started

1. **Clone the repository**
    ```bash
    git clone https://github.com/your-repo/integration-kafka-avro-registry.git
    cd integration-kafka-avro-registry
    ```

2. **Configure Kafka and Schema Registry**
    - Update `application.yml` with your Kafka and Schema Registry endpoints.

3. **Build and Run**
    
    - **Run docker containers:** From root dir run the following to start dockerised    Kafka, Zookeeper, Schema Registry, and Control Center

        ```docker-compose up -d```
    
    - **Start demo spring boot application:**
        ```cd schema-registry-demo-service/
        ./mvnw spring-boot:run
        ```
    
    - **Register schemas:**

        ```mvn schema-registry:register```
    
    - **Schema Registry API curl**

        List subjects:
        ```curl -X GET http://localhost:8081/subjects```
    
        Get registered schemas for given Ids:
        ```curl -X GET http://localhost:8081/schemas/ids/1```

    - **Produce event to Kafka using curl (Windows Command Prompt):**

        ```cmd
        curl -X POST http://localhost:8080/v1/api/send 
        -H "Content-Type: application/json" 
        -d "{\"id\": \"12345\", \"name\": \"John Doe\", \"email\": \"john.doe@example.com\"}"
        ```
        **Output:**
        ```Message sent to Kafka topic: user-topic with key: 12345 and value: {"id": "12345", "name": "John Doe", "email": "john.doe@example.com"}
        Consumed message: {"id": "12345", "name": "John Doe", "email": "john.doe@example.com"}
        ```

## Usage

The application will produce and consume Avro-encoded messages to/from Kafka topics.
Avro schemas are managed via Schema Registry.

- **Kafka Confluent Control Center:**
    
    Confluent Control Center is a UI over the Kafka cluster, providing configuration, data and information on the brokers, topics and messages. It integrates with Schema Registry, enabling viewing of schemas.

- **Navigate to the Control Center:**

    ```http://localhost:9021```

- **Avro**

    Generate the source code for the events using the Avro schema: (optional - this happens as part of the `install`)
    
    ```mvn clean generate-sources```

## Docker clean up# integration-kafka-avro-registry

This project demonstrates integration of Apache Kafka as the message broker along with Confluent Schema Registry and Avro serialization using Spring Boot.

## Features

- Spring Boot based Kafka producer and consumer
- Avro serialization/deserialization
- Schema Registry integration for Avro schemas

## Prerequisites

- Java 17+
- Apache Kafka
- Confluent Schema Registry

## Getting Started

1. **Clone the repository**
    ```bash
    git clone https://github.com/your-repo/integration-kafka-avro-registry.git
    cd integration-kafka-avro-registry
    ```

2. **Configure Kafka and Schema Registry**
    - Update `application.yml` with your Kafka and Schema Registry endpoints.

3. **Build and Run**
    
    - **Run docker containers:** From root dir run the following to start dockerised    Kafka, Zookeeper, Schema Registry, and Control Center

        ```docker-compose up -d```
    
    - **Start demo spring boot application:**
        ```cd schema-registry-demo-service/
        ./mvnw spring-boot:run
        ```
    
    - **Register schemas:**

        ```mvn schema-registry:register```
    
    - **Schema Registry API curl**

        List subjects:
        ```curl -X GET http://localhost:8081/subjects```
    
        Get registered schemas for given Ids:
        ```curl -X GET http://localhost:8081/schemas/ids/1```

    - **Produce event to Kafka using curl (Windows Command Prompt):**

        ```cmd
        curl -X POST http://localhost:8080/v1/api/send 
        -H "Content-Type: application/json" 
        -d "{\"id\": \"12345\", \"name\": \"John Doe\", \"email\": \"john.doe@example.com\"}"
        ```
        **Output:**
        ```Message sent to Kafka topic: user-topic with key: 12345 and value: {"id": "12345", "name": "John Doe", "email": "john.doe@example.com"}
        Consumed message: {"id": "12345", "name": "John Doe", "email": "john.doe@example.com"}
        ```

## Usage

The application will produce and consume Avro-encoded messages to/from Kafka topics.
Avro schemas are managed via Schema Registry.

- **Kafka Confluent Control Center:**
    
    Confluent Control Center is a UI over the Kafka cluster, providing configuration, data and information on the brokers, topics and messages. It integrates with Schema Registry, enabling viewing of schemas.

- **Navigate to the Control Center:**

    ```http://localhost:9021```

- **Avro**

    Generate the source code for the events using the Avro schema: (optional - this happens as part of the `install`)
    
    ```mvn clean generate-sources```

## Docker clean up

```docker-compose down```

## Project Structure

- `src/main/java`: Spring Boot application source code
- `src/main/resources`: Configuration files
- `avro/`: Avro schema definitions

## References

- [Spring for Apache Kafka](https://spring.io/projects/spring-kafka)
- [Confluent Schema Registry](https://docs.confluent.io/platform/current/schema-registry/index.html)
- [Avro Documentation](https://avro.apache.org/docs/current/)

## License

This project is licensed under the MIT License.# integration-kafka-avro-registry

This project demonstrates integration of Apache Kafka as the message broker along with Confluent Schema Registry and Avro serialization using Spring Boot.

## Features

- Spring Boot based Kafka producer and consumer
- Avro serialization/deserialization
- Schema Registry integration for Avro schemas

## Prerequisites

- Java 17+
- Apache Kafka
- Confluent Schema Registry

## Getting Started

1. **Clone the repository**
    ```bash
    git clone https://github.com/your-repo/integration-kafka-avro-registry.git
    cd integration-kafka-avro-registry
    ```

2. **Configure Kafka and Schema Registry**
    - Update `application.yml` with your Kafka and Schema Registry endpoints.

3. **Build and Run**
    
    - **Run docker containers:** From root dir run the following to start dockerised    Kafka, Zookeeper, Schema Registry, and Control Center

        ```docker-compose up -d```
    
    - **Start demo spring boot application:**
        ```cd schema-registry-demo-service/
        ./mvnw spring-boot:run
        ```
    
    - **Register schemas:**

        ```mvn schema-registry:register```
    
    - **Schema Registry API curl**

        List subjects:
        ```curl -X GET http://localhost:8081/subjects```
    
        Get registered schemas for given Ids:
        ```curl -X GET http://localhost:8081/schemas/ids/1```

    - **Produce event to Kafka using curl (Windows Command Prompt):**

        ```cmd
        curl -X POST http://localhost:8080/v1/api/send 
        -H "Content-Type: application/json" 
        -d "{\"id\": \"12345\", \"name\": \"John Doe\", \"email\": \"john.doe@example.com\"}"
        ```
        **Output:**
        ```Message sent to Kafka topic: user-topic with key: 12345 and value: {"id": "12345", "name": "John Doe", "email": "john.doe@example.com"}
        Consumed message: {"id": "12345", "name": "John Doe", "email": "john.doe@example.com"}
        ```

## Usage

The application will produce and consume Avro-encoded messages to/from Kafka topics.
Avro schemas are managed via Schema Registry.

- **Kafka Confluent Control Center:**
    
    Confluent Control Center is a UI over the Kafka cluster, providing configuration, data and information on the brokers, topics and messages. It integrates with Schema Registry, enabling viewing of schemas.

- **Navigate to the Control Center:**

    ```http://localhost:9021```

- **Avro**

    Generate the source code for the events using the Avro schema: (optional - this happens as part of the `install`)
    
    ```mvn clean generate-sources```

## Docker clean up

```docker-compose down```

## Project Structure

- `src/main/java`: Spring Boot application source code
- `src/main/resources`: Configuration files
- `avro/`: Avro schema definitions

## References

- [Spring for Apache Kafka](https://spring.io/projects/spring-kafka)
- [Confluent Schema Registry](https://docs.confluent.io/platform/current/schema-registry/index.html)
- [Avro Documentation](https://avro.apache.org/docs/current/)

## License

This project is licensed under the MIT License.# integration-kafka-avro-registry

This project demonstrates integration of Apache Kafka as the message broker along with Confluent Schema Registry and Avro serialization using Spring Boot.

## Features

- Spring Boot based Kafka producer and consumer
- Avro serialization/deserialization
- Schema Registry integration for Avro schemas

## Prerequisites

- Java 17+
- Apache Kafka
- Confluent Schema Registry

## Getting Started

1. **Clone the repository**
    ```bash
    git clone https://github.com/your-repo/integration-kafka-avro-registry.git
    cd integration-kafka-avro-registry
    ```

2. **Configure Kafka and Schema Registry**
    - Update `application.yml` with your Kafka and Schema Registry endpoints.

3. **Build and Run**
    
    - **Run docker containers:** From root dir run the following to start dockerised    Kafka, Zookeeper, Schema Registry, and Control Center

        ```docker-compose up -d```
    
    - **Start demo spring boot application:**
        ```cd schema-registry-demo-service/
        ./mvnw spring-boot:run
        ```
    
    - **Register schemas:**

        ```mvn schema-registry:register```
    
    - **Schema Registry API curl**

        List subjects:
        ```curl -X GET http://localhost:8081/subjects```
    
        Get registered schemas for given Ids:
        ```curl -X GET http://localhost:8081/schemas/ids/1```

    - **Produce event to Kafka using curl (Windows Command Prompt):**

        ```cmd
        curl -X POST http://localhost:8080/v1/api/send 
        -H "Content-Type: application/json" 
        -d "{\"id\": \"12345\", \"name\": \"John Doe\", \"email\": \"john.doe@example.com\"}"
        ```
        **Output:**
        ```Message sent to Kafka topic: user-topic with key: 12345 and value: {"id": "12345", "name": "John Doe", "email": "john.doe@example.com"}
        Consumed message: {"id": "12345", "name": "John Doe", "email": "john.doe@example.com"}
        ```

## Usage

The application will produce and consume Avro-encoded messages to/from Kafka topics.
Avro schemas are managed via Schema Registry.

- **Kafka Confluent Control Center:**
    
    Confluent Control Center is a UI over the Kafka cluster, providing configuration, data and information on the brokers, topics and messages. It integrates with Schema Registry, enabling viewing of schemas.

- **Navigate to the Control Center:**

    ```http://localhost:9021```

- **Avro**

    Generate the source code for the events using the Avro schema: (optional - this happens as part of the `install`)
    
    ```mvn clean generate-sources```

## Docker clean up

```docker-compose down```

## Project Structure

- `src/main/java`: Spring Boot application source code
- `src/main/resources`: Configuration files
- `avro/`: Avro schema definitions

## References

- [Spring for Apache Kafka](https://spring.io/projects/spring-kafka)
- [Confluent Schema Registry](https://docs.confluent.io/platform/current/schema-registry/index.html)
- [Avro Documentation](https://avro.apache.org/docs/current/)

## License

This project is licensed under the MIT License.# integration-kafka-avro-registry

This project demonstrates integration of Apache Kafka as the message broker along with Confluent Schema Registry and Avro serialization using Spring Boot.

## Features

- Spring Boot based Kafka producer and consumer
- Avro serialization/deserialization
- Schema Registry integration for Avro schemas

## Prerequisites

- Java 17+
- Apache Kafka
- Confluent Schema Registry

## Getting Started

1. **Clone the repository**
    ```bash
    git clone https://github.com/your-repo/integration-kafka-avro-registry.git
    cd integration-kafka-avro-registry
    ```

2. **Configure Kafka and Schema Registry**
    - Update `application.yml` with your Kafka and Schema Registry endpoints.

3. **Build and Run**
    
    - **Run docker containers:** From root dir run the following to start dockerised    Kafka, Zookeeper, Schema Registry, and Control Center

        ```docker-compose up -d```
    
    - **Start demo spring boot application:**
        ```cd schema-registry-demo-service/
        ./mvnw spring-boot:run
        ```
    
    - **Register schemas:**

        ```mvn schema-registry:register```
    
    - **Schema Registry API curl**

        List subjects:
        ```curl -X GET http://localhost:8081/subjects```
    
        Get registered schemas for given Ids:
        ```curl -X GET http://localhost:8081/schemas/ids/1```

    - **Produce event to Kafka using curl (Windows Command Prompt):**

        ```cmd
        curl -X POST http://localhost:8080/v1/api/send 
        -H "Content-Type: application/json" 
        -d "{\"id\": \"12345\", \"name\": \"John Doe\", \"email\": \"john.doe@example.com\"}"
        ```
        **Output:**
        ```Message sent to Kafka topic: user-topic with key: 12345 and value: {"id": "12345", "name": "John Doe", "email": "john.doe@example.com"}
        Consumed message: {"id": "12345", "name": "John Doe", "email": "john.doe@example.com"}
        ```

## Usage

The application will produce and consume Avro-encoded messages to/from Kafka topics.
Avro schemas are managed via Schema Registry.

- **Kafka Confluent Control Center:**
    
    Confluent Control Center is a UI over the Kafka cluster, providing configuration, data and information on the brokers, topics and messages. It integrates with Schema Registry, enabling viewing of schemas.

- **Navigate to the Control Center:**

    ```http://localhost:9021```

- **Avro**

    Generate the source code for the events using the Avro schema: (optional - this happens as part of the `install`)
    
    ```mvn clean generate-sources```

## Docker clean up

```docker-compose down```

## Project Structure

- `src/main/java`: Spring Boot application source code
- `src/main/resources`: Configuration files
- `avro/`: Avro schema definitions

## References

- [Spring for Apache Kafka](https://spring.io/projects/spring-kafka)
- [Confluent Schema Registry](https://docs.confluent.io/platform/current/schema-registry/index.html)
- [Avro Documentation](https://avro.apache.org/docs/current/)

## License

This project is licensed under the MIT License.# integration-kafka-avro-registry

This project demonstrates integration of Apache Kafka as the message broker along with Confluent Schema Registry and Avro serialization using Spring Boot.

## Features

- Spring Boot based Kafka producer and consumer
- Avro serialization/deserialization
- Schema Registry integration for Avro schemas

## Prerequisites

- Java 17+
- Apache Kafka
- Confluent Schema Registry

## Getting Started

1. **Clone the repository**
    ```bash
    git clone https://github.com/your-repo/integration-kafka-avro-registry.git
    cd integration-kafka-avro-registry
    ```

2. **Configure Kafka and Schema Registry**
    - Update `application.yml` with your Kafka and Schema Registry endpoints.

3. **Build and Run**
    
    - **Run docker containers:** From root dir run the following to start dockerised    Kafka, Zookeeper, Schema Registry, and Control Center

        ```docker-compose up -d```
    
    - **Start demo spring boot application:**
        ```cd schema-registry-demo-service/
        ./mvnw spring-boot:run
        ```
    
    - **Register schemas:**

        ```mvn schema-registry:register```
    
    - **Schema Registry API curl**

        List subjects:
        ```curl -X GET http://localhost:8081/subjects```
    
        Get registered schemas for given Ids:
        ```curl -X GET http://localhost:8081/schemas/ids/1```

    - **Produce event to Kafka using curl (Windows Command Prompt):**

        ```cmd
        curl -X POST http://localhost:8080/v1/api/send 
        -H "Content-Type: application/json" 
        -d "{\"id\": \"12345\", \"name\": \"John Doe\", \"email\": \"john.doe@example.com\"}"
        ```
        **Output:**
        ```Message sent to Kafka topic: user-topic with key: 12345 and value: {"id": "12345", "name": "John Doe", "email": "john.doe@example.com"}
        Consumed message: {"id": "12345", "name": "John Doe", "email": "john.doe@example.com"}
        ```

## Usage

The application will produce and consume Avro-encoded messages to/from Kafka topics.
Avro schemas are managed via Schema Registry.

- **Kafka Confluent Control Center:**
    
    Confluent Control Center is a UI over the Kafka cluster, providing configuration, data and information on the brokers, topics and messages. It integrates with Schema Registry, enabling viewing of schemas.

- **Navigate to the Control Center:**

    ```http://localhost:9021```

- **Avro**

    Generate the source code for the events using the Avro schema: (optional - this happens as part of the `install`)
    
    ```mvn clean generate-sources```

## Docker clean up

```docker-compose down```

## Project Structure

- `src/main/java`: Spring Boot application source code
- `src/main/resources`: Configuration files
- `avro/`: Avro schema definitions

## References

- [Spring for Apache Kafka](https://spring.io/projects/spring-kafka)
- [Confluent Schema Registry](https://docs.confluent.io/platform/current/schema-registry/index.html)
- [Avro Documentation](https://avro.apache.org/docs/current/)

## License

This project is licensed under the MIT License.# integration-kafka-avro-registry

This project demonstrates integration of Apache Kafka as the message broker along with Confluent Schema Registry and Avro serialization using Spring Boot.

## Features

- Spring Boot based Kafka producer and consumer
- Avro serialization/deserialization
- Schema Registry integration for Avro schemas

## Prerequisites

- Java 17+
- Apache Kafka
- Confluent Schema Registry

## Getting Started

1. **Clone the repository**
    ```bash
    git clone https://github.com/your-repo/integration-kafka-avro-registry.git
    cd integration-kafka-avro-registry
    ```

2. **Configure Kafka and Schema Registry**
    - Update `application.yml` with your Kafka and Schema Registry endpoints.

3. **Build and Run**
    
    - **Run docker containers:** From root dir run the following to start dockerised    Kafka, Zookeeper, Schema Registry, and Control Center

        ```docker-compose up -d```
    
    - **Start demo spring boot application:**
        ```cd schema-registry-demo-service/
        ./mvnw spring-boot:run
        ```
    
    - **Register schemas:**

        ```mvn schema-registry:register```
    
    - **Schema Registry API curl**

        List subjects:
        ```curl -X GET http://localhost:8081/subjects```
    
        Get registered schemas for given Ids:
        ```curl -X GET http://localhost:8081/schemas/ids/1```

    - **Produce event to Kafka using curl (Windows Command Prompt):**

        ```cmd
        curl -X POST http://localhost:8080/v1/api/send 
        -H "Content-Type: application/json" 
        -d "{\"id\": \"12345\", \"name\": \"John Doe\", \"email\": \"john.doe@example.com\"}"
        ```
        **Output:**
        ```Message sent to Kafka topic: user-topic with key: 12345 and value: {"id": "12345", "name": "John Doe", "email": "john.doe@example.com"}
        Consumed message: {"id": "12345", "name": "John Doe", "email": "john.doe@example.com"}
        ```

## Usage

The application will produce and consume Avro-encoded messages to/from Kafka topics.
Avro schemas are managed via Schema Registry.

- **Kafka Confluent Control Center:**
    
    Confluent Control Center is a UI over the Kafka cluster, providing configuration, data and information on the brokers, topics and messages. It integrates with Schema Registry, enabling viewing of schemas.

- **Navigate to the Control Center:**

    ```http://localhost:9021```

- **Avro**

    Generate the source code for the events using the Avro schema: (optional - this happens as part of the `install`)
    
    ```mvn clean generate-sources```

## Docker clean up

```docker-compose down```

## Project Structure

- `src/main/java`: Spring Boot application source code
- `src/main/resources`: Configuration files
- `avro/`: Avro schema definitions

## References

- [Spring for Apache Kafka](https://spring.io/projects/spring-kafka)
- [Confluent Schema Registry](https://docs.confluent.io/platform/current/schema-registry/index.html)
- [Avro Documentation](https://avro.apache.org/docs/current/)

## License

This project is licensed under the MIT License.# integration-kafka-avro-registry

This project demonstrates integration of Apache Kafka as the message broker along with Confluent Schema Registry and Avro serialization using Spring Boot.

## Features

- Spring Boot based Kafka producer and consumer
- Avro serialization/deserialization
- Schema Registry integration for Avro schemas

## Prerequisites

- Java 17+
- Apache Kafka
- Confluent Schema Registry

## Getting Started

1. **Clone the repository**
    ```bash
    git clone https://github.com/your-repo/integration-kafka-avro-registry.git
    cd integration-kafka-avro-registry
    ```

2. **Configure Kafka and Schema Registry**
    - Update `application.yml` with your Kafka and Schema Registry endpoints.

3. **Build and Run**
    
    - **Run docker containers:** From root dir run the following to start dockerised    Kafka, Zookeeper, Schema Registry, and Control Center

        ```docker-compose up -d```
    
    - **Start demo spring boot application:**
        ```cd schema-registry-demo-service/
        ./mvnw spring-boot:run
        ```
    
    - **Register schemas:**

        ```mvn schema-registry:register```
    
    - **Schema Registry API curl**

        List subjects:
        ```curl -X GET http://localhost:8081/subjects```
    
        Get registered schemas for given Ids:
        ```curl -X GET http://localhost:8081/schemas/ids/1```

    - **Produce event to Kafka using curl (Windows Command Prompt):**

        ```cmd
        curl -X POST http://localhost:8080/v1/api/send 
        -H "Content-Type: application/json" 
        -d "{\"id\": \"12345\", \"name\": \"John Doe\", \"email\": \"john.doe@example.com\"}"
        ```
        **Output:**
        ```Message sent to Kafka topic: user-topic with key: 12345 and value: {"id": "12345", "name": "John Doe", "email": "john.doe@example.com"}
        Consumed message: {"id": "12345", "name": "John Doe", "email": "john.doe@example.com"}
        ```

## Usage

The application will produce and consume Avro-encoded messages to/from Kafka topics.
Avro schemas are managed via Schema Registry.

- **Kafka Confluent Control Center:**
    
    Confluent Control Center is a UI over the Kafka cluster, providing configuration, data and information on the brokers, topics and messages. It integrates with Schema Registry, enabling viewing of schemas.

- **Navigate to the Control Center:**

    ```http://localhost:9021```

- **Avro**

    Generate the source code for the events using the Avro schema: (optional - this happens as part of the `install`)
    
    ```mvn clean generate-sources```

## Docker clean up

```docker-compose down```

## Project Structure

- `src/main/java`: Spring Boot application source code
- `src/main/resources`: Configuration files
- `avro/`: Avro schema definitions

## References

- [Spring for Apache Kafka](https://spring.io/projects/spring-kafka)
- [Confluent Schema Registry](https://docs.confluent.io/platform/current/schema-registry/index.html)
- [Avro Documentation](https://avro.apache.org/docs/current/)

## License

This project is licensed under the MIT License.# integration-kafka-avro-registry

This project demonstrates integration of Apache Kafka as the message broker along with Confluent Schema Registry and Avro serialization using Spring Boot.

## Features

- Spring Boot based Kafka producer and consumer
- Avro serialization/deserialization
- Schema Registry integration for Avro schemas

## Prerequisites

- Java 17+
- Apache Kafka
- Confluent Schema Registry

## Getting Started

1. **Clone the repository**
    ```bash
    git clone https://github.com/your-repo/integration-kafka-avro-registry.git
    cd integration-kafka-avro-registry
    ```

2. **Configure Kafka and Schema Registry**
    - Update `application.yml` with your Kafka and Schema Registry endpoints.

3. **Build and Run**
    
    - **Run docker containers:** From root dir run the following to start dockerised    Kafka, Zookeeper, Schema Registry, and Control Center

        ```docker-compose up -d```
    
    - **Start demo spring boot application:**
        ```cd schema-registry-demo-service/
        ./mvnw spring-boot:run
        ```
    
    - **Register schemas:**

        ```mvn schema-registry:register```
    
    - **Schema Registry API curl**

        List subjects:
        ```curl -X GET http://localhost:8081/subjects```
    
        Get registered schemas for given Ids:
        ```curl -X GET http://localhost:8081/schemas/ids/1```

    - **Produce event to Kafka using curl (Windows Command Prompt):**

        ```cmd
        curl -X POST http://localhost:8080/v1/api/send 
        -H "Content-Type: application/json" 
        -d "{\"id\": \"12345\", \"name\": \"John Doe\", \"email\": \"john.doe@example.com\"}"
        ```
        **Output:**
        ```Message sent to Kafka topic: user-topic with key: 12345 and value: {"id": "12345", "name": "John Doe", "email": "john.doe@example.com"}
        Consumed message: {"id": "12345", "name": "John Doe", "email": "john.doe@example.com"}
        ```

## Usage

The application will produce and consume Avro-encoded messages to/from Kafka topics.
Avro schemas are managed via Schema Registry.

- **Kafka Confluent Control Center:**
    
    Confluent Control Center is a UI over the Kafka cluster, providing configuration, data and information on the brokers, topics and messages. It integrates with Schema Registry, enabling viewing of schemas.

- **Navigate to the Control Center:**

    ```http://localhost:9021```

- **Avro**

    Generate the source code for the events using the Avro schema: (optional - this happens as part of the `install`)
    
    ```mvn clean generate-sources```

## Docker clean up

```docker-compose down```

## Project Structure

- `src/main/java`: Spring Boot application source code
- `src/main/resources`: Configuration files
- `avro/`: Avro schema definitions

## References

- [Spring for Apache Kafka](https://spring.io/projects/spring-kafka)
- [Confluent Schema Registry](https://docs.confluent.io/platform/current/schema-registry/index.html)
- [Avro Documentation](https://avro.apache.org/docs/current/)

## License

This project is licensed under the MIT License.# integration-kafka-avro-registry

This project demonstrates integration of Apache Kafka as the message broker along with Confluent Schema Registry and Avro serialization using Spring Boot.

## Features

- Spring Boot based Kafka producer and consumer
- Avro serialization/deserialization
- Schema Registry integration for Avro schemas

## Prerequisites

- Java 17+
- Apache Kafka
- Confluent Schema Registry

## Getting Started

1. **Clone the repository**
    ```bash
    git clone https://github.com/your-repo/integration-kafka-avro-registry.git
    cd integration-kafka-avro-registry
    ```

2. **Configure Kafka and Schema Registry**
    - Update `application.yml` with your Kafka and Schema Registry endpoints.

3. **Build and Run**
    
    - **Run docker containers:** From root dir run the following to start dockerised    Kafka, Zookeeper, Schema Registry, and Control Center

        ```docker-compose up -d```
    
    - **Start demo spring boot application:**
        ```cd schema-registry-demo-service/
        ./mvnw spring-boot:run
        ```
    
    - **Register schemas:**

        ```mvn schema-registry:register```
    
    - **Schema Registry API curl**

        List subjects:
        ```curl -X GET http://localhost:8081/subjects```
    
        Get registered schemas for given Ids:
        ```curl -X GET http://localhost:8081/schemas/ids/1```

    - **Produce event to Kafka using curl (Windows Command Prompt):**

        ```cmd
        curl -X POST http://localhost:8080/v1/api/send 
        -H "Content-Type: application/json" 
        -d "{\"id\": \"12345\", \"name\": \"John Doe\", \"email\": \"john.doe@example.com\"}"
        ```
        **Output:**
        ```Message sent to Kafka topic: user-topic with key: 12345 and value: {"id": "12345", "name": "John Doe", "email": "john.doe@example.com"}
        Consumed message: {"id": "12345", "name": "John Doe", "email": "john.doe@example.com"}
        ```

## Usage

The application will produce and consume Avro-encoded messages to/from Kafka topics.
Avro schemas are managed via Schema Registry.

- **Kafka Confluent Control Center:**
    
    Confluent Control Center is a UI over the Kafka cluster, providing configuration, data and information on the brokers, topics and messages. It integrates with Schema Registry, enabling viewing of schemas.

- **Navigate to the Control Center:**

    ```http://localhost:9021```

- **Avro**

    Generate the source code for the events using the Avro schema: (optional - this happens as part of the `install`)
    
    ```mvn clean generate-sources```

## Docker clean up

```docker-compose down```

## Project Structure

- `src/main/java`: Spring Boot application source code
- `src/main/resources`: Configuration files
- `avro/`: Avro schema definitions

## References

- [Spring for Apache Kafka](https://spring.io/projects/spring-kafka)
- [Confluent Schema Registry](https://docs.confluent.io/platform/current/schema-registry/index.html)
- [Avro Documentation](https://avro.apache.org/docs/current/)

## License

This project is licensed under the MIT License.# integration-kafka-avro-registry

This project demonstrates integration of Apache Kafka as the message broker along with Confluent Schema Registry and Avro serialization using Spring Boot.

## Features

- Spring Boot based Kafka producer and consumer
- Avro serialization/deserialization
- Schema Registry integration for Avro schemas

## Prerequisites

- Java 17+
- Apache Kafka
- Confluent Schema Registry

## Getting Started

1. **Clone the repository**
    ```bash
    git clone https://github.com/your-repo/integration-kafka-avro-registry.git
    cd integration-kafka-avro-registry
    ```

2. **Configure Kafka and Schema Registry**
    - Update `application.yml` with your Kafka and Schema Registry endpoints.

3. **Build and Run**
    
    - **Run docker containers:** From root dir run the following to start dockerised    Kafka, Zookeeper, Schema Registry, and Control Center

        ```docker-compose up -d```
    
    - **Start demo spring boot application:**
        ```cd schema-registry-demo-service/
        ./mvnw spring-boot:run
        ```
    
    - **Register schemas:**

        ```mvn schema-registry:register```
    
    - **Schema Registry API curl**

        List subjects:
        ```curl -X GET http://localhost:8081/subjects```
    
        Get registered schemas for given Ids:
        ```curl -X GET http://localhost:8081/schemas/ids/1```

    - **Produce event to Kafka using curl (Windows Command Prompt):**

        ```cmd
        curl -X POST http://localhost:8080/v1/api/send 
        -H "Content-Type: application/json" 
        -d "{\"id\": \"12345\", \"name\": \"John Doe\", \"email\": \"john.doe@example.com\"}"
        ```
        **Output:**
        ```Message sent to Kafka topic: user-topic with key: 12345 and value: {"id": "12345", "name": "John Doe", "email": "john.doe@example.com"}
        Consumed message: {"id": "12345", "name": "John Doe", "email": "john.doe@example.com"}
        ```

## Usage

The application will produce and consume Avro-encoded messages to/from Kafka topics.
Avro schemas are managed via Schema Registry.

- **Kafka Confluent Control Center:**
    
    Confluent Control Center is a UI over the Kafka cluster, providing configuration, data and information on the brokers, topics and messages. It integrates with Schema Registry, enabling viewing of schemas.

- **Navigate to the Control Center:**

    ```http://localhost:9021```

- **Avro**

    Generate the source code for the events using the Avro schema: (optional - this happens as part of the `install`)
    
    ```mvn clean generate-sources```

## Docker clean up

```docker-compose down```

## Project Structure

- `src/main/java`: Spring Boot application source code
- `src/main/resources`: Configuration files
- `avro/`: Avro schema definitions

## References

- [Spring for Apache Kafka](https://spring.io/projects/spring-kafka)
- [Confluent Schema Registry](https://docs.confluent.io/platform/current/schema-registry/index.html)
- [Avro Documentation](https://avro.apache.org/docs/current/)

## License

This project is licensed under the MIT License.# integration-kafka-avro-registry

This project demonstrates integration of Apache Kafka as the message broker along with Confluent Schema Registry and Avro serialization using Spring Boot.

## Features

- Spring Boot based Kafka producer and consumer
- Avro serialization/deserialization
- Schema Registry integration for Avro schemas

## Prerequisites

- Java 17+
- Apache Kafka
- Confluent Schema Registry

## Getting Started

1. **Clone the repository**
    ```bash
    git clone https://github.com/your-repo/integration-kafka-avro-registry.git
    cd integration-kafka-avro-registry
    ```

2. **Configure Kafka and Schema Registry**
    - Update `application.yml` with your Kafka and Schema Registry endpoints.

3. **Build and Run**
    
    - **Run docker containers:** From root dir run the following to start dockerised    Kafka, Zookeeper, Schema Registry, and Control Center

        ```docker-compose up -d```
    
    - **Start demo spring boot application:**
        ```cd schema-registry-demo-service/
        ./mvnw spring-boot:run
        ```
    
    - **Register schemas:**

        ```mvn schema-registry:register```
    
    - **Schema Registry API curl**

        List subjects:
        ```curl -X GET http://localhost:8081/subjects```
    
        Get registered schemas for given Ids:
        ```curl -X GET http://localhost:8081/schemas/ids/1```

    - **Produce event to Kafka using curl (Windows Command Prompt):**

        ```cmd
        curl -X POST http://localhost:8080/v1/api/send 
        -H "Content-Type: application/json" 
        -d "{\"id\": \"12345\", \"name\": \"John Doe\", \"email\": \"john.doe@example.com\"}"
        ```
        **Output:**
        ```Message sent to Kafka topic: user-topic with key: 12345 and value: {"id": "12345", "name": "John Doe", "email": "john.doe@example.com"}
        Consumed message: {"id": "12345", "name": "John Doe", "email": "john.doe@example.com"}
        ```

## Usage

The application will produce and consume Avro-encoded messages to/from Kafka topics.
Avro schemas are managed via Schema Registry.

- **Kafka Confluent Control Center:**
    
    Confluent Control Center is a UI over the Kafka cluster, providing configuration, data and information on the brokers, topics and messages. It integrates with Schema Registry, enabling viewing of schemas.

- **Navigate to the Control Center:**

    ```http://localhost:9021```

- **Avro**

    Generate the source code for the events using the Avro schema: (optional - this happens as part of the `install`)
    
    ```mvn clean generate-sources```

## Docker clean up

```docker-compose down```

## Project Structure

- `src/main/java`: Spring Boot application source code
- `src/main/resources`: Configuration files
- `avro/`: Avro schema definitions

## References

- [Spring for Apache Kafka](https://spring.io/projects/spring-kafka)
- [Confluent Schema Registry](https://docs.confluent.io/platform/current/schema-registry/index.html)
- [Avro Documentation](https://avro.apache.org/docs/current/)

## License

This project is licensed under the MIT License.# integration-kafka-avro-registry

This project demonstrates integration of Apache Kafka as the message broker along with Confluent Schema Registry and Avro serialization using Spring Boot.

## Features

- Spring Boot based Kafka producer and consumer
- Avro serialization/deserialization
- Schema Registry integration for Avro schemas

## Prerequisites

- Java 17+
- Apache Kafka
- Confluent Schema Registry

## Getting Started

1. **Clone the repository**
    ```bash
    git clone https://github.com/your-repo/integration-kafka-avro-registry.git
    cd integration-kafka-avro-registry
    ```

2. **Configure Kafka and Schema Registry**
    - Update `application.yml` with your Kafka and Schema Registry endpoints.

3. **Build and Run**
    
    - **Run docker containers:** From root dir run the following to start dockerised    Kafka, Zookeeper, Schema Registry, and Control Center

        ```docker-compose up -d```
    
    - **Start demo spring boot application:**
        ```cd schema-registry-demo-service/
        ./mvnw spring-boot:run
        ```
    
    - **Register schemas:**

        ```mvn schema-registry:register```
    
    - **Schema Registry API curl**

        List subjects:
        ```curl -X GET http://localhost:8081/subjects```
    
        Get registered schemas for given Ids:
        ```curl -X GET http://localhost:8081/schemas/ids/1```

    - **Produce event to Kafka using curl (Windows Command Prompt):**

        ```cmd
        curl -X POST http://localhost:8080/v1/api/send 
        -H "Content-Type: application/json" 
        -d "{\"id\": \"12345\", \"name\": \"John Doe\", \"email\": \"john.doe@example.com\"}"
        ```
        **Output:**
        ```Message sent to Kafka topic: user-topic with key: 12345 and value: {"id": "12345", "name": "John Doe", "email": "john.doe@example.com"}
        Consumed message: {"id": "12345", "name": "John Doe", "email": "john.doe@example.com"}
        ```

## Usage

The application will produce and consume Avro-encoded messages to/from Kafka topics.
Avro schemas are managed via Schema Registry.

- **Kafka Confluent Control Center:**
    
    Confluent Control Center is a UI over the Kafka cluster, providing configuration, data and information on the brokers, topics and messages. It integrates with Schema Registry, enabling viewing of schemas.

- **Navigate to the Control Center:**

    ```http://localhost:9021```

- **Avro**

    Generate the source code for the events using the Avro schema: (optional - this happens as part of the `install`)
    
    ```mvn clean generate-sources```

## Docker clean up

```docker-compose down```

## Project Structure

- `src/main/java`: Spring Boot application source code
- `src/main/resources`: Configuration files
- `avro/`: Avro schema definitions

## References

- [Spring for Apache Kafka](https://spring.io/projects/spring-kafka)
- [Confluent Schema Registry](https://docs.confluent.io/platform/current/schema-registry/index.html)
- [Avro Documentation](https://avro.apache.org/docs/current/)

## License

This project is licensed under the MIT License.# integration-kafka-avro-registry

This project demonstrates integration of Apache Kafka as the message broker along with Confluent Schema Registry and Avro serialization using Spring Boot.

## Features

- Spring Boot based Kafka producer and consumer
- Avro serialization/deserialization
- Schema Registry integration for Avro schemas

## Prerequisites

- Java 17+
- Apache Kafka
- Confluent Schema Registry

## Getting Started

1. **Clone the repository**
    ```bash
    git clone https://github.com/your-repo/integration-kafka-avro-registry.git
    cd integration-kafka-avro-registry
    ```

2. **Configure Kafka and Schema Registry**
    - Update `application.yml` with your Kafka and Schema Registry endpoints.

3. **Build and Run**
    
    - **Run docker containers:** From root dir run the following to start dockerised    Kafka, Zookeeper, Schema Registry, and Control Center

        ```docker-compose up -d```
    
    - **Start demo spring boot application:**
        ```cd schema-registry-demo-service/
        ./mvnw spring-boot:run
        ```
    
    - **Register schemas:**

        ```mvn schema-registry:register```
    
    - **Schema Registry API curl**

        List subjects:
        ```curl -X GET http://localhost:8081/subjects```
    
        Get registered schemas for given Ids:
        ```curl -X GET http://localhost:8081/schemas/ids/1```

    - **Produce event to Kafka using curl (Windows Command Prompt):**

        ```cmd
        curl -X POST http://localhost:8080/v1/api/send 
        -H "Content-Type: application/json" 
        -d "{\"id\": \"12345\", \"name\": \"John Doe\", \"email\": \"john.doe@example.com\"}"
        ```
        **Output:**
        ```Message sent to Kafka topic: user-topic with key: 12345 and value: {"id": "12345", "name": "John Doe", "email": "john.doe@example.com"}
        Consumed message: {"id": "12345", "name": "John Doe", "email": "john.doe@example.com"}
        ```

## Usage

The application will produce and consume Avro-encoded messages to/from Kafka topics.
Avro schemas are managed via Schema Registry.

- **Kafka Confluent Control Center:**
    
    Confluent Control Center is a UI over the Kafka cluster, providing configuration, data and information on the brokers, topics and messages. It integrates with Schema Registry, enabling viewing of schemas.

- **Navigate to the Control Center:**

    ```http://localhost:9021```

- **Avro**

    Generate the source code for the events using the Avro schema: (optional - this happens as part of the `install`)
    
    ```mvn clean generate-sources```

## Docker clean up

```docker-compose down```

## Project Structure

- `src/main/java`: Spring Boot application source code
- `src/main/resources`: Configuration files
- `avro/`: Avro schema definitions

## References

- [Spring for Apache Kafka](https://spring.io/projects/spring-kafka)
- [Confluent Schema Registry](https://docs.confluent.io/platform/current/schema-registry/index.html)
- [Avro Documentation](https://avro.apache.org/docs/current/)

## License

This project is licensed under the MIT License.# integration-kafka-avro-registry

This project demonstrates integration of Apache Kafka as the message broker along with Confluent Schema Registry and Avro serialization using Spring Boot.

## Features

- Spring Boot based Kafka producer and consumer
- Avro serialization/deserialization
- Schema Registry integration for Avro schemas

## Prerequisites

- Java 17+
- Apache Kafka
- Confluent Schema Registry

## Getting Started

1. **Clone the repository**
    ```bash
    git clone https://github.com/your-repo/integration-kafka-avro-registry.git
    cd integration-kafka-avro-registry
    ```

2. **Configure Kafka and Schema Registry**
    - Update `application.yml` with your Kafka and Schema Registry endpoints.

3. **Build and Run**
    
    - **Run docker containers:** From root dir run the following to start dockerised    Kafka, Zookeeper, Schema Registry, and Control Center

        ```docker-compose up -d```
    
    - **Start demo spring boot application:**
        ```cd schema-registry-demo-service/
        ./mvnw spring-boot:run
        ```
    
    - **Register schemas:**

        ```mvn schema-registry:register```
    
    - **Schema Registry API curl**

        List subjects:
        ```curl -X GET http://localhost:8081/subjects```
    
        Get registered schemas for given Ids:
        ```curl -X GET http://localhost:8081/schemas/ids/1```

    - **Produce event to Kafka using curl (Windows Command Prompt):**

        ```cmd
        curl -X POST http://localhost:8080/v1/api/send 
        -H "Content-Type: application/json" 
        -d "{\"id\": \"12345\", \"name\": \"John Doe\", \"email\": \"john.doe@example.com\"}"
        ```
        **Output:**
        ```Message sent to Kafka topic: user-topic with key: 12345 and value: {"id": "12345", "name": "John Doe", "email": "john.doe@example.com"}
        Consumed message: {"id": "12345", "name": "John Doe", "email": "john.doe@example.com"}
        ```

## Usage

The application will produce and consume Avro-encoded messages to/from Kafka topics.
Avro schemas are managed via Schema Registry.

- **Kafka Confluent Control Center:**
    
    Confluent Control Center is a UI over the Kafka cluster, providing configuration, data and information on the brokers, topics and messages. It integrates with Schema Registry, enabling viewing of schemas.

- **Navigate to the Control Center:**

    ```http://localhost:9021```

- **Avro**

    Generate the source code for the events using the Avro schema: (optional - this happens as part of the `install`)
    
    ```mvn clean generate-sources```

## Docker clean up

```docker-compose down```

## Project Structure

- `src/main/java`: Spring Boot application source code
- `src/main/resources`: Configuration files
- `avro/`: Avro schema definitions

## References

- [Spring for Apache Kafka](https://spring.io/projects/spring-kafka)
- [Confluent Schema Registry](https://docs.confluent.io/platform/current/schema-registry/index.html)
- [Avro Documentation](https://avro.apache.org/docs/current/)

## License

This project is licensed under the MIT License.# integration-kafka-avro-registry

This project demonstrates integration of Apache Kafka as the message broker along with Confluent Schema Registry and Avro serialization using Spring Boot.

## Features

- Spring Boot based Kafka producer and consumer
- Avro serialization/deserialization
- Schema Registry integration for Avro schemas

## Prerequisites

- Java 17+
- Apache Kafka
- Confluent Schema Registry

## Getting Started

1. **Clone the repository**
    ```bash
    git clone https://github.com/your-repo/integration-kafka-avro-registry.git
    cd integration-kafka-avro-registry
    ```

2. **Configure Kafka and Schema Registry**
    - Update `application.yml` with your Kafka and Schema Registry endpoints.

3. **Build and Run**
    
    - **Run docker containers:** From root dir run the following to start dockerised    Kafka, Zookeeper, Schema Registry, and Control Center

        ```docker-compose up -d```
    
    - **Start demo spring boot application:**
        ```cd schema-registry-demo-service/
        ./mvnw spring-boot:run
        ```
    
    - **Register schemas:**

        ```mvn schema-registry:register```
    
    - **Schema Registry API curl**

        List subjects:
        ```curl -X GET http://localhost:8081/subjects```
    
        Get registered schemas for given Ids:
        ```curl -X GET http://localhost:8081/schemas/ids/1```

    - **Produce event to Kafka using curl (Windows Command Prompt):**

        ```cmd
        curl -X POST http://localhost:8080/v1/api/send 
        -H "Content-Type: application/json" 
        -d "{\"id\": \"12345\", \"name\": \"John Doe\", \"email\": \"john.doe@example.com\"}"
        ```
        **Output:**
        ```Message sent to Kafka topic: user-topic with key: 12345 and value: {"id": "12345", "name": "John Doe", "email": "john.doe@example.com"}
        Consumed message: {"id": "12345", "name": "John Doe", "email": "john.doe@example.com"}
        ```

## Usage

The application will produce and consume Avro-encoded messages to/from Kafka topics.
Avro schemas are managed via Schema Registry.

- **Kafka Confluent Control Center:**
    
    Confluent Control Center is a UI over the Kafka cluster, providing configuration, data and information on the brokers, topics and messages. It integrates with Schema Registry, enabling viewing of schemas.

- **Navigate to the Control Center:**

    ```http://localhost:9021```

- **Avro**

    Generate the source code for the events using the Avro schema: (optional - this happens as part of the `install`)
    
    ```mvn clean generate-sources```

## Docker clean up

```docker-compose down```

## Project Structure

- `src/main/java`: Spring Boot application source code
- `src/main/resources`: Configuration files
- `avro/`: Avro schema definitions

## References

- [Spring for Apache Kafka](https://spring.io/projects/spring-kafka)
- [Confluent Schema Registry](https://docs.confluent.io/platform/current/schema-registry/index.html)
- [Avro Documentation](https://avro.apache.org/docs/current/)

## License

This project is licensed under the MIT License.# integration-kafka-avro-registry

This project demonstrates integration of Apache Kafka as the message broker along with Confluent Schema Registry and Avro serialization using Spring Boot.

## Features

- Spring Boot based Kafka producer and consumer
- Avro serialization/deserialization
- Schema Registry integration for Avro schemas

## Prerequisites

- Java 17+
- Apache Kafka
- Confluent Schema Registry

## Getting Started

1. **Clone the repository**
    ```bash
    git clone https://github.com/your-repo/integration-kafka-avro-registry.git
    cd integration-kafka-avro-registry
    ```

2. **Configure Kafka and Schema Registry**
    - Update `application.yml` with your Kafka and Schema Registry endpoints.

3. **Build and Run**
    
    - **Run docker containers:** From root dir run the following to start dockerised    Kafka, Zookeeper, Schema Registry, and Control Center

        ```docker-compose up -d```
    
    - **Start demo spring boot application:**
        ```cd schema-registry-demo-service/
        ./mvnw spring-boot:run
        ```
    
    - **Register schemas:**

        ```mvn schema-registry:register```
    
    - **Schema Registry API curl**

        List subjects:
        ```curl -X GET http://localhost:8081/subjects```
    
        Get registered schemas for given Ids:
        ```curl -X GET http://localhost:8081/schemas/ids/1```

    - **Produce event to Kafka using curl (Windows Command Prompt):**

        ```cmd
        curl -X POST http://localhost:8080/v1/api/send 
        -H "Content-Type: application/json" 
        -d "{\"id\": \"12345\", \"name\": \"John Doe\", \"email\": \"john.doe@example.com\"}"
        ```
        **Output:**
        ```Message sent to Kafka topic: user-topic with key: 12345 and value: {"id": "12345", "name": "John Doe", "email": "john.doe@example.com"}
        Consumed message: {"id": "12345", "name": "John Doe", "email": "john.doe@example.com"}
        ```

## Usage

The application will produce and consume Avro-encoded messages to/from Kafka topics.
Avro schemas are managed via Schema Registry.

- **Kafka Confluent Control Center:**
    
    Confluent Control Center is a UI over the Kafka cluster, providing configuration, data and information on the brokers, topics and messages. It integrates with Schema Registry, enabling viewing of schemas.

- **Navigate to the Control Center:**

    ```http://localhost:9021```

- **Avro**

    Generate the source code for the events using the Avro schema: (optional - this happens as part of the `install`)
    
    ```mvn clean generate-sources```

## Docker clean up

```docker-compose down```

## Project Structure

- `src/main/java`: Spring Boot application source code
- `src/main/resources`: Configuration files
- `avro/`: Avro schema definitions

## References

- [Spring for Apache Kafka](https://spring.io/projects/spring-kafka)
- [Confluent Schema Registry](https://docs.confluent.io/platform/current/schema-registry/index.html)
- [Avro Documentation](https://avro.apache.org/docs/current/)

## License

This project is licensed under the MIT License.# integration-kafka-avro-registry

This project demonstrates integration of Apache Kafka as the message broker along with Confluent Schema Registry and Avro serialization using Spring Boot.

## Features

- Spring Boot based Kafka producer and consumer
- Avro serialization/deserialization
- Schema Registry integration for Avro schemas

## Prerequisites

- Java 17+
- Apache Kafka
- Confluent Schema Registry

## Getting Started

1. **Clone the repository**
    ```bash
    git clone https://github.com/your-repo/integration-kafka-avro-registry.git
    cd integration-kafka-avro-registry
    ```

2. **Configure Kafka and Schema Registry**
    - Update `application.yml` with your Kafka and Schema Registry endpoints.

3. **Build and Run**
    
    - **Run docker containers:** From root dir run the following to start dockerised    Kafka, Zookeeper, Schema Registry, and Control Center

        ```docker-compose up -d```
    
    - **Start demo spring boot application:**
        ```cd schema-registry-demo-service/
        ./mvnw spring-boot:run
        ```
    
    - **Register schemas:**

        ```mvn schema-registry:register```
    
    - **Schema Registry API curl**

        List subjects:
        ```curl -X GET http://localhost:8081/subjects```
    
        Get registered schemas for given Ids:
        ```curl -X GET http://localhost:8081/schemas/ids/1```

    - **Produce event to Kafka using curl (Windows Command Prompt):**

        ```cmd
        curl -X POST http://localhost:8080/v1/api/send 
        -H "Content-Type: application/json" 
        -d "{\"id\": \"12345\", \"name\": \"John Doe\", \"email\": \"john.doe@example.com\"}"
        ```
        **Output:**
        ```Message sent to Kafka topic: user-topic with key: 12345 and value: {"id": "12345", "name": "John Doe", "email": "john.doe@example.com"}
        Consumed message: {"id": "12345", "name": "John Doe", "email": "john.doe@example.com"}
        ```

## Usage

The application will produce and consume Avro-encoded messages to/from Kafka topics.
Avro schemas are managed via Schema Registry.

- **Kafka Confluent Control Center:**
    
    Confluent Control Center is a UI over the Kafka cluster, providing configuration, data and information on the brokers, topics and messages. It integrates with Schema Registry, enabling viewing of schemas.

- **Navigate to the Control Center:**

    ```http://localhost:9021```

- **Avro**

    Generate the source code for the events using the Avro schema: (optional - this happens as part of the `install`)
    
    ```mvn clean generate-sources```

## Docker clean up

```docker-compose down```

## Project Structure

- `src/main/java`: Spring Boot application source code
- `src/main/resources`: Configuration files
- `avro/`: Avro schema definitions

## References

- [Spring for Apache Kafka](https://spring.io/projects/spring-kafka)
- [Confluent Schema Registry](https://docs.confluent.io/platform/current/schema-registry/index.html)
- [Avro Documentation](https://avro.apache.org/docs/current/)

## License

This project is licensed under the MIT License.# integration-kafka-avro-registry

This project demonstrates integration of Apache Kafka as the message broker along with Confluent Schema Registry and Avro serialization using Spring Boot.

## Features

- Spring Boot based Kafka producer and consumer
- Avro serialization/deserialization
- Schema Registry integration for Avro schemas

## Prerequisites

- Java 17+
- Apache Kafka
- Confluent Schema Registry

## Getting Started

1. **Clone the repository**
    ```bash
    git clone https://github.com/your-repo/integration-kafka-avro-registry.git
    cd integration-kafka-avro-registry
    ```

2. **Configure Kafka and Schema Registry**
    - Update `application.yml` with your Kafka and Schema Registry endpoints.

3. **Build and Run**
    
    - **Run docker containers:** From root dir run the following to start dockerised    Kafka, Zookeeper, Schema Registry, and Control Center

        ```docker-compose up -d```
    
    - **Start demo spring boot application:**
        ```cd schema-registry-demo-service/
        ./mvnw spring-boot:run
        ```
    
    - **Register schemas:**

        ```mvn schema-registry:register```
    
    - **Schema Registry API curl**

        List subjects:
        ```curl -X GET http://localhost:8081/subjects```
    
        Get registered schemas for given Ids:
        ```curl -X GET http://localhost:8081/schemas/ids/1```

    - **Produce event to Kafka using curl (Windows Command Prompt):**

        ```cmd
        curl -X POST http://localhost:8080/v1/api/send 
        -H "Content-Type: application/json" 
        -d "{\"id\": \"12345\", \"name\": \"John Doe\", \"email\": \"john.doe@example.com\"}"
        ```
        **Output:**
        ```Message sent to Kafka topic: user-topic with key: 12345 and value: {"id": "12345", "name": "John Doe", "email": "john.doe@example.com"}
        Consumed message: {"id": "12345", "name": "John Doe", "email": "john.doe@example.com"}
        ```

## Usage

The application will produce and consume Avro-encoded messages to/from Kafka topics.
Avro schemas are managed via Schema Registry.

- **Kafka Confluent Control Center:**
    
    Confluent Control Center is a UI over the Kafka cluster, providing configuration, data and information on the brokers, topics and messages. It integrates with Schema Registry, enabling viewing of schemas.

- **Navigate to the Control Center:**

    ```http://localhost:9021```

- **Avro**

    Generate the source code for the events using the Avro schema: (optional - this happens as part of the `install`)
    
    ```mvn clean generate-sources```

## Docker clean up

```docker-compose down```

## Project Structure

- `src/main/java`: Spring Boot application source code
- `src/main/resources`: Configuration files
- `avro/`: Avro schema definitions

## References

- [Spring for Apache Kafka](https://spring.io/projects/spring-kafka)
- [Confluent Schema Registry](https://docs.confluent.io/platform/current/schema-registry/index.html)
- [Avro Documentation](https://avro.apache.org/docs/current/)

## License

This project is licensed under the MIT License.# integration-kafka-avro-registry

This project demonstrates integration of Apache Kafka as the message broker along with Confluent Schema Registry and Avro serialization using Spring Boot.

## Features

- Spring Boot based Kafka producer and consumer
- Avro serialization/deserialization
- Schema Registry integration for Avro schemas

## Prerequisites

- Java 17+
- Apache Kafka
- Confluent Schema Registry

## Getting Started

1. **Clone the repository**
    ```bash
    git clone https://github.com/your-repo/integration-kafka-avro-registry.git
    cd integration-kafka-avro-registry
    ```

2. **Configure Kafka and Schema Registry**
    - Update `application.yml` with your Kafka and Schema Registry endpoints.

3. **Build and Run**
    
    - **Run docker containers:** From root dir run the following to start dockerised    Kafka, Zookeeper, Schema Registry, and Control Center

        ```docker-compose up -d```
    
    - **Start demo spring boot application:**
        ```cd schema-registry-demo-service/
        ./mvnw spring-boot:run
        ```
    
    - **Register schemas:**

        ```mvn schema-registry:register```
    
    - **Schema Registry API curl**

        List subjects:
        ```curl -X GET http://localhost:8081/subjects```
    
        Get registered schemas for given Ids:
        ```curl -X GET http://localhost:8081/schemas/ids/1```

    - **Produce event to Kafka using curl (Windows Command Prompt):**

        ```cmd
        curl -X POST http://localhost:8080/v1/api/send 
        -H "Content-Type: application/json" 
        -d "{\"id\": \"12345\", \"name\": \"John Doe\", \"email\": \"john.doe@example.com\"}"
        ```
        **Output:**
        ```Message sent to Kafka topic: user-topic with key: 12345 and value: {"id": "12345", "name": "John Doe", "email": "john.doe@example.com"}
        Consumed message: {"id": "12345", "name": "John Doe", "email": "john.doe@example.com"}
        ```

## Usage

The application will produce and consume Avro-encoded messages to/from Kafka topics.
Avro schemas are managed via Schema Registry.

- **Kafka Confluent Control Center:**
    
    Confluent Control Center is a UI over the Kafka cluster, providing configuration, data and information on the brokers, topics and messages. It integrates with Schema Registry, enabling viewing of schemas.

- **Navigate to the Control Center:**

    ```http://localhost:9021```

- **Avro**

    Generate the source code for the events using the Avro schema: (optional - this happens as part of the `install`)
    
    ```mvn clean generate-sources```

## Docker clean up

```docker-compose down```

## Project Structure

- `src/main/java`: Spring Boot application source code
- `src/main/resources`: Configuration files
- `avro/`: Avro schema definitions

## References

- [Spring for Apache Kafka](https://spring.io/projects/spring-kafka)
- [Confluent Schema Registry](https://docs.confluent.io/platform/current/schema-registry/index.html)
- [Avro Documentation](https://avro.apache.org/docs/current/)

## License

This project is licensed under the MIT License.# integration-kafka-avro-registry

This project demonstrates integration of Apache Kafka as the message broker along with Confluent Schema Registry and Avro serialization using Spring Boot.

## Features

- Spring Boot based Kafka producer and consumer
- Avro serialization/deserialization
- Schema Registry integration for Avro schemas

## Prerequisites

- Java 17+
- Apache Kafka
- Confluent Schema Registry

## Getting Started

1. **Clone the repository**
    ```bash
    git clone https://github.com/your-repo/integration-kafka-avro-registry.git
    cd integration-kafka-avro-registry
    ```

2. **Configure Kafka and Schema Registry**
    - Update `application.yml` with your Kafka and Schema Registry endpoints.

3. **Build and Run**
    
    - **Run docker containers:** From root dir run the following to start dockerised    Kafka, Zookeeper, Schema Registry, and Control Center

        ```docker-compose up -d```
    
    - **Start demo spring boot application:**
        ```cd schema-registry-demo-service/
        ./mvnw spring-boot:run
        ```
    
    - **Register schemas:**

        ```mvn schema-registry:register```
    
    - **Schema Registry API curl**

        List subjects:
        ```curl -X GET http://localhost:8081/subjects```
    
        Get registered schemas for given Ids:
        ```curl -X GET http://localhost:8081/schemas/ids/1```

    - **Produce event to Kafka using curl (Windows Command Prompt):**

        ```cmd
        curl -X POST http://localhost:8080/v1/api/send 
        -H "Content-Type: application/json" 
        -d "{\"id\": \"12345\", \"name\": \"John Doe\", \"email\": \"john.doe@example.com\"}"
        ```
        **Output:**
        ```Message sent to Kafka topic: user-topic with key: 12345 and value: {"id": "12345", "name": "John Doe", "email": "john.doe@example.com"}
        Consumed message: {"id": "12345", "name": "John Doe", "email": "john.doe@example.com"}
        ```

## Usage

The application will produce and consume Avro-encoded messages to/from Kafka topics.
Avro schemas are managed via Schema Registry.

- **Kafka Confluent Control Center:**
    
    Confluent Control Center is a UI over the Kafka cluster, providing configuration, data and information on the brokers, topics and messages. It integrates with Schema Registry, enabling viewing of schemas.

- **Navigate to the Control Center:**

    ```http://localhost:9021```

- **Avro**

    Generate the source code for the events using the Avro schema: (optional - this happens as part of the `install`)
    
    ```mvn clean generate-sources```

## Docker clean up

```docker-compose down```

## Project Structure

- `src/main/java`: Spring Boot application source code
- `src/main/resources`: Configuration files
- `avro/`: Avro schema definitions

## References

- [Spring for Apache Kafka](https://spring.io/projects/spring-kafka)
- [Confluent Schema Registry](https://docs.confluent.io/platform/current/schema-registry/index.html)
- [Avro Documentation](https://avro.apache.org/docs/current/)

## License

This project is licensed under the MIT License.# integration-kafka-avro-registry

This project demonstrates integration of Apache Kafka as the message broker along with Confluent Schema Registry and Avro serialization using Spring Boot.

## Features

- Spring Boot based Kafka producer and consumer
- Avro serialization/deserialization
- Schema Registry integration for Avro schemas

## Prerequisites

- Java 17+
- Apache Kafka
- Confluent Schema Registry

## Getting Started

1. **Clone the repository**
    ```bash
    git clone https://github.com/your-repo/integration-kafka-avro-registry.git
    cd integration-kafka-avro-registry
    ```

2. **Configure Kafka and Schema Registry**
    - Update `application.yml` with your Kafka and Schema Registry endpoints.

3. **Build and Run**
    
    - **Run docker containers:** From root dir run the following to start dockerised    Kafka, Zookeeper, Schema Registry, and Control Center

        ```docker-compose up -d```
    
    - **Start demo spring boot application:**
        ```cd schema-registry-demo-service/
        ./mvnw spring-boot:run
        ```
    
    - **Register schemas:**

        ```mvn schema-registry:register```
    
    - **Schema Registry API curl**

        List subjects:
        ```curl -X GET http://localhost:8081/subjects```
    
        Get registered schemas for given Ids:
        ```curl -X GET http://localhost:8081/schemas/ids/1```

    - **Produce event to Kafka using curl (Windows Command Prompt):**

        ```cmd
        curl -X POST http://localhost:8080/v1/api/send 
        -H "Content-Type: application/json" 
        -d "{\"id\": \"12345\", \"name\": \"John Doe\", \"email\": \"john.doe@example.com\"}"
        ```
        **Output:**
        ```Message sent to Kafka topic: user-topic with key: 12345 and value: {"id": "12345", "name": "John Doe", "email": "john.doe@example.com"}
        Consumed message: {"id": "12345", "name": "John Doe", "email": "john.doe@example.com"}
        ```

## Usage

The application will produce and consume Avro-encoded messages to/from Kafka topics.
Avro schemas are managed via Schema Registry.

- **Kafka Confluent Control Center:**
    
    Confluent Control Center is a UI over the Kafka cluster, providing configuration, data and information on the brokers, topics and messages. It integrates with Schema Registry, enabling viewing of schemas.

- **Navigate to the Control Center:**

    ```http://localhost:9021```

- **Avro**

    Generate the source code for the events using the Avro schema: (optional - this happens as part of the `install`)
    
    ```mvn clean generate-sources```

## Docker clean up

```docker-compose down```

## Project Structure

- `src/main/java`: Spring Boot application source code
- `src/main/resources`: Configuration files
- `avro/`: Avro schema definitions

## References

- [Spring for Apache Kafka](https://spring.io/projects/spring-kafka)
- [Confluent Schema Registry](https://docs.confluent.io/platform/current/schema-registry/index.html)
- [Avro Documentation](https://avro.apache.org/docs/current/)

## License

This project is licensed under the MIT License.# integration-kafka-avro-registry

This project demonstrates integration of Apache Kafka as the message broker along with Confluent Schema Registry and Avro serialization using Spring Boot.

## Features

- Spring Boot based Kafka producer and consumer
- Avro serialization/deserialization
- Schema Registry integration for Avro schemas

## Prerequisites

- Java 17+
- Apache Kafka
- Confluent Schema Registry

## Getting Started

1. **Clone the repository**
    ```bash
    git clone https://github.com/your-repo/integration-kafka-avro-registry.git
    cd integration-kafka-avro-registry
    ```

2. **Configure Kafka and Schema Registry**
    - Update `application.yml` with your Kafka and Schema Registry endpoints.

3. **Build and Run**
    
    - **Run docker containers:** From root dir run the following to start dockerised    Kafka, Zookeeper, Schema Registry, and Control Center

        ```docker-compose up -d```
    
    - **Start demo spring boot application:**
        ```cd schema-registry-demo-service/
        ./mvnw spring-boot:run
        ```
    
    - **Register schemas:**

        ```mvn schema-registry:register```
    
    - **Schema Registry API curl**

        List subjects:
        ```curl -X GET http://localhost:8081/subjects```
    
        Get registered schemas for given Ids:
        ```curl -X GET http://localhost:8081/schemas/ids/1```

    - **Produce event to Kafka using curl (Windows Command Prompt):**

        ```cmd
        curl -X POST http://localhost:8080/v1/api/send 
        -H "Content-Type: application/json" 
        -d "{\"id\": \"12345\", \"name\": \"John Doe\", \"email\": \"john.doe@example.com\"}"
        ```
        **Output:**
        ```Message sent to Kafka topic: user-topic with key: 12345 and value: {"id": "12345", "name": "John Doe", "email": "john.doe@example.com"}
        Consumed message: {"id": "12345", "name": "John Doe", "email": "john.doe@example.com"}
        ```

## Usage

The application will produce and consume Avro-encoded messages to/from Kafka topics.
Avro schemas are managed via Schema Registry.

- **Kafka Confluent Control Center:**
    
    Confluent Control Center is a UI over the Kafka cluster, providing configuration, data and information on the brokers, topics and messages. It integrates with Schema Registry, enabling viewing of schemas.

- **Navigate to the Control Center:**

    ```http://localhost:9021```

- **Avro**

    Generate the source code for the events using the Avro schema: (optional - this happens as part of the `install`)
    
    ```mvn clean generate-sources```

## Docker clean up

```docker-compose down```

## Project Structure

- `src/main/java`: Spring Boot application source code
- `src/main/resources`: Configuration files
- `avro/`: Avro schema definitions

## References

- [Spring for Apache Kafka](https://spring.io/projects/spring-kafka)
- [Confluent Schema Registry](https://docs.confluent.io/platform/current/schema-registry/index.html)
- [Avro Documentation](https://avro.apache.org/docs/current/)

## License

This project is licensed under the MIT License.

```docker-compose down```

## Project Structure

- `src/main/java`: Spring Boot application source code
- `src/main/resources`: Configuration files
- `avro/`: Avro schema definitions

## References

- [Spring for Apache Kafka](https://spring.io/projects/spring-kafka)
- [Confluent Schema Registry](https://docs.confluent.io/platform/current/schema-registry/index.html)
- [Avro Documentation](https://avro.apache.org/docs/current/)

## License

This project is licensed under the MIT License.