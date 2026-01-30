import java.util.Scanner;
public class DogAge{
	public static void main(String[] args){
		
		Scanner myscanner = new Scanner(System.in);
		
		System.out.print("Enter your dog's name: ");
		String name = myscanner.next();
		
		System.out.print("Enter your dog's age in human years: ");
		int age = myscanner.nextInt();
		
		System.out.printf("\n");
		
		int DogYears = age * 7;
		
		System.out.println(name + " is " + DogYears + " years old in dog years.");
	}
}
