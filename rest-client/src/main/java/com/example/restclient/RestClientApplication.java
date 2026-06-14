package com.example.restclient;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;

@SpringBootApplication
public class RestClientApplication {
 
 public static void main(String[] a) {
  SpringApplication.run(RestClientApplication.class,a);
  System.out.println("REST client invokes rest-order-service");
 }

  @Bean
  CommandLineRunner run(RestClient.Builder builder) {
        return args -> {
            RestClient client =
                builder.baseUrl("http://rest-order-service:8080")
                       .build();

            String response =
                client.get()
                      .uri("/orders/101")
                      .retrieve()
                      .body(String.class);

            System.out.println(response);
        };
    }
}
