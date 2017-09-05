package Question_28;

interface A {
	void methodA();
}

interface B extends A{
	void methodB();
}


class C implements A,B {

	@Override
	public void methodB() {
		System.out.println("This is a method of inteface B");
	}

	@Override
	public void methodA() {
		System.out.println("This is a method of inteface A");
	}
	
	void methodC() {
		System.out.println("This is a method of class C");
	}
	
}

class D extends C {
	void methodD() {
		System.out.println("This is a method of class D");
	}
}