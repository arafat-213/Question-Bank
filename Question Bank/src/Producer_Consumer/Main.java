package Producer_Consumer;

public class Main {

	public static void main(String[] args) {
		Stackk s1 = new Stackk();
		User u2 = new User("Producer 1 ",s1);
		User u3 = new User("Producer 2 ",s1);
		User u1 = new User("Consumer",s1);
	}

}
