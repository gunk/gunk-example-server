// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: all.proto

package example.api.v1;

public interface GetCountriesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:v1.GetCountriesResponse)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>map&lt;string, .v1.Country&gt; Countries = 1[json_name = "countries", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  int getCountriesCount();
  /**
   * <code>map&lt;string, .v1.Country&gt; Countries = 1[json_name = "countries", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  boolean containsCountries(
      java.lang.String key);
  /**
   * Use {@link #getCountriesMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, example.api.v1.Country>
  getCountries();
  /**
   * <code>map&lt;string, .v1.Country&gt; Countries = 1[json_name = "countries", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  java.util.Map<java.lang.String, example.api.v1.Country>
  getCountriesMap();
  /**
   * <code>map&lt;string, .v1.Country&gt; Countries = 1[json_name = "countries", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */

  example.api.v1.Country getCountriesOrDefault(
      java.lang.String key,
      example.api.v1.Country defaultValue);
  /**
   * <code>map&lt;string, .v1.Country&gt; Countries = 1[json_name = "countries", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */

  example.api.v1.Country getCountriesOrThrow(
      java.lang.String key);
}
