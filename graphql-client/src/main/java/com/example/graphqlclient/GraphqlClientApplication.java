package com.example.graphqlclient;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;

@SpringBootApplication
public class GraphqlClientApplication {
 
 public static void main(String[] a) 
 {
  SpringApplication.run(GraphqlClientApplication.class,a);
  System.out.println("GraphQL client invokes graphql-order-service");
 }
 
}
