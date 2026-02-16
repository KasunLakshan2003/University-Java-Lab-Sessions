import java.util.Scanner;

public class ConversionExtend {
    public static void main(String[] args) {

        Scanner myscanner = new Scanner(System.in);

        System.out.print("Enter your decimal number: ");
        int decimal = myscanner.nextInt();

        System.out.print("Enter the base that you want to convert: ");
        int m = myscanner.nextInt();

        String Str = "";

        if(m < 2 || m > 16){
            System.out.print("Base must be between 2 and 16");
            return;
        }
        else if(decimal == 0){
            System.out.print("Conversion is : 0");
        }
        else{
            while(decimal > 0){

                int remainder = decimal % m;
                decimal = decimal / m;

                if(remainder == 10){
                    Str = "A" + Str;
                }else if(remainder == 11){
                    Str = "B" + Str;
                }else if(remainder == 12){
                    Str = "C" + Str;
                }else if(remainder == 13){
                    Str = "D" + Str;
                }else if(remainder == 14){
                    Str = "E" + Str;
                }else if(remainder == 15){
                    Str = "F" + Str;
                }else{
                    Str = remainder + Str;
                }
            }

            System.out.print("Conversion is : " + Str);
        }
    }
}
