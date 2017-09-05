package Question_21.Problem2;

public abstract class Animals {
	/* Why tf we need this class in this problem tho*/
	
}

interface Transport {
	boolean deliever();
}

class Tiger extends Animals {
	Tiger() {
		System.out.println("Tiger: I am a 'wanna be king' of jungle");
	}
}

class Donkey extends Animals implements Transport{
	Donkey() {
		System.out.println("Donkey: Some stupid hoomas disrespects me");
	}
	public void method()
	{
		/**/
	}
	
	public boolean deliever() {
		System.out.println("I am a donkey & I have to do transportation");
		return true;
	}
}

class Camel extends Animals implements Transport {
	
	Camel() {
		System.out.println("Camel: Yes temperature is very hot up here..");
	}
	public boolean deliever() {
		System.out.println("I am a camel & I have to do transportation");
		return true;
	}
}

class Deer extends Animals {
	Deer() {
		System.out.println("Deer: I am a deer and Salman killed my cousin brother :-(");
	}
}