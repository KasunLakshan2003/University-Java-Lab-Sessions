import java.util.Scanner;
public class GreetingSwitchCase{
	public static void main(String[]args){
		
		Scanner myscanner = new Scanner(System.in);
		
		System.out.println("Enter the String Input:- ");
		String GreetLetter = myscanner.nextLine();
		
		switch (GreetLetter){
			case "m":
				System.out.println("Good morning!");
			break;	
			case "a":
				System.out.println("Good afternoon!");
			break;	
			case "e":
				System.out.println("Good evening!");
			break;	
			case "n":
				System.out.println("Good night!");
			break;
			default:
				System.out.println("Invalid Input!");
				
		}
	}
}
