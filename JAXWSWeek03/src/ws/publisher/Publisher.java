package ws.publisher;

import javax.xml.ws.Endpoint;

import ws.service.MessageWriterImpl;

public class Publisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8080/injavawetrust/week03", new MessageWriterImpl());
		System.out.println("web service is publishing...");
	}
}
