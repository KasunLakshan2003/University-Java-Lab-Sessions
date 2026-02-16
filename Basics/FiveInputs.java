import java.util.Scanner;
public class FiveInputs{
	public static void main(String[]args){
		
		Scanner myscanner = new Scanner(System.in);
		
		int sum = 0;
		
		for (int i = 1 ; i <= 5 ; i++){
			System.out.println("Enter the number "+i);
			int num = myscanner.nextInt();
			sum+=num;
				
		}System.out.println("Sum is: "+sum);
	}
}
