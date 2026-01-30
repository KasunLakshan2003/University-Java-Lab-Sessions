import java.util.Scanner;
public class Temprature{
	public static void main(String[]args){
		
		Scanner myscanner = new Scanner(System.in);
		System.out.print("Enter the temprature:- ");
		int Temp = myscanner.nextInt();
		
		if(Temp >= 0 && Temp <36){
			if( Temp >= 0 && Temp <= 5 ){
				System.out.println("Freezing");
			}else if ( Temp > 5 && Temp <= 10){
				System.out.println("Cold");
			}else if (Temp >18 && Temp <= 18){
				System.out.println("Cool");
			}else if (Temp > 18 && Temp <= 25){
				System.out.println("Warm or Mild");
			}else if (Temp > 25 && Temp <= 35){
				System.out.println("Hot");
			}else{
				System.out.println("Scorching");
			}
		}else{
			System.out.println("The temprature you entered invalid");
		}

	}
}	
