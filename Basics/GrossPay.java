import java.util.Scanner;
public class GrossPay{
	public static void main(String[] args){
		
		Scanner myscanner = new Scanner(System.in);
		
		System.out.print("Enter hours: ");
		double hours = myscanner.nextDouble();
		
		System.out.print("Enter rate: ");
		double rate = myscanner.nextDouble();
		
		double daily = hours*rate;
		
		double Weekly = daily*7;
		System.out.println("Your weekly gross pay is: "+Weekly);
		
		double Monthly = daily*30;
		System.out.println("Your monthly gross pay is: "+Monthly);
		
		double Yearly = Weekly*52;
		System.out.println("Your yearly gross pay is: "+Yearly);
	}
}
