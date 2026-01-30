import java.util.Scanner;
public class Vowels{
	public static void main(String[]args){
		
		Scanner myscanner = new Scanner(System.in);
		
		System.out.println("Enter the string: ");
		String str = myscanner.nextLine();
		
		int a = str.indexOf('a');
		int e = str.indexOf('e');
		int i = str.indexOf('i');
		int o = str.indexOf('o');
		int u = str.indexOf('u');
		
		if(a >= 0 || e >= 0 || i >=0 || o >= 0 || u >= 0){
			System.out.println("Index of 'a': "+a);
			System.out.println("Index of 'e': "+e);
			System.out.println("Index of 'i': "+i);
			System.out.println("Index of 'o': "+o);
			System.out.println("Index of 'u': "+u);
			
		}else{
			System.out.println("No vowels in the given string");
		}
	}
}
