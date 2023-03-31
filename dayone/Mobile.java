package weekone.dayone;

public class Mobile {

	public void makeCall() {
		System.out.println("Make a call");
		String mobileModel = "Nokia";
		float mobileWeight = 0.450f;
	}
	public void sendMsg() {
		System.out.println("Send a message");
		boolean isFullCharged = true;
		int mobileCost = 1500; 
		
	}
	public static void main(String[] args) {
		Mobile m = new Mobile();
		m.makeCall();
		m.sendMsg();
		
		System.out.println("This is my mobile");

	}

}
