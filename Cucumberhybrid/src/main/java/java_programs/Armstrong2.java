package java_programs;

public class Armstrong2 {

	public static void main(String[] args) {

	int num =153;
	int r ,sum =0;
	int temp=num;
	
	while(num>0) {
		
		r=num%10;
		sum= sum+(r*r*r);
		num=num/10;
	}
	if(sum==temp)
		System.out.println("Armstrong number");
	  else 
		System.out.println("Not Armstrong number");	

	}

}
