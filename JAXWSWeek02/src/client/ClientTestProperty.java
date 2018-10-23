package client;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import service.TraceWriter;

public class ClientTestProperty {

	public static void main(String[] args) throws MalformedURLException {
		String wsdlURL = "http://localhost:8888/injavawetrust/trace";
		
		//property ekledigimizde soap mesajlarini trace edebilirz.
		System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump", "true");

		
		URL url = new URL(wsdlURL);
		QName qname = new QName("http://service/", "TraceWriterImplService");
		Service service = Service.create(url,qname);
		
		TraceWriter traceWriter = service.getPort(TraceWriter.class);
		//
		System.out.println(traceWriter.getMessage());
	}
}
