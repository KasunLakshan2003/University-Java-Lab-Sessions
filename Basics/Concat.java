public class Concat{
	public static void main(String[]args){
		
		String firstName = "Kasun";
		String lastName = "Lakshan";
		String fullName = firstName + " " +lastName;
		String cFullName = firstName.concat(lastName);

		
		System.out.println("Concat 1: "+fullName);
		System.out.println("Concat 2: "+cFullName);
	}
}
