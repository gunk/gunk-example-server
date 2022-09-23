package gunk.example.v1;

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
    value = "by gRPC proto compiler (version 1.28.1)",
    comments = "Source: github.com/gunk/gunk-example-server/api/v1/all.proto")
public final class UtilGrpc {

  private UtilGrpc() {}

  public static final String SERVICE_NAME = "gunk.example.v1.Util";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      gunk.example.v1.CheckStatusResponse> getCheckStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckStatus",
      requestType = com.google.protobuf.Empty.class,
      responseType = gunk.example.v1.CheckStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      gunk.example.v1.CheckStatusResponse> getCheckStatusMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, gunk.example.v1.CheckStatusResponse> getCheckStatusMethod;
    if ((getCheckStatusMethod = UtilGrpc.getCheckStatusMethod) == null) {
      synchronized (UtilGrpc.class) {
        if ((getCheckStatusMethod = UtilGrpc.getCheckStatusMethod) == null) {
          UtilGrpc.getCheckStatusMethod = getCheckStatusMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, gunk.example.v1.CheckStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CheckStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  gunk.example.v1.CheckStatusResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getCheckStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<gunk.example.v1.Message,
      gunk.example.v1.Message> getEchoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Echo",
      requestType = gunk.example.v1.Message.class,
      responseType = gunk.example.v1.Message.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gunk.example.v1.Message,
      gunk.example.v1.Message> getEchoMethod() {
    io.grpc.MethodDescriptor<gunk.example.v1.Message, gunk.example.v1.Message> getEchoMethod;
    if ((getEchoMethod = UtilGrpc.getEchoMethod) == null) {
      synchronized (UtilGrpc.class) {
        if ((getEchoMethod = UtilGrpc.getEchoMethod) == null) {
          UtilGrpc.getEchoMethod = getEchoMethod =
              io.grpc.MethodDescriptor.<gunk.example.v1.Message, gunk.example.v1.Message>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Echo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  gunk.example.v1.Message.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  gunk.example.v1.Message.getDefaultInstance()))
              .build();
        }
      }
    }
    return getEchoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UtilStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UtilStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UtilStub>() {
        @java.lang.Override
        public UtilStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UtilStub(channel, callOptions);
        }
      };
    return UtilStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UtilBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UtilBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UtilBlockingStub>() {
        @java.lang.Override
        public UtilBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UtilBlockingStub(channel, callOptions);
        }
      };
    return UtilBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UtilFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UtilFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UtilFutureStub>() {
        @java.lang.Override
        public UtilFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UtilFutureStub(channel, callOptions);
        }
      };
    return UtilFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class UtilImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * CheckStatus returns the server health status.
     * </pre>
     */
    public void checkStatus(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<gunk.example.v1.CheckStatusResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCheckStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * Echo echoes a message.
     * </pre>
     */
    public void echo(gunk.example.v1.Message request,
        io.grpc.stub.StreamObserver<gunk.example.v1.Message> responseObserver) {
      asyncUnimplementedUnaryCall(getEchoMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCheckStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                gunk.example.v1.CheckStatusResponse>(
                  this, METHODID_CHECK_STATUS)))
          .addMethod(
            getEchoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                gunk.example.v1.Message,
                gunk.example.v1.Message>(
                  this, METHODID_ECHO)))
          .build();
    }
  }

  /**
   */
  public static final class UtilStub extends io.grpc.stub.AbstractAsyncStub<UtilStub> {
    private UtilStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UtilStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UtilStub(channel, callOptions);
    }

    /**
     * <pre>
     * CheckStatus returns the server health status.
     * </pre>
     */
    public void checkStatus(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<gunk.example.v1.CheckStatusResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCheckStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Echo echoes a message.
     * </pre>
     */
    public void echo(gunk.example.v1.Message request,
        io.grpc.stub.StreamObserver<gunk.example.v1.Message> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEchoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UtilBlockingStub extends io.grpc.stub.AbstractBlockingStub<UtilBlockingStub> {
    private UtilBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UtilBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UtilBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * CheckStatus returns the server health status.
     * </pre>
     */
    public gunk.example.v1.CheckStatusResponse checkStatus(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getCheckStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Echo echoes a message.
     * </pre>
     */
    public gunk.example.v1.Message echo(gunk.example.v1.Message request) {
      return blockingUnaryCall(
          getChannel(), getEchoMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UtilFutureStub extends io.grpc.stub.AbstractFutureStub<UtilFutureStub> {
    private UtilFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UtilFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UtilFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * CheckStatus returns the server health status.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<gunk.example.v1.CheckStatusResponse> checkStatus(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getCheckStatusMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Echo echoes a message.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<gunk.example.v1.Message> echo(
        gunk.example.v1.Message request) {
      return futureUnaryCall(
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
    private final UtilImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UtilImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CHECK_STATUS:
          serviceImpl.checkStatus((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<gunk.example.v1.CheckStatusResponse>) responseObserver);
          break;
        case METHODID_ECHO:
          serviceImpl.echo((gunk.example.v1.Message) request,
              (io.grpc.stub.StreamObserver<gunk.example.v1.Message>) responseObserver);
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
      synchronized (UtilGrpc.class) {
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
