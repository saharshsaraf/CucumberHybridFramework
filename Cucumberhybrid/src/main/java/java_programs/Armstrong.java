package java_programs;

public class Armstrong {

	public static void main(String[] args) {
		
		int num =15344;
		int r, sum=0;
		int temp =num;
		
		while(num>0) {
		
			r=num%10;
			num=num/10;
			sum =sum+r*r*r;
		}
		if(sum==temp)
		System.out.println("Armstrong number");
	  else 
		System.out.println("Armstrong number");	
}
	}
