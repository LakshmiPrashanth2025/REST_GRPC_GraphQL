# API Communication Suite

Multi-module Spring Boot 3.5 + Java 21 example.

Services:
- REST Order Service
- gRPC Order Service
- GraphQL Order Service

Clients:
- REST client
- gRPC client
- GraphQL client
- Unified API client

Run:
```
mvn clean install
docker compose up
```

Production extensions that can be added:
- Resilience4j retry/circuit breaker
- Eureka/Consul service discovery
- Spring Cloud Gateway
- Kubernetes manifests
- OpenTelemetry tracing
