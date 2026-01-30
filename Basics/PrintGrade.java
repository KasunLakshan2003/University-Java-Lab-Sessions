import java.util.Scanner;
public class PrintGrade{
	public static void main(String[]args){
		
		Scanner myscanner = new Scanner(System.in);
		System.out.print("Enter your marks here:- ");
		int marks = myscanner.nextInt();
		
		if(marks > 0 && marks <= 100){
			if(marks >= 75){
				System.out.println("Your grade is A");
			}else if(marks < 75 && marks >= 65){
				System.out.println("Your grade is B");
			}else if(marks < 65 && marks >= 55){
				System.out.println("Your grade is C");
			}else if(marks < 55 && marks >= 35){
				System.out.println("Your grade is S");
			}else{
				System.out.println("Your grade is F");
			}	
		}else{
			System.out.println("Entered mark is invalid");
		}
	}	
}	
