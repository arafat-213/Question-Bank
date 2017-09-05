/*Write a program that illustrates interface inheritance. Interface P is extended by
P1 and P2. Interface P12 inherits from both P1 and P2.Each interface declares one
constant and one method. class Q implements P12.Instantiate Q and invoke each
of its methods. Each method displays one of the constants */

package Question_7;

interface P {
	final int varP=0;
	void methodP();
}

interface P1 extends P{
	final int varP1=1;
	void methodP1();
}

interface P2 extends P{
	final int varP2=2;
	void methodP2();
}

interface P12 extends P1,P2 {
	final int varP12=12;
	void methodP12();
}
public class Q implements P12{
	
	public void methodP() {
		System.out.println("Mehod of interface P : "+varP);
	}
	
	public void methodP1() {
		System.out.println("Method of interface P1 : "+varP1);
	}
	
	public void methodP2() {
		System.out.println("Method of interface P1 : "+varP2);
	}
	
	public void methodP12() {
		System.out.println("Method of interface P1 : "+varP12);
	}	
}
