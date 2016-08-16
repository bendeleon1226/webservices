package ch02.ts;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
public interface TimeServer {
	@WebMethod 
	@WebResult(partName = "time_response")
	String getTimeAsString();
	
	@WebMethod 
	@WebResult(partName = "time_response")
	long getTimeAsElapsed();
}
