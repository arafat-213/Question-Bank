package Question_21.Problem2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animals Arr[] = new Animals[4];
		Arr[0] = new Tiger();
		Arr[1] = new Donkey();
		Arr[2] = new Camel();
		Arr[3] = new Deer();
		
		// There's an error in this one.. It should work but it's not working.. .GAWWWD I hate my life..
		
		// Proceed with caution :O
		
		for(int i=0;i<4;i++) {
			if(Arr[i] instanceof Transport)
				Arr[i].deliever();
		}
	}
}
