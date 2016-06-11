package ch01.team;

import javax.xml.ws.Endpoint;

import com.firstwebservice.TimeServerImpl;

public class TeamsPublisher {
	public static void main(String[] args){
		Endpoint.publish("http://localhost:8888/teams", new Teams());
		
	}
}
