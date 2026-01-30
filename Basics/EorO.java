import java.util.Scanner;
public class EorO{
	public static void main(String[]args){
		
		Scanner myscanner = new Scanner(System.in);
		System.out.print("Enter the number:- ");
		int x = myscanner.nextInt();
		
		if(x > 0 && x % 2 == 0 ){
			System.out.println("The number is even.");
		}else{
			System.out.println("The number is odd");
		}
	}
}
