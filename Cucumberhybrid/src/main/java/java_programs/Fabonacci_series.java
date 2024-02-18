package java_programs;

import java.util.Scanner;

public class Fabonacci_series {
	public static void main(String[] args) {
		int a=0 , b= 0, c=1;
		int num=10;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("fabonacci series are :");
		
		for(int i=1;i<num;i++) {
			
			a=b;
			b=c;
			c=a+b;
			System.out.println(a +" ");
		}
		
		
		
	}

}
