package com.example.grpc;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class OrderGrpcService extends OrderServiceGrpc.OrderServiceImplBase {

    @Override
    public void getOrder(OrderRequest request, StreamObserver<OrderResponse> responseObserver) {
        // Logic to process the request
        String responseMessage = "Order processed for ID: " + request.getOrderId();
        
        OrderResponse response = OrderResponse.newBuilder()
                .setDetails(responseMessage)
                .build();

        // Send response and complete
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
