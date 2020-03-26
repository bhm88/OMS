package restoms.server;

import com.demogrpc.APIResponse;
import com.demogrpc.GetOrderRequest;
import com.demogrpc.Order;
import com.demogrpc.orderGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class GrpcClient {

    private orderGrpc.orderBlockingStub stub;

    @PostConstruct
    private void init() {
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost", 9090).usePlaintext().build();
        stub = orderGrpc.newBlockingStub(managedChannel);

    }
  public APIResponse getOrder(String orderId){
      GetOrderRequest order1 = GetOrderRequest.newBuilder().setId(orderId).build();
   APIResponse order =stub.getOrder(order1);
   return order;
  }
}
