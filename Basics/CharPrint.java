import java.util.Scanner;
public class CharPrint{
	public static void main(String[]args){
		
		Scanner myscanner = new Scanner(System.in);
		String word = myscanner.nextLine();
		
		int len = word.length();
		int i = 0;
		
		while(i <= len - 1){
			System.out.print(word.charAt(i)+" ");
			i++;
		}
		
	}
}
