package example.api.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.36.0)",
    comments = "Source: github.com/gunk/gunk-example-server/api/v1/all.proto")
public final class UtilServiceGrpc {

  private UtilServiceGrpc() {}

  public static final String SERVICE_NAME = "v1.UtilService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      example.api.v1.CheckStatusResponse> getCheckStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckStatus",
      requestType = com.google.protobuf.Empty.class,
      responseType = example.api.v1.CheckStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      example.api.v1.CheckStatusResponse> getCheckStatusMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, example.api.v1.CheckStatusResponse> getCheckStatusMethod;
    if ((getCheckStatusMethod = UtilServiceGrpc.getCheckStatusMethod) == null) {
      synchronized (UtilServiceGrpc.class) {
        if ((getCheckStatusMethod = UtilServiceGrpc.getCheckStatusMethod) == null) {
          UtilServiceGrpc.getCheckStatusMethod = getCheckStatusMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, example.api.v1.CheckStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CheckStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  example.api.v1.CheckStatusResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getCheckStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<example.api.v1.Message,
      example.api.v1.Message> getEchoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Echo",
      requestType = example.api.v1.Message.class,
      responseType = example.api.v1.Message.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<example.api.v1.Message,
      example.api.v1.Message> getEchoMethod() {
    io.grpc.MethodDescriptor<example.api.v1.Message, example.api.v1.Message> getEchoMethod;
    if ((getEchoMethod = UtilServiceGrpc.getEchoMethod) == null) {
      synchronized (UtilServiceGrpc.class) {
        if ((getEchoMethod = UtilServiceGrpc.getEchoMethod) == null) {
          UtilServiceGrpc.getEchoMethod = getEchoMethod =
              io.grpc.MethodDescriptor.<example.api.v1.Message, example.api.v1.Message>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Echo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  example.api.v1.Message.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  example.api.v1.Message.getDefaultInstance()))
              .build();
        }
      }
    }
    return getEchoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UtilServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UtilServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UtilServiceStub>() {
        @java.lang.Override
        public UtilServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UtilServiceStub(channel, callOptions);
        }
      };
    return UtilServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UtilServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UtilServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UtilServiceBlockingStub>() {
        @java.lang.Override
        public UtilServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UtilServiceBlockingStub(channel, callOptions);
        }
      };
    return UtilServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UtilServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UtilServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UtilServiceFutureStub>() {
        @java.lang.Override
        public UtilServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UtilServiceFutureStub(channel, callOptions);
        }
      };
    return UtilServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class UtilServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * CheckStatus returns the server health status.
     * </pre>
     */
    public void checkStatus(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<example.api.v1.CheckStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCheckStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * Echo echoes a message.
     * </pre>
     */
    public void echo(example.api.v1.Message request,
        io.grpc.stub.StreamObserver<example.api.v1.Message> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEchoMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCheckStatusMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                example.api.v1.CheckStatusResponse>(
                  this, METHODID_CHECK_STATUS)))
          .addMethod(
            getEchoMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                example.api.v1.Message,
                example.api.v1.Message>(
                  this, METHODID_ECHO)))
          .build();
    }
  }

  /**
   */
  public static final class UtilServiceStub extends io.grpc.stub.AbstractAsyncStub<UtilServiceStub> {
    private UtilServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UtilServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UtilServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * CheckStatus returns the server health status.
     * </pre>
     */
    public void checkStatus(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<example.api.v1.CheckStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCheckStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Echo echoes a message.
     * </pre>
     */
    public void echo(example.api.v1.Message request,
        io.grpc.stub.StreamObserver<example.api.v1.Message> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEchoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UtilServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<UtilServiceBlockingStub> {
    private UtilServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UtilServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UtilServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * CheckStatus returns the server health status.
     * </pre>
     */
    public example.api.v1.CheckStatusResponse checkStatus(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCheckStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Echo echoes a message.
     * </pre>
     */
    public example.api.v1.Message echo(example.api.v1.Message request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEchoMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UtilServiceFutureStub extends io.grpc.stub.AbstractFutureStub<UtilServiceFutureStub> {
    private UtilServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UtilServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UtilServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * CheckStatus returns the server health status.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<example.api.v1.CheckStatusResponse> checkStatus(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCheckStatusMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Echo echoes a message.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<example.api.v1.Message> echo(
        example.api.v1.Message request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEchoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CHECK_STATUS = 0;
  private static final int METHODID_ECHO = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UtilServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UtilServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CHECK_STATUS:
          serviceImpl.checkStatus((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<example.api.v1.CheckStatusResponse>) responseObserver);
          break;
        case METHODID_ECHO:
          serviceImpl.echo((example.api.v1.Message) request,
              (io.grpc.stub.StreamObserver<example.api.v1.Message>) responseObserver);
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

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (UtilServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getCheckStatusMethod())
              .addMethod(getEchoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
