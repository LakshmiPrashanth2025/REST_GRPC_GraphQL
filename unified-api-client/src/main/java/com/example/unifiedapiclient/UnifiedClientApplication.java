package com.example.unifiedapiclient;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;

@SpringBootApplication
public class UnifiedClientApplication {
 
 public static void main(String[] a) {
  SpringApplication.run(UnifiedClientApplication.class,a);
  System.out.println("This is just a scaffolding of a Unified client invokes REST, gRPC and GraphQL services");
 }
 
}
