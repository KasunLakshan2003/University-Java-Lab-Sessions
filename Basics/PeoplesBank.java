import java.util.Scanner;
public class PeoplesBank{
	public static void main(String [] args){
		
		Scanner myscanner = new Scanner(System.in);
		
		System.out.println("Enter the account number :-");
		String AccNo = myscanner.next();
		
		System.out.println("Enter your current balance :-");
		double Bal = myscanner.nextInt();
		
		System.out.println("Amount need to deposite?(If no deposite enter 0");
		double Dep = myscanner.nextInt();
		
		System.out.println("Amount need to withdraw?(If no withdraw enter 0");
		double With = myscanner.nextInt();
		
		double NewBalance = Bal+Dep-With;
		System.out.println("Your New Balance Is Rs."+NewBalance);
		
		
		
	}
}
