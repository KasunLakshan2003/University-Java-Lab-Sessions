import java.util.Scanner;
public class findInside{
	public static void main(String[]args){
		
		Scanner myscanner = new Scanner(System.in);
		
		System.out.println("Enter the haystack here: ");
		String hayStack = myscanner.nextLine();
		
		System.out.println("Enter the needle here: ");
		String needle = myscanner.nextLine();
		
		System.out.println(hayStack.indexOf(needle));
	}
}
