import java.util.Scanner;
public class CheckDiv{
	public static void main(String[]args){
		
		Scanner myscanner = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int Num = myscanner.nextInt();
		
		if(Num % 5 == 0 && Num % 11 == 0){
			System.out.println("The given number is divisible by 5 and 11.");
		}else{
			System.out.println("The given number is non divisible by 5 and 11.");
		}
	}
}	
