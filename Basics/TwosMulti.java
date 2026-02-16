import java.util.Scanner;
public class TwosMulti{
	public static void main(String[]args){
		
		Scanner myscanner = new Scanner(System.in);
		System.out.println("Enter the range: ");
		int range = myscanner.nextInt();
		int Multi = 1;
		
		for(int i = 1 ; i <=range ; i++){
			if(i % 2 == 00){
				Multi = i * Multi;
			}
		}System.out.println("Twos Multiples: "+Multi);
		
	}
}
