package java_programs;

//Total char in a string =>


public class count_2{

	public static void main(String ags[]){

		String name = "My name is saharsh saraf";
		int count =0;
		name.toLowerCase();
		char[] arr = name.toCharArray();
	
		for(int i=0;i<arr.length;i++){
			count++;
		}

		System.out.println(count);
	}

}
