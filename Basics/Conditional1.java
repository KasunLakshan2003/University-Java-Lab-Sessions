import java.util.Scanner;
public class Conditional1{
	public static void main(String[]args){
		
		Scanner myscanner = new Scanner(System.in);
		System.out.print("Enter the value:- ");
		int x = myscanner.nextInt();
		
		if (x>0){
			System.out.println("Inside the 1 st if argument");
		if (x>10){
			System.out.println("Inside the 2 nd if argument");	
			
		}else{
			System.out.println("Inside the else argument");
		}
		
		
	}
}}
