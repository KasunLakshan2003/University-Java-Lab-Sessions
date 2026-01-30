import java.util.Scanner;
public class StMarks{
	public static void main(String[]args){
		
		Scanner myscanner = new Scanner(System.in);
		
		System.out.print("Enter the student name: ");
		String name = myscanner.nextLine();
		
		System.out.print("Enter the Sub1 Marks: ");
		int Sub1Marks = myscanner.nextInt();
		
		System.out.print("Enter the Sub2 Marks: ");
		int Sub2Marks = myscanner.nextInt();
	
		System.out.print("Enter the Sub3 Marks: ");
		int Sub3Marks = myscanner.nextInt();
		
		System.out.print("Enter the Sub4 Marks: ");
		int Sub4Marks = myscanner.nextInt();
		
		System.out.print("Enter the Sub5 Marks: ");
		int Sub5Marks = myscanner.nextInt();
		
		System.out.print("Enter the Sub6 Marks: ");
		int Sub6Marks = myscanner.nextInt();
		
		int TotalMarks = Sub1Marks+Sub2Marks+Sub3Marks+Sub4Marks+Sub5Marks+Sub6Marks;
		
		double Percentage = TotalMarks/6.0;
		
		System.out.printf("\nName: %s\n\n",name);
		System.out.printf("Total Marks: %d%n%n",TotalMarks);
		System.out.printf("Percentage: %.2f%s%n",Percentage,"%");
		
	
		
	}
}
