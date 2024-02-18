package java_programs;

public class Prime_Num {
	public static void main(String[] args) {

		int num = 4;

		boolean prime = true;
		for(int i=2;i<num;i++) {
			if(num%i==0) {

				prime = false;
				break;
			}


		}

		System.out.println(prime);

	}
}
