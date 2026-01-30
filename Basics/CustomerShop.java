import java.util.Scanner;
public class CustomerShop{
	public static void main(String [] args){
		
		Scanner myscanner = new Scanner(System.in);
		
		System.out.println("How many items wanted to purchase?");
		int ItemCount = myscanner.nextInt();
		
		System.out.println("Price for each item?");
		int Price = myscanner.nextInt();
		
		int TotalPrice = ItemCount*Price;
		System.out.println("Total Price Is Rs."+TotalPrice);
		
		
		
		
		
	}
}
