package javaintro;
public class CommandArg{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        int result = num1 + num2;

        
        System.out.println("Addition of a and b is: " + result);
	}

}
