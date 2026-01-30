public class MealPrice{
	public static void main(String[]args){
		
		double MealCost = 100;
		double TipPercent = 0.15;
		double TaxPercent = 0.08;
		
		double Additional = (MealCost*TipPercent)+(MealCost*TaxPercent);
		
		double TotalCost = Additional + MealCost;
		
		System.out.println("Total Price :- "+ TotalCost);
		
	}
}
