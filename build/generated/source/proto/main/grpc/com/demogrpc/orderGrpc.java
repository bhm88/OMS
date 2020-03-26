package com.demogrpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.28.0)",
    comments = "Source: dummy/order.proto")
public final class orderGrpc {

  private orderGrpc() {}

  public static final String SERVICE_NAME = "demogrpc.order";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.demogrpc.GetOrderRequest,
      com.demogrpc.APIResponse> getGetOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getOrder",
      requestType = com.demogrpc.GetOrderRequest.class,
      responseType = com.demogrpc.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.demogrpc.GetOrderRequest,
      com.demogrpc.APIResponse> getGetOrderMethod() {
    io.grpc.MethodDescriptor<com.demogrpc.GetOrderRequest, com.demogrpc.APIResponse> getGetOrderMethod;
    if ((getGetOrderMethod = orderGrpc.getGetOrderMethod) == null) {
      synchronized (orderGrpc.class) {
        if ((getGetOrderMethod = orderGrpc.getGetOrderMethod) == null) {
          orderGrpc.getGetOrderMethod = getGetOrderMethod =
              io.grpc.MethodDescriptor.<com.demogrpc.GetOrderRequest, com.demogrpc.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.demogrpc.GetOrderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.demogrpc.APIResponse.getDefaultInstance()))
              .setSchemaDescriptor(new orderMethodDescriptorSupplier("getOrder"))
              .build();
        }
      }
    }
    return getGetOrderMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static orderStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<orderStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<orderStub>() {
        @java.lang.Override
        public orderStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new orderStub(channel, callOptions);
        }
      };
    return orderStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static orderBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<orderBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<orderBlockingStub>() {
        @java.lang.Override
        public orderBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new orderBlockingStub(channel, callOptions);
        }
      };
    return orderBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static orderFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<orderFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<orderFutureStub>() {
        @java.lang.Override
        public orderFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new orderFutureStub(channel, callOptions);
        }
      };
    return orderFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class orderImplBase implements io.grpc.BindableService {

    /**
     */
    public void getOrder(com.demogrpc.GetOrderRequest request,
        io.grpc.stub.StreamObserver<com.demogrpc.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetOrderMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetOrderMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.demogrpc.GetOrderRequest,
                com.demogrpc.APIResponse>(
                  this, METHODID_GET_ORDER)))
          .build();
    }
  }

  /**
   */
  public static final class orderStub extends io.grpc.stub.AbstractAsyncStub<orderStub> {
    private orderStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected orderStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new orderStub(channel, callOptions);
    }

    /**
     */
    public void getOrder(com.demogrpc.GetOrderRequest request,
        io.grpc.stub.StreamObserver<com.demogrpc.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetOrderMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class orderBlockingStub extends io.grpc.stub.AbstractBlockingStub<orderBlockingStub> {
    private orderBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected orderBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new orderBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.demogrpc.APIResponse getOrder(com.demogrpc.GetOrderRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetOrderMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class orderFutureStub extends io.grpc.stub.AbstractFutureStub<orderFutureStub> {
    private orderFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected orderFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new orderFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.demogrpc.APIResponse> getOrder(
        com.demogrpc.GetOrderRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetOrderMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ORDER = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final orderImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(orderImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ORDER:
          serviceImpl.getOrder((com.demogrpc.GetOrderRequest) request,
              (io.grpc.stub.StreamObserver<com.demogrpc.APIResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class orderBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    orderBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.demogrpc.Order.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("order");
    }
  }

  private static final class orderFileDescriptorSupplier
      extends orderBaseDescriptorSupplier {
    orderFileDescriptorSupplier() {}
  }

  private static final class orderMethodDescriptorSupplier
      extends orderBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    orderMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (orderGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new orderFileDescriptorSupplier())
              .addMethod(getGetOrderMethod())
              .build();
        }
      }
    }
    return result;
  }
}
