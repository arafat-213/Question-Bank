package Question_27;

interface A{
	void methodA();
}

interface B{
	void methodB();
}

class C implements A,B{
	
	
	
	@Override
	public void methodA()
	{
		System.out.println("This is a method of interface A");
	}

	@Override
	public void methodB() {
		System.out.println("This is a method of interface B");
	}
	
	void methodC() {
		System.out.println("This is a method of class C");
	}
}


class D extends C {
	void methodD()
	{
		System.out.println("This is a method of class D");
	}
}