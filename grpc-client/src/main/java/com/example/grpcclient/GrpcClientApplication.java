package com.example.grpcclient;

import com.example.grpc.OrderRequest;
import com.example.grpc.OrderServiceGrpc;

import net.devh.boot.grpc.client.inject.GrpcClient;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@SpringBootApplication
public class GrpcClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(GrpcClientApplication.class, args);
    }

    @Service
    public static class OrderClientService {
        @GrpcClient("order-service")
        private OrderServiceGrpc.OrderServiceBlockingStub blockingStub;

        public String callOrderService(String id) {
            return blockingStub.getOrder(OrderRequest.newBuilder().setOrderId(id).build()).getDetails();
        }
    }

    @Bean
    CommandLineRunner run(OrderClientService clientService) {
        return args -> {
            String response = clientService.callOrderService("ORD-999");
            System.out.println("gRPC Client Received: " + response);
        };
    }
}
