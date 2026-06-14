package com.example.graphql;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.graphql.data.method.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GraphqlOrderApplication {
 
 public static void main(String[] a){
  SpringApplication.run(GraphqlOrderApplication.class,a);
 }
 
 @Bean OrderController controller(){
  return new OrderController();
 }
 
 static class OrderController {
  
  @QueryMapping 
  public String order(){
   return "GraphQL Order Response";
  }
  
 }
 
}
