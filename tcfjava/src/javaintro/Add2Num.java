package javaintro;
import java.util.Scanner;
public class Add2Num {
		public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter Number 1: ");
			int num1=sc.nextInt();
			System.out.print("Enter Number 2: ");
			int num2=sc.nextInt();
			int result=num1+num2;
			System.out.println("The sum of "+num1+" and "+num2+" is "+result);
		}


}
