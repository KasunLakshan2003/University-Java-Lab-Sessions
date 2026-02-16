import java.util.Scanner;
public class Palindrome{
	public static void main(String[]args){
		
		Scanner myscanner = new Scanner(System.in);
		String Pd = myscanner.nextLine();
		
		int len = Pd.length();
		int idx = len - 1;
		int i = 0;
		
		boolean b = true;
		
		while(i < idx){
			if(Pd.charAt(i) == Pd.charAt(idx)){
				i++;
				idx--;
				b = true;
		
			}else{
				b = false;break;
			}
		}if(b == true){
			System.out.println("This is a palindrome");
			
		}else{
			System.out.println("This is not a palindrome");
		}	
		
	}
}
