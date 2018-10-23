package test;

import ws.service.MessageWriter;
import ws.service.MessageWriterImplService;

public class ClientTest {

	public static void main(String[] args) {
		MessageWriterImplService service = new MessageWriterImplService();
		MessageWriter messageWriter = service.getMessageWriterImplPort();

		String message = messageWriter.getWelcomeMessage("levent", "erguder");
		System.out.println(message);
	}
}

// https://docs.oracle.com/javase/9/tools/wsimport.htm#JSWOR740