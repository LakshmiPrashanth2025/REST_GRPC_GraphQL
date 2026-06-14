package com.example.grpcclient;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;

@SpringBootApplication
public class GrpcClientApplication {
 public static void main(String[] a) {
  SpringApplication.run(GrpcClientApplication.class,a);
  System.out.println("gRPC client invokes grpc-order-service");
 }
}
