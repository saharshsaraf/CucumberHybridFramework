package java_programs;

public class Reverse_string {

	public static void main(String[] args) {

		String name = "saharsh";
		String rev ="";
		int leng = name.length();
		
		for(int i=leng-1;i>=0;i--) {
			rev= rev+name.charAt(i);
			
		}
		System.out.println(rev);
		
		
		
		
		
//		int length = name.length();
//		String rev ="";
//		for(int i=length-1;i>=0;i--) {
//			
//			rev = rev+name.charAt(i);
//		}
//		System.out.println(rev);
//		
	}

}
