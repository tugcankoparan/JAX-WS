package test;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import NET.webserviceX.www.AirportLocator;
import NET.webserviceX.www.AirportSoap;

public class AirportTest {

	public static void main(String[] args) throws ServiceException, RemoteException {
		AirportLocator locator = new AirportLocator();
		AirportSoap airportSoap=locator.getairportSoap();
		//
		String ESB = airportSoap.getAirportInformationByAirportCode("ESB");
		System.out.println(ESB);
		
	}
}
