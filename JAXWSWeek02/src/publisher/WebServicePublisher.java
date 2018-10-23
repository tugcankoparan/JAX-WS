package publisher;

import javax.xml.ws.Endpoint;

import service.TraceWriterImpl;

public class WebServicePublisher {

	private static String address = "http://localhost:8888/injavawetrust/trace?wsdl";

	public static void main(String[] args) {
		Endpoint.publish(address, new TraceWriterImpl());
		System.out.println("Web Service is publishing...");
	}
}
