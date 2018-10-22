package tugcankoparan.ws.client;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import tugcankoparan.ws.service.MessageWriter;

public class Client {
	private static String WEB_SERVICE_WSDL_URL = "http://localhost:8082/tugcankoparan/hello.jaxws?wsdl";
	public static void main(String[] args) throws MalformedURLException {

		URL url = new URL(WEB_SERVICE_WSDL_URL);
		QName qname = new QName("http://service.ws.tugcankoparan/", "MessageWriterImplService");
		Service service = Service.create(url, qname);

		MessageWriter messageWriter = service.getPort(MessageWriter.class);

		String welcomeMessage = messageWriter.getWelcomeMessage("Tuðcan", "Koparan");
		System.out.println(welcomeMessage);
	}
}
