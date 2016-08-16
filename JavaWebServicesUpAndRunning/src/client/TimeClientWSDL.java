package client;

public class TimeClientWSDL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TimeServerImplService service = new TimeServerImplService();
		
		TimeServer eif = service.getTimeServerImplPort();
		
		System.out.println(eif.getTimeAsString());
		System.out.println(eif.getTimeAsElapsed());
	}

}
