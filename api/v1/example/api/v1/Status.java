// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: all.proto

package example.api.v1;

/**
 * <pre>
 * Status is a server health status.
 * </pre>
 *
 * Protobuf enum {@code v1.Status}
 */
public enum Status
    implements com.google.protobuf.Internal.EnumLite {
  /**
   * <code>Unknown = 0 [deprecated = false];</code>
   */
  Unknown(0),
  /**
   * <code>Error = 1 [deprecated = false];</code>
   */
  Error(1),
  /**
   * <code>OK = 2 [deprecated = false];</code>
   */
  OK(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>Unknown = 0 [deprecated = false];</code>
   */
  public static final int Unknown_VALUE = 0;
  /**
   * <code>Error = 1 [deprecated = false];</code>
   */
  public static final int Error_VALUE = 1;
  /**
   * <code>OK = 2 [deprecated = false];</code>
   */
  public static final int OK_VALUE = 2;


  @java.lang.Override
  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static Status valueOf(int value) {
    return forNumber(value);
  }

  public static Status forNumber(int value) {
    switch (value) {
      case 0: return Unknown;
      case 1: return Error;
      case 2: return OK;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Status>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Status> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Status>() {
          @java.lang.Override
          public Status findValueByNumber(int number) {
            return Status.forNumber(number);
          }
        };

  public static com.google.protobuf.Internal.EnumVerifier 
      internalGetVerifier() {
    return StatusVerifier.INSTANCE;
  }

  private static final class StatusVerifier implements 
       com.google.protobuf.Internal.EnumVerifier { 
          static final com.google.protobuf.Internal.EnumVerifier           INSTANCE = new StatusVerifier();
          @java.lang.Override
          public boolean isInRange(int number) {
            return Status.forNumber(number) != null;
          }
        };

  private final int value;

  private Status(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:v1.Status)
}

