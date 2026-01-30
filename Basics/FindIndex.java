public class findIndex{
	public static void main(String[]args){
		
		String name = "Kasun Lakshan Pathirana";
		
		System.out.println(name.indexOf('a')); //a1
		System.out.println(name.indexOf('s')); //s1
		System.out.println(name.indexOf("Pathirana")); 
		System.out.println(name.indexOf("Kasun"));
		System.out.println(name.indexOf('a',7));
		System.out.println(name.indexOf('a',11));
		System.out.println(name.indexOf("Lakshan"));
		System.out.println(name.lastIndexOf('a')); //a22
		System.out.println(name.lastIndexOf('n')); //a21
		
	}
}
