package ch01.ts;

import javax.xml.ws.Endpoint;

public class TimeServerPublisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:9901/ts", new TimeServerImpl());

	}

}
