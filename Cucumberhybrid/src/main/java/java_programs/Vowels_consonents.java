package java_programs;

public class Vowels_consonents {

	public static void main(String[] args) {
		
		String str = "I love java programming";
		int count = 0;
		int vcount =0;
		int ccount =0;
		
		str= str.toLowerCase();
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ') {
				count++;
			}
			if(str.charAt(i)=='a'|| str.charAt(i)=='o' ||str.charAt(i)=='i' ||str.charAt(i)=='e' || str.charAt(i)=='u') {
				
				vcount++;
			}
			else
				ccount++;
		}
		
		System.out.println("total number of counts" + count);
		System.out.println("total number of vowels" + vcount);
		System.out.println("total number of consonents" + ccount);
	}
}
