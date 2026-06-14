# REST_GRPC_GraphQL API Suite

This project demonstrates a multi-protocol microservices architecture using **Spring Boot**, implementing **REST**, **gRPC**, and **GraphQL** to handle order processing.

---

## 🏗️ Project Structure
- `graphql-order-service`: GraphQL server (port 8080).
- `grpc-order-service`: gRPC server (port 9090).
- `graphql-client`: GraphQL client.
- `grpc-client`: gRPC client.

---

##  Getting Started

### Prerequisites
- **Java 17+**
- **Maven 3.8+**

### 1. Build the Project
Navigate to the root directory and build all modules to generate the necessary gRPC stubs and project artifacts:
```bash
mvn clean install
```



### 2. Start the Servers
You must start the servers before the clients. Open separate terminals for each:

A. Start the GraphQL Server:

```bash
cd graphql-order-service
mvn spring-boot:run
```

B. Start the gRPC Server:

```bash
cd grpc-order-service
mvn spring-boot:run
```

3. Start the Clients
Once the servers are running, start the clients in new terminal windows:

A. Run the GraphQL Client:

```bash
cd graphql-client
```

Architecture & Communication Flow
Multiple protocols are used specifically for efficient data exchange:

GraphQL: Provides flexible, client-driven queries for web/mobile frontends via a single endpoint.

gRPC: Facilitates high-performance, binary communication between internal microservices using Protocol Buffers.

🛠 Troubleshooting
Address Already in Use: Ensure ports 8080 (GraphQL) and 9090 (gRPC) are free.

gRPC Build Errors: If the grpc-client fails to find generated classes, run mvn clean compile in grpc-order-service first to trigger the Protobuf compiler.

Connection Refused: Confirm the server applications are fully started before initiating requests from the client applications.
mvn spring-boot:run
