import java.util.Scanner;
public class PaintWalls{
	public static void main(String [] args){
		
		Scanner myscanner = new Scanner(System.in);
		
		System.out.print("Enter the length: ");
		double len = myscanner.nextDouble();
		
		System.out.print("Enter the width: ");
		double width = myscanner.nextDouble();
		
		System.out.print("Enter the height: ");
		double height = myscanner.nextDouble();
		
		System.out.print("Enter the price of a gallon: ");
		double price = myscanner.nextDouble();
		
		System.out.print("Enter the number of square feet a gallon will cover: ");
		double gallonCoverage = myscanner.nextDouble();
		
		double area = ((2*len*height)+(2*width*height));
		
		double NumOfGallons = area / gallonCoverage;
		int roundedGallons = (int)(NumOfGallons+0.99999);
		
		System.out.println("Number of gallons: "+roundedGallons);
		
		double cost = price * roundedGallons;
		System.out.println("Total cost: "+cost);
		
		
	}
}
