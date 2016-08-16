package ch02.ts;

import javax.jws.WebService;
import java.util.Date;

@WebService(endpointInterface = "ch02.ts.TimeServer")
public class TimeServerImpl implements TimeServer {

	@Override
	public String getTimeAsString() {
		return new Date().toString();
	}

	@Override
	public long getTimeAsElapsed() {
		return new Date().getTime();
	}

}
