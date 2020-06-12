package com.jk.examples.server;

import com.jk.reflection.server.ReflectionServer;

public class Server {

	public static final int PORT_NUMBER = 8523;

	public static void main(String[] args) {
		
		ReflectionServer server = new ReflectionServer(PORT_NUMBER);
		server.start();
	}
}

