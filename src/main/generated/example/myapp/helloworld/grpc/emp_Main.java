package example.myapp.helloworld.grpc;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.lang.instrument.Instrumentation;
import java.util.ArrayList;
import java.util.List;

import com.google.protobuf.Descriptors.FieldDescriptor;

import example.myapp.helloworld.grpc.employee.Builder;
import example.myapp.helloworld.grpc.employee.ITEMS;
import example.myapp.helloworld.grpc.employee.ITEMS.METADATA;
import example.myapp.helloworld.grpc.employee.ITEMS.METADATA.ADDITIONALPROP1;

public class emp_Main {

	static Instrumentation i;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<String> li=new ArrayList<String>();
		
		ITEMS.Builder it=ITEMS.newBuilder();
		it.setId("1001").setTitle("muthu").build();
		
		
		
		employee.Builder emp=employee.newBuilder();
		emp.addItems(0,it);		
		
		System.out.println(emp);
	}	

}
