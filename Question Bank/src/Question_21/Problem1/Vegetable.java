package Question_21.Problem1;

public abstract class Vegetable {
	String color;
	String name;
	public abstract String sayMyName();
	
	@Override
	public String toString() {
		return sayMyName();
	}
	
}
	
class Potato extends Vegetable {
		
	Potato() {
		color="brown";
	}
	
	public String sayMyName() {
		return"They call me Potato"+" Because my color is : "+color;
	}
}
	
class Brinjal extends Vegetable {
	Brinjal() {
		color="violet";
	}
	
	public String sayMyName() {
		//System.out.println("No one likes me.. :-(");
		return"I am a Brinjal and No one likes me.. :-("+" Because my color is : "+color;
	}
}
	
class Tomato extends Vegetable{
	Tomato() {
		color="red";
	}
	
	public String sayMyName() {
		//System.out.println("I am a vegetable yet some idiots add me in fruit salad :O ");
		return"I am a vegetable yet some idiots add me in fruit salad :O "+" Because my color is : "+color;
	}
}
