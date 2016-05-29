package com.firstwebservice;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;
public class TimeClient {

	public static void main(String[] args) throws Exception {
		URL url = new URL("http://127.0.0.1:9876/firstwebservice?wsdl");
		
		// Qualified name of the service:
		// 1st arg is the service URI
		// 2nd arg is the service name published in the WSDL
		QName qname = new QName	("http://firstwebservice.com/","TimeServerImplService");
		
		// Create, in effect, a factory for the service.
		Service service = Service.create(url, qname);
		
		// Extract the endpoint interface, the service "port".
		TimeServer elf = service.getPort(TimeServer.class);
		
		System.out.println("Time as String: " + elf.getTimeAsString());
		System.out.println("Time as Elapsed: " + elf.getTimeAsElapsed());

	}

}
