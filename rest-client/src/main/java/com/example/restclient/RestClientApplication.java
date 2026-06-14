package com.example.restclient;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;

@SpringBootApplication
public class RestClientApplication {
 public static void main(String[] a) {
  SpringApplication.run(RestClientApplication.class,a);
  System.out.println("REST client invokes rest-order-service");
 }
}
