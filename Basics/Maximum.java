import java.util.Scanner;
public class Maximum{
	public static void main(String[]args){
		
		Scanner myscanner = new Scanner(System.in);
		
		System.out.print("Enter the first number:- ");
		int Num1 = myscanner.nextInt();
		
		System.out.println("Enter the second number:- ");
		int Num2 = myscanner.nextInt();
		
		if(Num1 > Num2){
			System.out.println("Maximum is: "+Num1);
		}else{
			System.out.println("Maximum is: "+Num2);
		}
	}
}	
