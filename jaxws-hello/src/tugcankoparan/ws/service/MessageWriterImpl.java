package tugcankoparan.ws.service;

import javax.jws.WebService;

@WebService(endpointInterface = "tugcankoparan.ws.service.MessageWriter")
public class MessageWriterImpl implements MessageWriter {

	@Override
	public String getWelcomeMessage(String name, String surname) {
		return "Welcome , " + name + " " + surname + ". This message is sent by MessageWriterImpl#getWelcomeMessage.";
	}

}
