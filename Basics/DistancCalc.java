import java.util.Scanner;
public class DistanceCalc{
	public static void main(String[]args){
		
		Scanner myscanner = new Scanner(System.in);
		
		System.out.print("Enter distance in miles: ");
		double miles = myscanner.nextDouble();
		
		double yards = miles*1760;
		System.out.println("Distance in yards: "+yards);
		
		double inches = miles*633360;
		System.out.println("Distance in inches: "+inches);
		
		double feets = miles*5280;
		System.out.println("Distance in feets: "+feets);
		
	}
	
}
