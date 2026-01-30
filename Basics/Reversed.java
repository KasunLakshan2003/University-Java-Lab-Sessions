import java.util.Scanner;
public class Reversed{
	public static void main(String[]args){
		
		Scanner myscanner = new Scanner(System.in);
		
		System.out.println("Enter the string here: ");
		String Str = myscanner.next();
		
		/*int len = Str.length();
		int newlen = len-1;
		int newlen1 = len-2;
		int newlen2 = len-3;
		int newlen3 = len-4;
		int newlen4 = len-5;
		int newlen5 = len-6;
		int newlen6 = len-7;
		int newlen7 = len-8;
		
		System.out.print(Str.charAt(newlen));
		System.out.print(Str.charAt(newlen1));
		System.out.print(Str.charAt(newlen2));
		System.out.print(Str.charAt(newlen3));
		System.out.print(Str.charAt(newlen4));
		System.out.print(Str.charAt(newlen5));
		System.out.print(Str.charAt(newlen6));
		System.out.print(Str.charAt(newlen7)); */
		
		int i = Str.length()-1;
		
		while (i >= 0){
			System.out.print(Str.charAt(i));
			i--;
		}
		

		
		
		
	}
}
