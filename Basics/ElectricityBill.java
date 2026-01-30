import java.util.Scanner;
public class ElectricityBill{
	public static void main(String[]args){
		
		Scanner myscanner = new Scanner(System.in);
		
		System.out.println("Enter total units:- ");
		double Units = myscanner.nextDouble();
		
		double Additional = 0.2;
		
		if(Units <= 50){
			double TotalBill1 = Units * 0.5;
			double FinalBill1 = TotalBill + (TotalBill * Additional);
			System.out.println("Your Total Bill Is Rs."+FinalBill1);
			
		}else if (Units <= 150){
			double newUnit1 = Units - 50;
			double TotalBill2 = (50 * 0.5)+(newUnit1 * 0.75);
			double FinalBill2 = TotalBill2 + (TotalBill2 * Additional);
			System.out.println("Your Total Bill Is Rs."+FinalBill2);
			
		}else if(Units <= 250){
			double newUnit2 = Units - 150; 
			double TotalBill3 = (50 * 0.5)+(100 * 0.75)+(newUnit2 * 1.20);
			double FinalBill3 = TotalBill3 + (TotalBill3 * Additional);
			System.out.println("Your Total Bill Is Rs."+FinalBill3);
			
		}else if(Units > 250){
			double newUnit3 = Units - 250;
			double TotalBill4= (50 * 0.5)+(100 * 0.75)+(100 * 1.20)+(newUnit3 * 1.50);
			double FinalBill4 = TotalBill4 + (TotalBill4 * Additional);
			System.out.println("Your Total Bill Is Rs."+FinalBill4);
		}
	}
}
