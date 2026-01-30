import java.util.Date;
public class Column{
	public static void main(String [] args){
		/*
		String name = "Kasun";
	    int age = 22;
		System.out.printf("%-15s",name);
		System.out.printf("%5s \n",age);
		System.out.printf("%-15s",name);
		System.out.printf("%5s \n",age);
		System.out.printf("%-15s",name);
		System.out.printf("%5s \n",age);
	
		
		double num = 5.467890;
		System.out.printf("'%5.2f'%n",num);
		
		double num1 = 65.467890;
		System.out.printf("'%65.2f'%n",num1);
		*/
		Date time = new Date();
		System.out.printf("hours: %tH minutes :%tM seconds: %tS%n",time,time,time);
		System.out.printf("Date: %td Month :%tm Year: %ty%n",time,time,time);
		
		
		
				
		
	}
}
