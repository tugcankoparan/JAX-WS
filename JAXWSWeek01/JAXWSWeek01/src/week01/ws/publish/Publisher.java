package week01.ws.publish;

import javax.xml.ws.Endpoint;

import week01.ws.service.HelloMyServiceImpl;

public class Publisher {

	public static void main(String[] args) {
		String address = "http://localhost:8888/week01/hello.service";
		Endpoint.publish(address, new HelloMyServiceImpl());
		
		System.out.println("Web service is running....");
	}
}
