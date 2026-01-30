import java.util.Scanner;
public class FindOOP{
	public static void main(String[]args){
		
		Scanner myscanner = new Scanner(System.in);
		
		System.out.println("Enter the string here: ");
		String Str = myscanner.nextLine();
		
		int FirstOOP = Str.indexOf("OOP");
		int LastOOP = Str.lastIndexOf("OOP");
		
		System.out.println("First OOP index is "+FirstOOP);
		System.out.println("Last OOP index ia "+LastOOP);
		
		System.out.println(Str.substring(FirstOOP+3,LastOOP));
		
		
		
		
	}
}
