public class Marks{
	public static void main(String[] args){
		
		int ICTMarks = 80;
		int ScienceMarks = 90;
		int MathsMarks = 95;
		
		int total = ICTMarks+ScienceMarks+MathsMarks;
		int average = total/3;
		
		if (average > 40){
			System.out.println("Pass");
			
		}else{
			System.out.println("Fail");
		}
		
		
	}
}
