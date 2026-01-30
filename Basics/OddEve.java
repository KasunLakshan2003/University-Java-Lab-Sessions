import java.util.Scanner;
public class OddEve{
	public static void main(String [] args){
		
		Scanner myscanner = new Scanner(System.in);
		
		System.out.println("Enter the number:- ");
		int Num = myscanner.nextInt();
		int Modulus = Num % 2;
		
		switch(Modulus){
			case 0:
				System.out.println("This is a even number");
			break;
				
			case 1:
				System.out.println("This is a odd number");
			break;		
		}
		}
}
