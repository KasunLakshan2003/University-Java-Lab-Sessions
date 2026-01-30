import java.util.Scanner;
public class Triangle{
	public static void main(String[]args){
		
		Scanner myscanner = new Scanner(System.in);
		
		System.out.println("Enter the length of side 1: ");
		int Side1L = myscanner.nextInt();
		
		System.out.println("Enter the length of side 2: ");
		int Side2L = myscanner.nextInt();
		
		System.out.println("Enter the length of side 3: ");
		int Side3L = myscanner.nextInt();
		
		System.out.println("Enter the angle 1: ");
		int Angle1 = myscanner.nextInt();
		
		System.out.println("Enter the angle 2: ");
		int Angle2 = myscanner.nextInt();
		
		System.out.println("Enter the angle 3: ");
		int Angle3 = myscanner.nextInt();
		
		int SumOfAngles = Angle1 + Angle2 + Angle3;
		
		if (SumOfAngles == 180){
			if(Side1L + Side2L > Side3L){
				System.out.println("Triangle is valid");
			}else if(Side1L + Side3L > Side2L){
				System.out.println("Triangle is valid");
			}else if(Side2L + Side3L > Side1L){
				System.out.println("Triangle is valid");
			}else{
				System.out.println("Triangle is invalid");
			}
		}
	}
}	
