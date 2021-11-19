package example.api.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.36.0)",
    comments = "Source: github.com/gunk/gunk-example-server/api/v1/all.proto")
public final class CountriesServiceGrpc {

  private CountriesServiceGrpc() {}

  public static final String SERVICE_NAME = "v1.CountriesService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<example.api.v1.GetCountriesRequest,
      example.api.v1.GetCountriesResponse> getGetCountriesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCountries",
      requestType = example.api.v1.GetCountriesRequest.class,
      responseType = example.api.v1.GetCountriesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<example.api.v1.GetCountriesRequest,
      example.api.v1.GetCountriesResponse> getGetCountriesMethod() {
    io.grpc.MethodDescriptor<example.api.v1.GetCountriesRequest, example.api.v1.GetCountriesResponse> getGetCountriesMethod;
    if ((getGetCountriesMethod = CountriesServiceGrpc.getGetCountriesMethod) == null) {
      synchronized (CountriesServiceGrpc.class) {
        if ((getGetCountriesMethod = CountriesServiceGrpc.getGetCountriesMethod) == null) {
          CountriesServiceGrpc.getGetCountriesMethod = getGetCountriesMethod =
              io.grpc.MethodDescriptor.<example.api.v1.GetCountriesRequest, example.api.v1.GetCountriesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCountries"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  example.api.v1.GetCountriesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  example.api.v1.GetCountriesResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetCountriesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CountriesServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CountriesServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CountriesServiceStub>() {
        @java.lang.Override
        public CountriesServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CountriesServiceStub(channel, callOptions);
        }
      };
    return CountriesServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CountriesServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CountriesServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CountriesServiceBlockingStub>() {
        @java.lang.Override
        public CountriesServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CountriesServiceBlockingStub(channel, callOptions);
        }
      };
    return CountriesServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CountriesServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CountriesServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CountriesServiceFutureStub>() {
        @java.lang.Override
        public CountriesServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CountriesServiceFutureStub(channel, callOptions);
        }
      };
    return CountriesServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class CountriesServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * GetCountries returns a list of countries identified by their ISO code.
     * (showcases multiple http matching rules with a filter).
     * </pre>
     */
    public void getCountries(example.api.v1.GetCountriesRequest request,
        io.grpc.stub.StreamObserver<example.api.v1.GetCountriesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCountriesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetCountriesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                example.api.v1.GetCountriesRequest,
                example.api.v1.GetCountriesResponse>(
                  this, METHODID_GET_COUNTRIES)))
          .build();
    }
  }

  /**
   */
  public static final class CountriesServiceStub extends io.grpc.stub.AbstractAsyncStub<CountriesServiceStub> {
    private CountriesServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CountriesServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CountriesServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetCountries returns a list of countries identified by their ISO code.
     * (showcases multiple http matching rules with a filter).
     * </pre>
     */
    public void getCountries(example.api.v1.GetCountriesRequest request,
        io.grpc.stub.StreamObserver<example.api.v1.GetCountriesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCountriesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CountriesServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CountriesServiceBlockingStub> {
    private CountriesServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CountriesServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CountriesServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetCountries returns a list of countries identified by their ISO code.
     * (showcases multiple http matching rules with a filter).
     * </pre>
     */
    public example.api.v1.GetCountriesResponse getCountries(example.api.v1.GetCountriesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCountriesMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CountriesServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CountriesServiceFutureStub> {
    private CountriesServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CountriesServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CountriesServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetCountries returns a list of countries identified by their ISO code.
     * (showcases multiple http matching rules with a filter).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<example.api.v1.GetCountriesResponse> getCountries(
        example.api.v1.GetCountriesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCountriesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_COUNTRIES = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CountriesServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CountriesServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_COUNTRIES:
          serviceImpl.getCountries((example.api.v1.GetCountriesRequest) request,
              (io.grpc.stub.StreamObserver<example.api.v1.GetCountriesResponse>) responseObserver);
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
      synchronized (CountriesServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getGetCountriesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
