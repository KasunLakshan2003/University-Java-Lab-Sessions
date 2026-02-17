import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);

        System.out.print("Enter total units: ");
        double units = myscanner.nextDouble();
        
        double baseBill = 0;

        if (units <= 50) {
            baseBill = units * 0.50;
        } else if (units <= 150) {
            baseBill = (50 * 0.50) + (units - 50) * 0.75;
        } else if (units <= 250) {
            baseBill = (50 * 0.50) + (100 * 0.75) + (units - 150) * 1.20;
        } else {
            baseBill = (50 * 0.50) + (100 * 0.75) + (100 * 1.20) + (units - 250) * 1.50;
        }

        double finalBill = baseBill + baseBill * 0.20;

        System.out.println("Your final bill is Rs."+finalBill);
    }
}
