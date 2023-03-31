package weekone.daytwo;

public class PrimeNumber {

	public static void main(String[] args) {
		int input = 13;
		boolean flag = false;
		
		for (int i = 2; i < input/2; i++) {
			if(input%i ==0) {
				flag=true;
			}
		}
				if(!flag) {
					System.out.println("The given number "+input+ " is prime number");
				}
				else {
					System.out.println("The given number "+input+ " is not a prime number");
				}
		
	}

}
