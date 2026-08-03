package com.pm.billingService.grpc;

import billing.BillingResponse;
import billing.BillingServiceGrpc.BillingServiceImplBase;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@GrpcService
public class BillingGrpcService  extends BillingServiceImplBase {
    private static final Logger log = LoggerFactory.getLogger(BillingGrpcService.class);

    // Implement your gRPC service methods here
    @Override
    public void createBillingAccount(billing.BillingRequest billingRequest,
                                  StreamObserver<BillingResponse> responseObserver) {
        log.info("createBillingAccount called with request: {}", billingRequest.toString());
        // Implement your logic to create a billing account here
        BillingResponse response = BillingResponse.newBuilder()
                .setAccountId("1234")
                .setStatus("ACTIVE")
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();



    }
}
