// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: employee.proto

package example.myapp.helloworld.grpc;

public interface employeeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:helloworld.employee)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int64 totalCount = 1;</code>
   */
  long getTotalCount();

  /**
   * <code>repeated .helloworld.employee.ITEMS items = 2;</code>
   */
  java.util.List<example.myapp.helloworld.grpc.employee.ITEMS> 
      getItemsList();
  /**
   * <code>repeated .helloworld.employee.ITEMS items = 2;</code>
   */
  example.myapp.helloworld.grpc.employee.ITEMS getItems(int index);
  /**
   * <code>repeated .helloworld.employee.ITEMS items = 2;</code>
   */
  int getItemsCount();
  /**
   * <code>repeated .helloworld.employee.ITEMS items = 2;</code>
   */
  java.util.List<? extends example.myapp.helloworld.grpc.employee.ITEMSOrBuilder> 
      getItemsOrBuilderList();
  /**
   * <code>repeated .helloworld.employee.ITEMS items = 2;</code>
   */
  example.myapp.helloworld.grpc.employee.ITEMSOrBuilder getItemsOrBuilder(
      int index);
}
