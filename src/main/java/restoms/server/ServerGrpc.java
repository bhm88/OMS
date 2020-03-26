package restoms.server;

import com.demogrpc.APIResponse;
import com.demogrpc.GetOrderRequest;
import com.demogrpc.orderGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;
import restoms.dao.OmsOrder;
import restoms.dao.OrderRepository;

import java.util.Optional;

@GrpcService
public class ServerGrpc extends orderGrpc.orderImplBase{

    @Autowired
    private OrderRepository repo;

    @Override
    public void getOrder(GetOrderRequest request, StreamObserver<APIResponse> responseObserver) {
        Optional<OmsOrder> response=repo.findById(request.getId());
        responseObserver.onNext(build(response.get()));
   responseObserver.onCompleted();

    }



    private com.demogrpc.APIResponse build(OmsOrder order){
  com.demogrpc.APIResponse.Builder builder = com.demogrpc.APIResponse.newBuilder();
  builder.setDirection(order.getDirection());
  builder.setOrderId(order.getOrderId());
  builder.setPrice(order.getPrice());
  builder.setQuantity(order.getQuantity());
  builder.setUsername(order.getUserName());
  builder.setTicker(order.getTicker());
  builder.setEmail(order.getEmail());
  return builder.build();
    }
}
