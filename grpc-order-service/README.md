

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

A. Start the gRPC Server:

```bash
cd grpc-order-service
mvn spring-boot:run
```

3. Start the Clients
Once the servers are running, start the clients in new terminal windows:

A. Run the GraphQL Client:

```bash
cd grpc-client
```

## Architecture & Communication Flow

#gRPC: 
Facilitates high-performance, binary communication between internal microservices using Protocol Buffers.

## 🛠 Troubleshooting
Address Already in Use: Ensure ports 8080 (GraphQL) and 9090 (gRPC) are free.

# gRPC Build Errors: 
If the grpc-client fails to find generated classes, run 
```bash
mvn clean compile
```
in grpc-order-service first to trigger the Protobuf compiler.

# Connection Refused: 
Confirm the server applications are fully started before initiating requests from the client applications.

```bash
mvn spring-boot:run
```
