package Producer_Consumer;
import java.util.Stack;

public class Stackk {
	Stack<Integer> st1 = new Stack<Integer>();
	synchronized void Produce(String na){
		
		while(true) {	
			int capacity = 7;
			int value = 0;
			while(st1.size()==capacity) { 
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println(na+" produced data "+value);
			st1.push(++value);
			notify();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	void consume(String na) {
		while (true)
		{
			while (st1.size()==0) {
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			int val = st1.pop();
			System.out.println("Consumer consumed-"+ val);
			notifyAll();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
