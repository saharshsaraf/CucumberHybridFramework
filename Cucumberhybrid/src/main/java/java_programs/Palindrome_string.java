package java_programs;

public class Palindrome_string {

	public static void main(String[] args) {
		
		String name = "sasa";
		String rev ="";
		String temp=name;
		int leng = name.length();
		
		for(int i=leng-1;i>=0;i--) {
			rev= rev+name.charAt(i);
			
		}
		if(rev.equals(temp)) {
			
			System.out.println("its a palindrome string");
		}
		else
			System.out.println("its not a palindrome string");
		//System.out.println(rev);
		
		
		
	}
}
