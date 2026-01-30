import java.util.Scanner;
public class PrintChar{
	public static void main(String[]args){
		
		Scanner myscanner = new Scanner(System.in);
		
		System.out.println("Enter the string:");
		String mystr = myscanner.next();
		System.out.println("Enter the index you want:");
		int myindx = myscanner.nextInt();
		
		System.out.println("Enter the starting number: ");
		int strtindx = myscanner.nextInt();
		
		System.out.println("Enter the ending number; ");
		int endindx = myscanner.nextInt();
		
		int lenstr = mystr.length();
		
		if(lenstr < myindx){
			System.out.println("!!!Out of Bound!!! Enter a valid index (must be lower "+myindx+")");
		}else{
			char mychr = mystr.charAt(myindx);
		
			System.out.println("The character in "+myindx+" position is: "+mychr);
		}
		System.out.println("Characters in your range "+(mystr.substring(strtindx,endindx)));
		System.out.println("Characters in our range "+(mystr.substring(3,4)));
		
		
		
	}
	
}
