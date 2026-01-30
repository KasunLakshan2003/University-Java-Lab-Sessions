import java.util.Scanner;
public class FCost{
	public static void main(String [] args){
		
		Scanner myscanner = new Scanner(System.in);
		
		System.out.print("Enter length of the room: ");
		double length = myscanner.nextDouble();
		
		System.out.print("Enter width of the room: ");
		double width = myscanner.nextDouble();
		
		System.out.print("Enter cost per square root: ");
		double costPer = myscanner.nextDouble();
		
		double TotalArea = length * width;
		double TotalCost = area * costPer;
		
		System.out.print(TotalCost);
	
		
		
		
	}
}
