package javaintro;
import java.util.Scanner;
public class UserInput {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hey " + name +", How are You??..");
	}
}
