package java_programs;



public class Count_words {

	public static void Charatctercount(String name)
	{
	  int count =0;
		char[]arr = name.toCharArray();
		for(int i=0;i<arr.length;i++){
			count++;
			
		}
		System.out.println(count);
		
	}
	
	
	
	public static void main(String[] args) {
		Charatctercount("Ilovemetlif   ");
		
	}
	
}
