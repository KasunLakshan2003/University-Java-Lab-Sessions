import java.util.Scanner;
public class Operation{
	public static void main(String[]args){
		
		Scanner myscanner = new Scanner(System.in);
		
		System.out.println("Enter the first number :- ");
		int num1 = myscanner.nextInt();
		
		System.out.println("Enter the second number:- ");
		int num2 = myscanner.nextInt();
		
		System.out.println("Enter the operation:- ");
		String Op = myscanner.next();
		
		switch(Op){
			case "+":
				System.out.println("The answer is "+(num1+num2));
			break;
			case "-":
				System.out.println("The answer is "+(num1-num2));
			break;
			case "*":
				System.out.println("The answer is "+(num1*num2));
			break;
			case "/":
				if(num2 == 0){
					System.out.println("Can't divide by zero!");
				}else{
					System.out.println("The answer is "+(num1/num2));
				}
			break;
			default:
				System.out.println("Invalid Operation!Please try again later...!");
		}
	}
}
