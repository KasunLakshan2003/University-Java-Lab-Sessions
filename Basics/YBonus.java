import java.util.Scanner;
public class YBonus{
	public static void main(String [] args){
		
		Scanner myscanner = new Scanner(System.in);
		
		System.out.println("Enter the total of the bill:- ");
		double Bill = myscanner.nextDouble();
		
		System.out.println("Enter the point on the card:- ");
		double CardPoints = myscanner.nextDouble();
		
		
		
		if (Card_Points=<100){
			double bonus1 = Bill*0.1;
			System.out.println("Your bonus:- "+ bonus1);
			System.out.println("New Bill Value Is Rs." +(Bill-bonus1));
		}else{
			double bonus2 = Bill*0.15;
			System.out.println("Your bonus:- "+ bonus2);
			System.out.println("New Bill Value Is Rs." +(Bill-bonus2));
		}
	}
}
