package week01.ws.client;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import week01.ws.service.HelloMyService;

public class ClientTest01 {

	public static void main(String[] args) throws MalformedURLException {
		String address = "http://localhost:8888/week01/hello.service";
		URL url = new URL(address);
		QName qname = new QName("http://service.ws.week01/", "HelloMyServiceImplService");
		Service service = Service.create(url, qname);
		//

		HelloMyService hello = service.getPort(HelloMyService.class);
		String message=hello.getWelcomeMessage("test name", "test surname");
		
		System.out.println(message);

	}
}
