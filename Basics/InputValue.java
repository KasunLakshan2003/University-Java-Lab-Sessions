import java.util.Scanner;
public class InputValue{
	
	public static void main (String [] args){
		
		Scanner myscanner = new Scanner(System.in);
		
		//integer
		System.out.println("Enter the number :");
		int num = myscanner.nextInt();
		System.out.println("Your number is "+num);
		
		//double
		System.out.println("Enter the Decimal :");
		double decimal = myscanner.nextDouble();
		System.out.println("Your number is "+decimal);
		
		//string
		System.out.println("Enter your name :");
		String name = myscanner.next();
		System.out.println("Your name is "+name);
		
		
		
		
	}
}
