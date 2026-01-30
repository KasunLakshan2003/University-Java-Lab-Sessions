import java.util.Scanner;
public class Addition{
	public static void main(String [] args){
		
		Scanner myscanner = new Scanner(System.in);
		
		System.out.println("Enter the first number :");
		int num1 = myscanner.nextInt();
		
		System.out.println("Enter the second number :");
		int num2 = myscanner.nextInt();
		
		int total = num1+num2;
		System.out.println("Total :- "+total);
		
		int Substraction= num1-num2;
		System.out.println("Substraction is :- "+Substraction);
		
		double Division = num1/num2;
		System.out.println("Division is :- "+Division);
		
		int Multi = num1*num2;
		System.out.println("Multiplication is :- "+Multi);
		
		
		
		
	}
}
