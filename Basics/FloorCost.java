import java.util.Scanner;
public class FloorCost{
	public static void main(String [] args){
		
		Scanner myscanner = new Scanner(System.in);
		
		System.out.print("Enter length of the room: ");
		double length = myscanner.nextDouble();
		
		System.out.print("Enter width of the room: ");
		double width = myscanner.nextDouble();
		
		System.out.print("Enter cost per square root: ");
		double costPer = myscanner.nextDouble();
		
		double TotalArea = length * width;
		double TotalCost = TotalArea * costPer;
		
		System.out.print("Flooring Cost is Rs."+TotalCost);
	
		
		
		
	}
}
