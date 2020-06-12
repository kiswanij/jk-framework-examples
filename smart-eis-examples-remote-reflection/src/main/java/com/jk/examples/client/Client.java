package com.jk.examples.client;

import com.jk.examples.server.Server;
import com.jk.reflection.client.ReflectionClient;
import com.jk.reflection.common.MethodCallInfo;

public class Client {
	public static void main(String[] args) {
		String className = "com.jk.examples.server.Person";
		String methodName = "sayHello";
		MethodCallInfo info = new MethodCallInfo(className, methodName, "Jalal Kiswani");
		
	    ReflectionClient client = new ReflectionClient("localhost", Server.PORT_NUMBER);
		client.callMethod(info);	
		System.out.println(info.getResult());
	}
}
