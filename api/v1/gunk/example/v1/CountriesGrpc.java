package gunk.example.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.36.0)",
    comments = "Source: github.com/gunk/gunk-example-server/api/v1/all.proto")
public final class CountriesGrpc {

  private CountriesGrpc() {}

  public static final String SERVICE_NAME = "gunk.example.v1.Countries";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<gunk.example.v1.GetCountriesRequest,
      gunk.example.v1.GetCountriesResponse> getGetCountriesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCountries",
      requestType = gunk.example.v1.GetCountriesRequest.class,
      responseType = gunk.example.v1.GetCountriesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gunk.example.v1.GetCountriesRequest,
      gunk.example.v1.GetCountriesResponse> getGetCountriesMethod() {
    io.grpc.MethodDescriptor<gunk.example.v1.GetCountriesRequest, gunk.example.v1.GetCountriesResponse> getGetCountriesMethod;
    if ((getGetCountriesMethod = CountriesGrpc.getGetCountriesMethod) == null) {
      synchronized (CountriesGrpc.class) {
        if ((getGetCountriesMethod = CountriesGrpc.getGetCountriesMethod) == null) {
          CountriesGrpc.getGetCountriesMethod = getGetCountriesMethod =
              io.grpc.MethodDescriptor.<gunk.example.v1.GetCountriesRequest, gunk.example.v1.GetCountriesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCountries"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  gunk.example.v1.GetCountriesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  gunk.example.v1.GetCountriesResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetCountriesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CountriesStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CountriesStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CountriesStub>() {
        @java.lang.Override
        public CountriesStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CountriesStub(channel, callOptions);
        }
      };
    return CountriesStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CountriesBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CountriesBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CountriesBlockingStub>() {
        @java.lang.Override
        public CountriesBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CountriesBlockingStub(channel, callOptions);
        }
      };
    return CountriesBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CountriesFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CountriesFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CountriesFutureStub>() {
        @java.lang.Override
        public CountriesFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CountriesFutureStub(channel, callOptions);
        }
      };
    return CountriesFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class CountriesImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * GetCountries returns a list of countries identified by their ISO code.
     * (showcases multiple http matching rules with a filter).
     * </pre>
     */
    public void getCountries(gunk.example.v1.GetCountriesRequest request,
        io.grpc.stub.StreamObserver<gunk.example.v1.GetCountriesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCountriesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetCountriesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                gunk.example.v1.GetCountriesRequest,
                gunk.example.v1.GetCountriesResponse>(
                  this, METHODID_GET_COUNTRIES)))
          .build();
    }
  }

  /**
   */
  public static final class CountriesStub extends io.grpc.stub.AbstractAsyncStub<CountriesStub> {
    private CountriesStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CountriesStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CountriesStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetCountries returns a list of countries identified by their ISO code.
     * (showcases multiple http matching rules with a filter).
     * </pre>
     */
    public void getCountries(gunk.example.v1.GetCountriesRequest request,
        io.grpc.stub.StreamObserver<gunk.example.v1.GetCountriesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCountriesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CountriesBlockingStub extends io.grpc.stub.AbstractBlockingStub<CountriesBlockingStub> {
    private CountriesBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CountriesBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CountriesBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetCountries returns a list of countries identified by their ISO code.
     * (showcases multiple http matching rules with a filter).
     * </pre>
     */
    public gunk.example.v1.GetCountriesResponse getCountries(gunk.example.v1.GetCountriesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCountriesMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CountriesFutureStub extends io.grpc.stub.AbstractFutureStub<CountriesFutureStub> {
    private CountriesFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CountriesFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CountriesFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetCountries returns a list of countries identified by their ISO code.
     * (showcases multiple http matching rules with a filter).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<gunk.example.v1.GetCountriesResponse> getCountries(
        gunk.example.v1.GetCountriesRequest request) {
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
    private final CountriesImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CountriesImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_COUNTRIES:
          serviceImpl.getCountries((gunk.example.v1.GetCountriesRequest) request,
              (io.grpc.stub.StreamObserver<gunk.example.v1.GetCountriesResponse>) responseObserver);
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
      synchronized (CountriesGrpc.class) {
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
