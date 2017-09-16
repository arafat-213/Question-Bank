package Producer_Consumer;

public class User implements Runnable {
	Thread th;
	String na;
	Stackk s1;
	
	User(String na, Stackk s1) {
		th = new Thread(this);
		this.na=na;
		this.s1=s1;
		th.start();
	}
	
	@Override
	public void run() {
		if(na.equals("Consumer")) {
			s1.consume("Consumer");
		}
		else {
			s1.Produce(na);
		}
	}
}
