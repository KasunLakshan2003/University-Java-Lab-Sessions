import java.util.Scanner;
public class Fencing{
	public static void main(String [] args){
		
		Scanner myscanner = new Scanner(System.in);
		
		System.out.print("Enter length of the yard: ");
		double length = myscanner.nextDouble();
		
		System.out.print("Enter width of the yard: ");
		double width = myscanner.nextDouble();
		
		System.out.print("Enter cost per foot of fencing: ");
		double costPer = myscanner.nextDouble();
		System.out.println("\n");
		double Perimeter = 2 * (length+width);
		double TotalCost = Perimeter * costPer;
		
		System.out.println("Perimeter: "+Perimeter);
		System.out.println("Total Cost is Rs."+TotalCost);
	
		
		
		
	}
}
