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

    // 1. Define the Client Bean
    @Bean
    public HttpGraphQlClient graphQlClient() {
        WebClient webClient = WebClient.builder()
                .baseUrl("http://localhost:8080/graphql")
                .build();
        return HttpGraphQlClient.builder(webClient).build();
    }

    // 2. Execute the query using CommandLineRunner
    @Bean
    CommandLineRunner run(HttpGraphQlClient client) {
        return args -> {
            String document = "query { order }";

            client.document(document)
                    .retrieve("order")
                    .toEntity(String.class)
                    .subscribe(response -> System.out.println("Response from Server: " + response));
        };
    }
 
}
