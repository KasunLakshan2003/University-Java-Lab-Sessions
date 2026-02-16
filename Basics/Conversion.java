import java.util.Scanner;
public class Conversion{
	public static void main(String[]args){
		
		Scanner myscanner = new Scanner(System.in);
		
		System.out.print("Enter your decimal number: ");
		
		int decimal = myscanner.nextInt();
		String Str = "" ;
		
		if(decimal == 0){

			System.out.println("Conversion is : 0");
		}else{

			while(decimal > 0){
			
			int remainder = decimal % 2;
			decimal = decimal / 2;
			
			Str = remainder + Str ;
			
		}
		
			System.out.print("The binary value is: " + Str);

		}
		
		
	}
}
