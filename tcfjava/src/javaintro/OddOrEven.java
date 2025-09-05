package javaintro;
import java.util.Scanner;

public class OddOrEven {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if ((num&1) == 0)
        {
            System.out.println(num + " is Even");
        } else 
        {
            System.out.println(num + " is Odd");
        }
	}
}
