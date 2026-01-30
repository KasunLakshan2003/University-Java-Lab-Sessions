import java.util.Scanner;
public class Greeting{
	public static void main ( String [] args){
		
		Scanner myscanner = new Scanner(System.in);
		
		System.out.println("Enter your name here!!");
		String name = myscanner.next();
		
		System.out.println("Enter your level");
		int level = myscanner.nextInt();
		
		System.out.println("Welcome "+name+" for the level "+level+" in the Department of Computer Science!");
	}
}
