package client;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import service.TraceWriter;

public class ClientTest {

	
	public static void main(String[] args) throws MalformedURLException {
		String wsdlURL = "http://localhost:8082/injavawetrust/trace";
		//Eclipste -> properties -> TCP/IP Monitor yeni ekle.
		// local port -> 8082
		// host name- > localhost
		// port -> service publsih ettigimiz port( 8888)
		// type -> TCP/IP
		
		URL url = new URL(wsdlURL);
		QName qname = new QName("http://service/", "TraceWriterImplService");
		Service service = Service.create(url,qname);
		
		TraceWriter traceWriter = service.getPort(TraceWriter.class);
		//
		System.out.println(traceWriter.getMessage());
	}
}
