import java.util.Scanner;
public class LearnIteration1{
	public static void main(String [] args){
		
		Scanner myscanner = new Scanner(System.in);
		
		System.out.println("Enter the number of iterations: ");
		int Itr = myscanner.nextInt();
		
		for(int n = 1 ; n < Itr ; n++){
			System.out.println(n);
			
		}
	
	
	}
}
