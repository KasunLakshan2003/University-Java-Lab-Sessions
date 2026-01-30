public class UnaryOperators{
	
	public static void main(String [] args){
		
		int a = 6;
		int b = 3;
		//Unary Operators
		System.out.println("a++: "+a++);
		System.out.println("b++: "+b++);
		System.out.println("++a: "+(++a));
		System.out.println("++b: "+(++b));
		
		System.out.println("a--: "+a--);
		System.out.println("b--: "+b--);
		System.out.println("--a: "+(--a));
		System.out.println("--b: "+(--b));
		
		//Arithmetic Operators
		System.out.println("a+b : "+(a+b));
		System.out.println("a-b : "+(a-b));
		System.out.println("a*b : "+(a*b));
		System.out.println("a/b : "+(a/b));
		System.out.println("a%b : "+(a%b));
		
		//Shift Operators
		System.out.println(a<<2); //a*2^2
		System.out.println(b<<3);
		System.out.println(a<<5);
		System.out.println((b<<4)+(a<<3));
		
		System.out.println(a>>2); //a/2^2
		System.out.println(b>>3);
		System.out.println(a>>5);
		System.out.println((b>>4)+(a>>3));
		
		//Assignment Operators
		int x = 10;
		System.out.println("x+=5 : "+(x+=5));
		System.out.println("x-=5 : "+(x-=5));
		System.out.println("x*=5 : "+(x*=5));
		System.out.println("x/=5 : "+(x/=5));
		System.out.println("x%=5 : "+(x%=5));
		
		//Comparison Operators
		
		int h1 = 12;
		int h2 = 14;
		
		System.out.println("h1 < h2 "+ (h1 < h2));
		System.out.println("h1 > h2 "+ (h1 > h2));
		System.out.println("h1 <= h2 "+ (h1 <= h2));
		System.out.println("h1 >= h2 "+ (h1 >= h2));
		System.out.println("h1 == h2 "+ (h1 == h2));
		System.out.println("h1 != h2 "+ (h1 != h2));
		
		//Logical operators
		
		System.out.println((h1 < h2) && (h1 == h2));
		System.out.println((h1 <= 12) && (h1 < h2));
		System.out.println((h1 != h2 )|| (h1>h2));
		System.out.println(!(h1<=12));
		
		//Conditional Operators
		
		int max = (a > b)?a:b;
		System.out.println("Maximum is: "+max);	
	}
}
