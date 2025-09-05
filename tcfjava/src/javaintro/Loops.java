package javaintro;

public class Loops {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//For Loop
		for(int i=1;i<=5;i++) {
			System.out.println("The value of i is "+i);
		}
		
		//While Loop
		int j=1;
		while(j<=5) {
			System.out.println("The value of j is "+j++);
		}
		
		//Do-While Loop
		int k=1;
		do {
			System.out.println("The value of k is "+k++);
		}while(k<=5);
	}	

}
