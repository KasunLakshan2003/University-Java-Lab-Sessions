import java.util.Scanner;
public class Factorial{
	public static void main(String[]args){
		Scanner myscanner = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int Num = myscanner.nextInt();
		
		long result = 1;
		
		if (Num == 0 ){
			system.out.println("Zero factorial is: "+result);
		}else{
			for (int i = 1 ; i <= Num ; i++){
			result=result*i;
			}	
		}System.out.println("Factorial is: "+result);
	}
}
